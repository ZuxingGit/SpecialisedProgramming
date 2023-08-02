package classContent.wk2.exam;

public class Question1 {
    public static void main(String[] args) {
        System.out.println(determineBallColor(1, 1, 1, 3));
        System.out.println(determineBallColor(3, 4, 5, 4));
        System.out.println(determineBallColor(7, 7, 1, 7));
        System.out.println(determineBallColor(1000000000000L, 1, 1, 1000000000002L));
        System.out.println(determineBallColor(653, 32, 1230, 556));
        System.out.println(determineBallColor(271281576404L, 789227539981L, 962212822048L, 1863718050608L));
    }

    public static String determineBallColor(long r, long g, long b, long k) {
        if ((r < 1) || (r > 1000000000000L)
                || (g < 1) || (g > 1000000000000L)
                || (b < 1) || (b > 1000000000000L) || k > (r + g + b)) {
            return "invalid parameter! no output!";
        }
        final String red = "RED";
        final String green = "GREEN";
        final String blue = "BLUE";
        // the process of destroy
        String nextColor = "";
        for (int i = 1; i < k; i++) {
            if ((nextColor == "" || nextColor.equals(red)) && r > 0) {
                r = r - 1;
                if (g > 0) {
                    nextColor = green;
                    if (r==0&&b==0)
                        return nextColor;
                } else if (b > 0) {
                    nextColor = blue;
                    if (r==0&&g==0)
                        return nextColor;
                } else if (r > 0) {
                    nextColor = red;
                    if (g==0&&b==0)
                        return nextColor;
                } else
                    return "Sorry, already destroyed all!";
            }else if (nextColor.equals(green) && g > 0) {
                g = g - 1;
                if (b > 0) {
                    nextColor = blue;
                    if (g==0&&r==0)
                        return nextColor;
                } else if (r > 0) {
                    nextColor = red;
                    if (g==0&&b==0)
                        return nextColor;
                } else if (g > 0) {
                    nextColor = green;
                    if (r==0&&b==0)
                        return nextColor;
                } else
                    return "Sorry, already destroyed all!";
            }else if (nextColor.equals(blue) && b > 0) {
                b = b - 1;
                if (r > 0) {
                    nextColor = red;
                    if (g==0&&b==0)
                        return nextColor;
                } else if (g > 0) {
                    nextColor = green;
                    if (r==0&&b==0)
                        return nextColor;
                } else if (b > 0) {
                    nextColor = blue;
                    if (g==0&&r==0)
                        return nextColor;
                } else
                    return "Sorry, already destroyed all!";
            }
        }

        return nextColor;
    }
}
