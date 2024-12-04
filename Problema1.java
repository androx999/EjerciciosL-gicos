public class Problema1 {

    public static void main(String[] args) {
        // Initialize the casilla array with the given values
        int[] casilla = {2, 3, 1, 5, 7, 6, 21, 7, 11, 9, 0, 2};

        // Step 1:
        casilla[11] = casilla[3] + casilla[11];

        // Step 2:
        casilla[5] = casilla[1] + casilla[9];

        // Step 3:
        casilla[12] = casilla[12] * casilla[12];

        // Step 4:
        if (casilla[5] == casilla[10]) {
            // Step 5:
            casilla[12] = casilla[12] - 2;
        } else {
            // Step 6:
            casilla[5] = casilla[5] + casilla[2];
        }

        // Step 7:
        casilla[8] = casilla[7] - casilla[5];

        // Step 8:
        casilla[6] = casilla[12] + casilla[8];

        // Print the result
        System.out.println("The number in casilla 6 is: " + casilla[6]);
    }
}