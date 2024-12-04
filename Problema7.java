public class Problema7 {
    public static void main(String[] args) {
        int[] boxes = new int[12]; 
        boxes[5] = 0; 

        
        boxes[1] = 0; 
        boxes[10] = 0; 

        
        boxes[5] += boxes[1]; 

       
        if (boxes[1] < boxes[10]) {
            // Instruction 4
            boxes[5] += boxes[9]; 
        } else {
            
            boxes[1] += 1; 
        }

        
        boxes[9] -= 1; 

        
        System.out.println("Final value in box 10: " + boxes[10]);
    }
}