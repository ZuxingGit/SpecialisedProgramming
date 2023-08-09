package classContent.wk3;

public class LongestCollatzSequence {
    public static void main(String[] args) {
        System.out.println(getLongetCollatzSequence());
    }

    public static int getLongetCollatzSequence() {
        int maxlength = 1;
        int number = 1000000;
        for (int i = number; i > 1; i--) {
            int tmp = i;
            int length = 1;
            while (tmp != 1) {
                if (tmp % 2 == 0) {
                    tmp = tmp / 2;
                    length++;
                } else {
                    tmp = 3 * tmp + 1;
                    length++;
                }
            }
            if (length > maxlength) {
                maxlength = length;
                number = i;
            }
        }

        System.out.println("This number is:" + number);
        return maxlength;
    }
}
