package searching;
public class BinarySearch {
    public static int search(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // Return the index if the target is found
            } else if (arr[mid] < target) {
                left = mid + 1; // Search the right half of the array
            } else {
                right = mid - 1; // Search the left half of the array
            }
        }

        return -1; // Return -1 if the target is not found in the array
    }

    public static void main(String[] args) {
        int[] array = { 1, 3, 4, 6, 7, 8, 9, 11, 15, 18 };
        int targetValue = 7;

        int result = search(array, targetValue);

        if (result != -1) {
            System.out.println("Target value " + targetValue + " found at index: " + result);
        } else {
            System.out.println("Target value " + targetValue + " not found in the array.");
        }
    }
}
