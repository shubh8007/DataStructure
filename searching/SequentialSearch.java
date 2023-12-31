package searching;
public class SequentialSearch {
    public static int search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Return the index if the target is found
            }
        }
        return -1; // Return -1 if the target is not found in the array
    }

    public static void main(String[] args) {
        int[] array = { 5, 2, 7, 1, 8, 4, 9, 3, 6 };
        int targetValue = 4;

        int result = search(array, targetValue);

        if (result != -1) {
            System.out.println("Target value " + targetValue + " found at index: " + result);
        } else {
            System.out.println("Target value " + targetValue + " not found in the array.");
        }
    }
}
