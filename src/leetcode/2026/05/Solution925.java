public class Solution925 {
    public boolean isLongPressedName(String name, String typed) {
        int i = 0; // Pointer for name
        int j = 0; // Pointer for typed

        while (i < name.length() && j < typed.length()) {
            if (name.charAt(i) == typed.charAt(j)) {
                i++;
                j++;
            } else if (j > 0 && typed.charAt(j) == typed.charAt(j - 1)) {
                j++;
            } else {
                return false;
            }
        }

        if (j != typed.length()) {
            while (j < typed.length()) {
                if (typed.charAt(j) != typed.charAt(j - 1)) {
                    return false;
                }
                j++;
            }
        }

        // Check if all characters in name were matched
        return i == name.length();
    }

    public static void main(String[] args) {
        Solution925 solution = new Solution925();

        String name1 = "alex";
        String typed1 = "aaleex";
        boolean result1 = solution.isLongPressedName(name1, typed1);
        System.out.println("Output: " + result1); // Output: true

        String name2 = "saeed";
        String typed2 = "ssaaedd";
        boolean result2 = solution.isLongPressedName(name2, typed2);
        System.out.println("Output: " + result2); // Output: false

        String name3 = "alex";
        String typed3 = "aaleexa";
        boolean result3 = solution.isLongPressedName(name3, typed3);
        System.out.println("Output: " + result3); // Output: false
    }
}
