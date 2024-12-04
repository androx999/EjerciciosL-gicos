public class EjercicioB{

    public static void main(String[] args) {
        // Initialize the casilla array with the given values
        int[] casilla = {3, 7, 2, 1, 5, 12, 4, 0};

        // Step 1: Copy the value of casilla 8 to casilla 1
        casilla[0] = casilla[7];

        // Step 2: Add the values of casilla 1 and casilla 2, and store the result in casilla 1
        casilla[0] += casilla[1];

        // Step 3: Increment the second number in the instruction in casilla 2
        casilla[2]++;

        // Step 4: Check if the second number in casilla 2 is greater than the value in casilla 7
        if (casilla[2] > casilla[6]) {
            // If true, print the value of casilla 1
            System.out.println("El número en la casilla 1 es: " + casilla[0]);
        } else {
            // If false, print a message indicating that the condition is not met
            System.out.println("El segundo número de casilla 2 no es mayor que el valor en la casilla 7.");
        }
    }
}