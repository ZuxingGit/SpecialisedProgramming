package wk1;

public class FunnyFence {
    public static void main(String[] args) {
        String s0 = "|-|-|";
        String s1 = "-|-|-|-";
        String s2 = "||||||";
        String s3 = "|-||-|-";
        String s4 = "|-|---|-|---|-|";
        String s5 = "|||-||--|--|---|-||-|-|-|--||---||-||-||-|--||";
        getFence(s0);
        getFence(s1);
        getFence(s2);
        getFence(s3);
        getFence(s4);
        getFence(s5);
    }

    /**
     * the longest consecutive substring of it that is a fence, and return its length
     *
     * @param s
     * @return its length
     */
    public static int getFence(String s) {
        int maxLength = 1;
        int length = 1;
        if (s.isEmpty()) return 0;
        for (int i = 0; i < s.length() - 1; i++) {
//            a fence consists of alternating '|' and '-' characters
            if (s.charAt(i) != s.charAt(i + 1)) {
                length++;
            } else {
                if (length > maxLength) {
                    maxLength = length;
                }
                length = 1;
            }

        }
        if (length > maxLength) {
            maxLength = length;
        }
        System.out.println(s);
        System.out.println(maxLength);
        return maxLength;
    }
}
