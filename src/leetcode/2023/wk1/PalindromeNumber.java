package leetcode.wk1;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(2310132));
    }

    /**
     * whether x is palindrome number
     * @param x
     * @return true or false
     */
    public static boolean isPalindrome(int x){
        if (x<0)
            return false;
        String str= String.valueOf(x);
        String des = "";
        int length = str.length();
        for (int i = 0; i < length; i++) {
            des = des+String.valueOf(str.charAt(length-1-i));
        }
        if (des.equals(str))
            return true;
        
        return false;
    }
}
