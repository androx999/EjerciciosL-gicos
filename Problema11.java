public class Problema11{
    public static void main(String[] args) {
        int[] boxes = {0, 0, 0, 0, 0}; // Initialize boxes with 0s
        
        // Example Input - Change these values to test with different inputs
        boxes[3] = 5;
        boxes[4] = 1;
        boxes[5] = 3;
        
        // Algorithm Implementation -  The modification is in instruction 5
        if (boxes[3] > boxes[4]) {
            boxes[1] = boxes[3];
            boxes[3] = boxes[4];
            boxes[4] = boxes[1];
        }
        if (boxes[4] > boxes[1]) {
            boxes[3] = boxes[4];
            boxes[4] = boxes[1];
        }
        if (boxes[5] < boxes[4]) { // Modified instruction 5
            boxes[1] = boxes[4];
            boxes[4] = boxes[5];
            boxes[5] = boxes[1];
        }

        // Output results
        System.out.println("Box 3: " + boxes[3]);
        System.out.println("Box 4: " + boxes[4]);
        System.out.println("Box 5: " + boxes[5]);
    }
}