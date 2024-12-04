public class Problema10 {
    public static char determineLetter(int number) {
        if (number > 1) {
            if (number > 2) {
                return 'A'; // Ponga la letra A en la casilla 4
            } else {
                return 'B'; // Ponga la letra B en la casilla 4
            }
        } else {
            if (number > 0) {
                return 'C'; // Ponga la letra C en la casilla 4
            } else {
                return 'D'; // Ponga la letra D en la casilla 4
            }
        }
    }

    public static void main(String[] args) {
        int[] testNumbers = {3, 2, 1, 0, 4};
        for (int number : testNumbers) {
            char letter = determineLetter(number);
            System.out.println("For number " + number + ", place letter: " + letter);
        }
    }
}