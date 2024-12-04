public class Problema3 {
    public static void main(String[] args) {
        
        int[] casillas = {8, 6, 5, 7, 3, 2, 2, 11, 10, 2, 4, 1};

        
        casillas[10] += 1;

       
        casillas[9] = casillas[0];

        
        if (casillas[9] % 2 != 0) {
           
            casillas[9] += 2;
        } else {
            
            casillas[9] = casillas[0];
        }

      
        casillas[10] += casillas[4];

        
        casillas[9] -= casillas[11];

        
        if (casillas[9] < casillas[11]) {
            
            casillas[9] = casillas[0];
        }

      
        System.out.println("El número en la casilla 8 es: " + casillas[7]);
        System.out.println("El número en la casilla 9 es: " + casillas[8]);
        
    }
}
