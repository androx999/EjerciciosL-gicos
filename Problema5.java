public class Problema5{

    public static void main(String[] args) {
        
        int[] casillas = {16, 1, 4, 3, 7, 7, 5, 2, 8, 11};
        int objetivo = casillas[6] + casillas[7] + casillas[8] + casillas[9]; 
        
        
        for (int posibleValor5 = 1; posibleValor5 <= 100; posibleValor5++) { 
            casillas[4] = posibleValor5; 
            int casilla2 = 0; 

            
            while (true) {
                casilla2 += casillas[9]; 

                if (casillas[4] > casilla2) { 
                    continue; 
                } else {
                    casillas[4] -= casilla2; 
                    break; 
                }
            }

           
            if (casilla2 == objetivo) {
                System.out.println("El valor correcto para la casilla 5 es: " + posibleValor5);
                break; 
            }
        }
    }
}
