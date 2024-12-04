public class Problema6 {

    public static void main(String[] args) {
        int[] cells = new int[14]; 
        cells[3] = 1; 
        cells[4] = 2; 
        cells[6] = 3; 
        cells[7] = 4; 
        cells[9] = 5; 
        cells[10] = 6; 
        cells[12] = 7; 
        cells[13] = 13; 

        
        while (cells[1] < 6) { 
            cells[3] *= 2; 
            cells[6] *= 2; 
            cells[9] *= 2; 
            cells[12] *= 2; 
            cells[1] = Math.max(cells[1], Math.max(cells[4], Math.max(cells[7], Math.max(cells[10], cells[13])))); // Update cell 1
        }

        System.out.println("The largest value in cell 1 is: " + cells[1]);
    }
}