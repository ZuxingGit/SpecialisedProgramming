package leetcode.wk1;

public class romanToInteger {
    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("XIV"));
        System.out.println(romanToInt("MMCDLXXVIII"));
    }

    /**
     * @author Shiyang Xu
     * @param s
     * @return
     */
    public static int romanToInt(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'I') {
                if (i < s.length() - 1 && s.charAt(i + 1) == 'V') {
                    sum = sum + 4;
                    i++;
                } else if (i < s.length() - 1 && s.charAt(i + 1) == 'X') {
                    sum = sum + 9;
                    i++;
                } else {
                    sum = sum + 1;
                }
            } else if (s.charAt(i) == 'X') {
                if (i < s.length() - 1 && s.charAt(i + 1) == 'L') {
                    sum = sum + 40;
                    i++;
                } else if (i < s.length() - 1 && s.charAt(i + 1) == 'C') {
                    sum = sum + 90;
                    i++;
                } else {
                    sum = sum + 10;
                }
            } else if (s.charAt(i) == 'C') {
                if (i < s.length() - 1 && s.charAt(i + 1) == 'D') {
                    sum = sum + 400;
                    i++;
                } else if (i < s.length() - 1 && s.charAt(i + 1) == 'M') {
                    sum = sum + 900;
                    i++;
                } else {
                    sum = sum + 100;
                }
            } else if (s.charAt(i) == 'V') {
                sum = sum + 5;
            } else if (s.charAt(i) == 'L') {
                sum = sum + 50;
            } else if (s.charAt(i) == 'D') {
                sum = sum + 500;
            } else {
                sum = sum + 1000;
            }
        }
        return sum;
    }
}