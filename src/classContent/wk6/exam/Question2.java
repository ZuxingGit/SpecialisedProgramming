package classContent.wk6.exam;

public class Question2 {
    public static void main(String[] args) {
        System.out.println(minOperationsCount(3));
        System.out.println(minOperationsCount(1));
        System.out.println(minOperationsCount(6));
        System.out.println(minOperationsCount(15));
        System.out.println(minOperationsCount(20));
        System.out.println(minOperationsCount(100));
        System.out.println(minOperationsCount(27));
        System.out.println(minOperationsCount(98));
        System.out.println(minOperationsCount(932));
        System.out.println(minOperationsCount(728));
        System.out.println(minOperationsCount(302));
        System.out.println(minOperationsCount(37));
        System.out.println(minOperationsCount(1000));
        System.out.println(minOperationsCount(10000));
        System.out.println(minOperationsCount(3003));
        System.out.println(minOperationsCount(3204));
    }

    public static int minOperationsCount(int n) {
        if (n < 1 || n > 10000) {
            System.err.println("Wrong parameter range!");
            return 0;
        }

        if (n == 1)
            return 0;

        return nextActionNumber(1, n, 1);
    }

    /**
     * @param now      characters now I have
     * @param dest     target
     * @param minPaste the current number on my paste board
     * @return the number of following actions
     */
    public static int nextActionNumber(int now, int dest, int minPaste) {
        if (now == dest)
            return 0;

        /*number of actions*/
        final int COPY = 1;
        final int PASTE = 1;
        final int COPY_PASTE = 2;

        if (now * 2 <= dest && (dest % now >= now || dest % now == 0)) {
            minPaste = now;
            now = now * 2;
            return COPY_PASTE + nextActionNumber(now, dest, minPaste);
        } else {
            now = now + minPaste;
            return PASTE + nextActionNumber(now, dest, minPaste);
        }
    }
}
