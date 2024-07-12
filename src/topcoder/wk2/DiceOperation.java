package topcoder.wk2;

public class DiceOperation {
    public static void main(String[] args) {
        int[] a0 = { 1, 1, 1, 1, 1};
        int[] a1 = { 1, 1, 1, 1, 1, 1};
        int[] a2 = { 3, 3};
        int[] a3 = { 3, 4};
        int[] a4 = { 5, 9, 6};
        int[] a5 = { 47 };
        // getCombinations(a1);
        // System.out.println(getXOR(1, 2));
        System.out.println(solve(a0));
        System.out.println(solve(a1));
        System.out.println(solve(a2));
        System.out.println(solve(a3));
        System.out.println(solve(a4));
        System.out.println(solve(a5));
    }

    public static double solve(int[] dices) {
        int number = dices.length; // number of dices
        if (number == 0)
            return 0;
        if (number == 1) {
            int faces = dices[0];
            return (faces + 1) / 2;
        }

        double expectV = 0;
        int product = 1;
        for(int n: dices){
            product *= n;
        }

        double sum = recursiveSum(0, 0, dices);
        expectV = sum/product;

        return expectV;
    }

    public static int recursiveSum(int sum0, int index, int[] dices) {
        int sum1 = 0;
        int faces = dices[index];
        for(int i=1; i<= faces; i++) {
            if (index < dices.length-1) {
                sum1 += recursiveSum(getXOR(sum0, i), index+1, dices);
            } else {
                sum1 += getXOR(sum0, i); 
            }
        }

        return sum1;
    }

    public static int getXOR(int a, int b) {
        return a ^ b;
    }
}
