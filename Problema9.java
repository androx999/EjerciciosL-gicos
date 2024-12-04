public class Problema9{

    public static char determineLetter(int cell1, int cell2, int cell3) {
        if (cell3 < cell1) {
            if (cell2 < cell1) {
                if (cell3 < cell1) {
                    return 'G';
                } else {
                    return 'C';
                }
            } else {
                return 'C'; // If cell 2 is not smaller than cell 1
        } else {
            if (cell3 < cell2) {
                return 'C'; // If cell 3 is smaller than cell 2
            } else {
                return 'G'; // If cell 3 is not smaller than both
            }
        }
    }

    public static void main(String[] args) {
        int cell1 = 3;
        int cell2 = 1;
        int cell3 = 2;

        char result = determineLetter(cell1, cell2, cell3);
        System.out.println("The letter placed in cell 4 is: " + result);
    }
}