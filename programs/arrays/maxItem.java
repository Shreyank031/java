public class maxItem {
    public static void main(String[] args) {
        // Array containing integers
        int[] array = { 2, 5, 922, 32, 12, 121, 99, 118 };
        // Call the max method and print the result
        System.out.println(max(array));

        System.out.println(maxRange(array, 3, 6));
    }

    // Method to find the maximum element in an array
    static int max(int[] arr) {
        // Initialize the maximum item with the first element of the array
        int MaxItem = arr[0];
        // Iterate through the array starting from the second element
        for (int i = 1; i < arr.length; i++) {
            // Check if the current element is greater than the current maximum item
            if (arr[i] > MaxItem) {
                // Update the maximum item if the current element is greater
                MaxItem = arr[i];
            }
        }
        // Return the maximum item found in the array
        return MaxItem;
    }

    static int maxRange(int[] arr, int start, int end) {
        int maxItem = arr[start];
        for (int i = start + 1; i <= end; i++) {
            if (arr[i] > maxItem) {
                maxItem = arr[i];
            }
        }
        return maxItem;
    }
}
