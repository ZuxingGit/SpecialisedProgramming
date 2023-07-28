package topcoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InterestingDigits {
    public static void main(String[] args) {
        for (int i = 3; i < 31; i++) {
            System.out.print("#");
            System.out.println(i);
            System.out.println(Arrays.toString(digits(i)));
        }
    }

    /**
     * @param base
     * @return an intersiting number whose sum of every digit is a multiple of itself
     */
    public static int[] digits(int base) {
        List<Integer> list = new ArrayList<>();
        if (base < 3 || base > 30)
            return new int[]{};

        for (int i = 2; i < base; i++) {    //2~(base-1)
            int sum=0;
            for (int n = 2; n < 1000; n++) {    //0, 1 meaningless
                int num=n*i;
                sum=sumDigits(num, base);
                if (sum%i!=0)
                    break;
            }
            if (sum%i==0)
                list.add(i);
        }
        
        if (list.size()<1)
            return new int[]{};
        Integer[] res= list.toArray(new Integer[0]);
        return Arrays.stream(res).mapToInt(Integer::intValue).toArray();
    }
    
    /**
     * 
     * @param number
     * @param base
     * @return the sum of digits from this number
     */
    public static int sumDigits(int number, int base){
        int sum=0;
        do {
            sum+=number%base;
            number=number/base;
        } while (number>0);
        
        return sum;
    }
}
