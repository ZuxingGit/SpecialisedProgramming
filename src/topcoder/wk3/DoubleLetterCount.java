package topcoder.wk3;

import java.util.Arrays;

public class DoubleLetterCount {
    public static void main(String[] args) {
        String s1="MISS";
        String s2="COMMITTEE";
        String s3="AABAAC";
        String s4="ABCDEFG";
        String s5="AXXBCYWWYDEFZZ";
        System.out.println(count(s1));
        System.out.println(count(s2));
        System.out.println(count(s3));
        System.out.println(count(s4));
        System.out.println(count(s5));
    }
    
    public static int count(String s){
        char[] charArr= s.toCharArray();
        int size=s.length();
        int count=0;
        for (int i = 0; i < size-1; i++) {
            if (charArr[i]==charArr[i+1]){
                count++;
                i++;
            }
        }
        return count;
    }
}
