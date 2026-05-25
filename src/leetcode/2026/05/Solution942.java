public class Solution942 {
    public int[] diStringMatch(String s) {
        int n = s.length();
        int low = 0;
        int high = n;
        int[] result = new int[n + 1];

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'I') {
                result[i] = low++;
            } else {
                result[i] = high--;
            }
        }

        result[n] = low; // At this point, low and high should be equal

        return result;
    }

    public static void main(String[] args) {
        Solution942 solution = new Solution942();

        String s1 = "IDID";
        int[] result1 = solution.diStringMatch(s1);
        System.out.print("Output for s1: ");
        for (int num : result1) {
            System.out.print(num + " ");
        }
        System.out.println(); // Output: [0, 4, 1, 3, 2]

        String s2 = "III";
        int[] result2 = solution.diStringMatch(s2);
        System.out.print("Output for s2: ");
        for (int num : result2) {
            System.out.print(num + " ");
        }
        System.out.println(); // Output: [0, 1, 2, 3]

        String s3 = "DDI";
        int[] result3 = solution.diStringMatch(s3);
        System.out.print("Output for s3: ");
        for (int num : result3) {
            System.out.print(num + " ");
        }
        System.out.println(); // Output: [3, 2, 0, 1]
    }
}
