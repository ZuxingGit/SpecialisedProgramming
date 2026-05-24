public class Solution941 {
    public boolean validMountainArray(int[] arr) {
        if (arr.length < 3) {
            return false;
        }

        int i = 0;

        while (i + 1 < arr.length && arr[i] < arr[i + 1]) {
            i++;
        }

        if (i == 0 || i == arr.length - 1) {
            return false;
        }

        while (i + 1 < arr.length && arr[i] > arr[i + 1]) {
            i++;
        }

        return i == arr.length - 1;
    }

    public static void main(String[] args) {
        Solution941 solution = new Solution941();

        int[] arr1 = { 2, 1 };
        System.out.println(solution.validMountainArray(arr1)); // Output: false

        int[] arr2 = { 3, 5, 5 };
        System.out.println(solution.validMountainArray(arr2)); // Output: false

        int[] arr3 = { 0, 3, 2, 1 };
        System.out.println(solution.validMountainArray(arr3)); // Output: true
    }
}
