public class Problema5{

    public static void main(String[] args) {
        // Initial values for the casillas
        int[] casillas = {16, 1, 4, 3, 7, 7, 5, 2, 8, 11};
        int objetivo = casillas[6] + casillas[7] + casillas[8] + casillas[9]; // Sum of casillas 7, 8, 9, 10
        
        // Iterate through possible values of casilla 5
        for (int posibleValor5 = 1; posibleValor5 <= 100; posibleValor5++) { // Test range for casilla 5
            casillas[4] = posibleValor5; // Update casilla 5
            int casilla2 = 0; // Initialize casilla 2 as per Instruction 1

            // Execute the flow
            while (true) {
                casilla2 += casillas[9]; // Instruction 2: Add casilla 10 to casilla 2

                if (casillas[4] > casilla2) { // Instruction 3: Compare casilla 5 with casilla 2
                    continue; // Go back to Instruction 2
                } else {
                    casillas[4] -= casilla2; // Instruction 4: Modify casilla 5
                    break; // End the process
                }
            }

            // Check if the final casilla 2 matches the objective
            if (casilla2 == objetivo) {
                System.out.println("El valor correcto para la casilla 5 es: " + posibleValor5);
                break; // Solution found
            }
        }
    }
}
