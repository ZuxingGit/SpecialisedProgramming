package leetcode.wk1;

import java.util.ArrayList;
import java.util.Arrays;

public class ValidParentheses {
    public static void main(String[] args) {
        String s0 = "([]){}";
        System.out.println(isValid(s0));
    }

    public static boolean isValid(String s) {
        if (s.isEmpty()) return false;
        do {
            s = s.replace("()", "");
            s = s.replace("[]", "");
            s = s.replace("{}", "");
        } while (s.contains("()") || s.contains("[]") || s.contains("{}"));
        if (s.length() > 0)
            return false;

        return true;
    }


}
