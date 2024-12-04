public class Problema1 {

    public static void main(String[] args) {
        
        int[] casilla = {2, 3, 1, 5, 7, 6, 21, 7, 11, 9, 0, 2};

      
        casilla[11] = casilla[3] + casilla[11];

       
        casilla[5] = casilla[1] + casilla[9];

        casilla[12] = casilla[12] * casilla[12];

        
        if (casilla[5] == casilla[10]) {
            
            casilla[12] = casilla[12] - 2;
        } else {
           
            casilla[5] = casilla[5] + casilla[2];
        }

        
        casilla[8] = casilla[7] - casilla[5];

        
        casilla[6] = casilla[12] + casilla[8];

      
        System.out.println("The number in casilla 6 is: " + casilla[6]);
    }
}