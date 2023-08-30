package classContent.wk6.exam;

public class Question1 {
    public static void main(String[] args) {
        System.out.println("result:" + minSquareGems(12));
        System.out.println("result:" + minSquareGems(13));
        System.out.println("result:" + minSquareGems(9999));
        System.out.println("result:" + minSquareGems(169));
        System.out.println("result:" + minSquareGems(135));
        System.out.println("result:" + minSquareGems(30));
        System.out.println("result:" + minSquareGems(28));
        System.out.println("result:" + minSquareGems(30000));
        System.out.println("result:" + minSquareGems(70000));
        System.out.println("result:" + minSquareGems(100000));
        System.out.println("result:" + minSquareGems(125));
        System.out.println("result:" + minSquareGems(79));
        System.out.println("result:" + minSquareGems(50));
        System.out.println("result:" + minSquareGems(75));
        System.out.println("result:" + minSquareGems(785));
        System.out.println("result:" + minSquareGems(9800));
    }

    /**
     * @param n serect number
     * @return how many gems I need to unlock
     */
    public static int minSquareGems(int n) {
        if (n == 1) {
            System.out.print("1 ");
            return 1;
        }

        return processSum(0, n, 0);
    }

    /**
     * @param now     now the sum is
     * @param left    the left number to achieve
     * @param maximum max value I used in the process
     * @return the number of following steps
     */
    public static int processSum(int now, int left, int maximum) {
        if (left == 0) {
            return 0;
        }

        int i = 1;
        while (Math.pow(i, 2) < left) {
            i++;
        }
        if (Math.pow(i, 2) == left) {
//            System.out.print("one more:" + Math.pow(i, 2));
            return 1;
        }
        int change = (int) Math.pow(i - 1, 2);

        // if the smaller change has smaller steps, then choose the smaller one
        if (i > 2 && 
                (processSum(now + change, left - change, Math.max((int) Math.pow(i - 1, 2), maximum))
                > processSum(now + (int) Math.pow(i - 2, 2), left - (int) Math.pow(i - 2, 2), Math.max((int) Math.pow(i - 2, 2), maximum)))) {
            change = (int) Math.pow(i - 2, 2);
            return 1 + processSum(now + change, left - change, Math.max(change, maximum));
        }
        //
        return 1 + processSum(now + change, left - change, Math.max((int) Math.pow(i - 1, 2), maximum));
    }

}
