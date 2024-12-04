public class EjercicioA{

    public static void main(String[] args) {
        // Initialize the casillas array
        int[] casillas = {6, 3, 9, 2, 11, 2, 91, 48, 66, 1};

        // Step 1: Sum casillas 4 and 2, store in casilla 7
        casillas[7] = casillas[4] + casillas[2];

        // Step 2: Sum casillas 7 and 6, store in casilla 6
        casillas[6] = casillas[7] + casillas[6];

        // Step 3: Multiply casillas 6 and 1, store in casilla 5
        casillas[5] = casillas[6] * casillas[1];

        // Print the final value of casilla 5
        System.out.println("El número en la casilla 5 es: " + casillas[5]);
    }
}