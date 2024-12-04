public class Problema2 {

    public static void main(String[] args) {
        
        int[] casilla = {8, 13, 1, 6, 2, 5, 13, 6, 4, 7, 5, 2, 6, 7, 9};

        
        casilla[1] = casilla[4] - casilla[casilla[7]];
        casilla[1] += casilla[6];
        if (casilla[1] % 4 == 0) {
            
            casilla[1] += casilla[casilla[11]];
        }
        if (casilla[2] > casilla[casilla[2]]) {
            casilla[10] -= 2;
        }

        
        System.out.println("Casilla 1: " + casilla[1]);
        System.out.println("Casilla 6: " + casilla[6]);
    }
}