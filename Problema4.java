public class Problema4 {

    public static void main(String[] args) {
        
        int[] cells = {12, 7, 2, 3, 19, 6, 0, 1, 72, 3, 9};

        
        cells[9] = cells[12] - cells[12]; 
        cells[9] = cells[12] - cells[10]; 

     
        cells[3] = 10;

        
        System.out.println("The number in cell 3 should be: " + cells[3]);
    }
}