public class Solution482 {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int count = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (c != '-') {
                if (count == k) {
                    sb.append('-');
                    count = 0;
                }
                sb.append(Character.toUpperCase(c));
                count++;
            }
        }

        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        Solution482 solution = new Solution482();

        String s1 = "5F3Z-2e-9-w";
        int k1 = 4;
        System.out.println("Formatted license key: " + solution.licenseKeyFormatting(s1, k1));

        String s2 = "2-5g-3-J";
        int k2 = 2;
        System.out.println("Formatted license key: " + solution.licenseKeyFormatting(s2, k2));
    }
}
