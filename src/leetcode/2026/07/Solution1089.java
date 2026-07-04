
public class Solution1089 {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        int zerosToDuplicate = 0;
        int length = n - 1;

        for (int i = 0; i <= length - zerosToDuplicate; i++) {
            if (arr[i] == 0) {
                if (i == length - zerosToDuplicate) {
                    arr[length] = 0;
                    length--;
                    break;
                }
                zerosToDuplicate++;
            }
        }

        int last = length - zerosToDuplicate;

        for (int i = last; i >= 0; i--) {
            if (arr[i] == 0) {
                arr[i + zerosToDuplicate] = 0;
                zerosToDuplicate--;
                arr[i + zerosToDuplicate] = 0;
            } else {
                arr[i + zerosToDuplicate] = arr[i];
            }
        }
    }

    public static void main(String[] args) {
        Solution1089 solution = new Solution1089();

        int[] arr1 = { 1, 0, 2, 3, 0, 4, 5, 0 };
        solution.duplicateZeros(arr1);
        for (int num : arr1) {
            System.out.print(num + " ");
        }
        System.out.println();

        int[] arr2 = { 1, 2, 3 };
        solution.duplicateZeros(arr2);
        for (int num : arr2) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
