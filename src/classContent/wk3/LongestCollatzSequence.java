package classContent.wk3;

import java.util.HashMap;

public class LongestCollatzSequence {
    public static void main(String[] args) {
        System.out.println(getLongestCollatzSequence());
    }

    public static Long getLongestCollatzSequence() {
        Long maxlength = 1L;
        Long number = 100000L;
        for (Long i = number; i > 1; i--) {
            Long tmp = i;
            Long length = 1L;
            HashMap<Long, Long> hm= new HashMap<Long, Long>();
            while (tmp != 1) {
                if (hm.containsKey(tmp)){
                    length+=hm.get(tmp);
                }
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
            hm.put(number, maxlength);
        }

        System.out.println("This number is:" + number);
        return maxlength;
    }
}
