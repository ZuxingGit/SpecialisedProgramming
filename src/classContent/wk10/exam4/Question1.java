package classContent.wk10.exam4;

public class Question1 {
    public static void main(String[] args) {
        int i = 1;
        String s1 = "XYXY";
        String s2 = "YXYXYX";
        String s3 = "XXXXXXXX";
        String s4 = "YYYYYYYY";
        String s5 = "XYXYXYXY";
        String s6 = "YXYXYXYX";
        String s7 = "XXXXYXXX";
        String s8 = "YYYYXYYY";
        String s9 = "XYXYXYYX";
        String s10 = "YXXYYXXY";
        String s11 = "XXYXXYXX";
        String s12 = "YYXYYXYY";
        String s13 = "XYXYYXYXYXYX";
        String s14 = "YXYXYXYXYXYX";
        String s15 = "XXXXXYXXXXYXXXXX";
        String s16 = "YYYYYXYYYYXYYYYY";
        System.out.println("Test case" + i++ + ": " + maxPoint(s1));
        System.out.println("Test case" + i++ + ": " + maxPoint(s2));
        System.out.println("Test case" + i++ + ": " + maxPoint(s3));
        System.out.println("Test case" + i++ + ": " + maxPoint(s4));
        System.out.println("Test case" + i++ + ": " + maxPoint(s5));
        System.out.println("Test case" + i++ + ": " + maxPoint(s6));
        System.out.println("Test case" + i++ + ": " + maxPoint(s7));
        System.out.println("Test case" + i++ + ": " + maxPoint(s8));
        System.out.println("Test case" + i++ + ": " + maxPoint(s9));
        System.out.println("Test case" + i++ + ": " + maxPoint(s10));
        System.out.println("Test case" + i++ + ": " + maxPoint(s11));
        System.out.println("Test case" + i++ + ": " + maxPoint(s12));
        System.out.println("Test case" + i++ + ": " + maxPoint(s13));
        System.out.println("Test case" + i++ + ": " + maxPoint(s14));
        System.out.println("Test case" + i++ + ": " + maxPoint(s15));
        System.out.println("Test case" + i++ + ": " + maxPoint(s16));
    }

    public static int maxPoint(String s) {
        if (s.length() < 2)
            return 0;

        if (!s.contains("XY") && !s.contains("YX"))
            return 0;

        if (s.contains("XY")) {
            if (s.contains("YX")) {
                return Math.max(1 + maxPoint(s.replaceFirst("XY", "YZ")),
                        1 + maxPoint(s.replaceFirst("YX", "ZY")));
            } else {
                return 1 + maxPoint(s.replaceFirst("XY", "YZ"));
            }
        } else {
            if (s.contains("YX")) {
                return 1 + maxPoint(s.replaceFirst("YX", "ZY"));
            }
        }
        return 0;
    }
}
