public class Problema2 {

    public static void main(String[] args) {
        // Initialize the array with the given numbers
        int[] casilla = {8, 13, 1, 6, 2, 5, 13, 6, 4, 7, 5, 2, 6, 7, 9};

        // Follow the instructions in the flowchart
        casilla[1] = casilla[4] - casilla[casilla[7]];
        casilla[1] += casilla[6];
        if (casilla[1] % 4 == 0) {
            // Instruction 2 changes
            casilla[1] += casilla[casilla[11]];
        }
        if (casilla[2] > casilla[casilla[2]]) {
            casilla[10] -= 2;
        }

        // Print the final values for casilla 1 and 6
        System.out.println("Casilla 1: " + casilla[1]);
        System.out.println("Casilla 6: " + casilla[6]);
    }
}