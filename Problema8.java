public class Problema8{

    public static void main(String[] args) {
        int[] numbers = {3, 2, 1}; // The numbers to be sorted
        
        // Apply the sorting algorithm based on the flowchart
        sort(numbers); 

        // Print the sorted array 
        System.out.println("Sorted array: " + Arrays.toString(numbers));
    }

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    // Swap the numbers
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}