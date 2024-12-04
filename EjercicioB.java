public class EjercicioB{

    public static void main(String[] args) {
  
        int[] casilla = {3, 7, 2, 1, 5, 12, 4, 0};

       
        casilla[0] = casilla[7];

       
        casilla[0] += casilla[1];

        
        casilla[2]++;

        
        if (casilla[2] > casilla[6]) {
           
            System.out.println("El número en la casilla 1 es: " + casilla[0]);
        } else {
            
            System.out.println("El segundo número de casilla 2 no es mayor que el valor en la casilla 7.");
        }
    }
}