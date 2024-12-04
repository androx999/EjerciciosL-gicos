public class EjercicioA{

    public static void main(String[] args) {
        
        int[] casillas = {6, 3, 9, 2, 11, 2, 91, 48, 66, 1};

        
        casillas[7] = casillas[4] + casillas[2];

        
        casillas[6] = casillas[7] + casillas[6];

        
        casillas[5] = casillas[6] * casillas[1];

        
        System.out.println("El número en la casilla 5 es: " + casillas[5]);
    }
}