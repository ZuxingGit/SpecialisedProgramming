package leetcode.wk1;

public class Roman2Integer {
    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("XIV"));
        System.out.println(romanToInt("MMCDLXXVIII"));
    }

    public static int romanToInt(String s) {
        int res = 0;
        final int V = 5;
        final int X = 10;
        final int L = 50;
        final int C = 100;
        final int D = 500;
        final int M = 1000;
       
//        "MCMXCIV" CMXCIV XCIV IV I
        int centre = s.indexOf("M");
        if (centre == -1) {
            centre = s.indexOf("D");
            if (centre == -1) {
                centre = s.indexOf("C");
                if (centre == -1) {
                    centre = s.indexOf("L");
                    if (centre == -1) {
                        centre = s.indexOf("X");
                        if (centre == -1) {
                            centre = s.indexOf("V");
                            if (centre == -1) {
                                res = s.length();
                            } else if (centre > 0) {
                                res = res + V - romanToInt(s.substring(0, centre)) + romanToInt(s.substring(centre + 1));
                            } else
                                res = res + V + romanToInt(s.substring(centre + 1));
                        } else if (centre > 0) {
                            res = res + X - romanToInt(s.substring(0, centre)) + romanToInt(s.substring(centre + 1));
                        } else
                            res = res + X + romanToInt(s.substring(centre + 1));
                    } else if (centre > 0) {
                        res = res + L - romanToInt(s.substring(0, centre)) + romanToInt(s.substring(centre + 1));
                    } else
                        res = res + L + romanToInt(s.substring(centre + 1));
                } else if (centre > 0) {
                    res = res + C - romanToInt(s.substring(0, centre)) + romanToInt(s.substring(centre + 1));
                } else
                    res = res + C + romanToInt(s.substring(centre + 1));
            } else if (centre > 0) {
                res = res + D - romanToInt(s.substring(0, centre)) + romanToInt(s.substring(centre + 1));
            } else
                res = res + D + romanToInt(s.substring(centre + 1));
        } else if (centre > 0) {
            res = res + M - romanToInt(s.substring(0, centre)) + romanToInt(s.substring(centre + 1));
        } else
            res = res + M + romanToInt(s.substring(centre + 1));
        
        return res;
    }
}