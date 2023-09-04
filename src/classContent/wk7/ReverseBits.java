package classContent.wk7;

public class ReverseBits {
    public static void main(String[] args) {
//        String n1 = "00000010100101000001111010011100";
//        String n2 = "11111111111111111111111111111101";
        String n3 = "11111111111111111111111111111111";
        int i1 = 964176192;
//        int i2= 3221225471;
        System.out.println(Integer.MAX_VALUE);
        System.out.println(decimalToBinary(Integer.MAX_VALUE));
        System.out.println(decimalToBinary((int) (Math.pow(2,31)-1)));
        System.out.println(decimalToBinary((int) (Math.pow(2,32)-1)));
        System.out.println(decimalToBinary((int) (Math.pow(2,32)-Math.pow(2,31))).length());
//        System.out.println(decimalToBinary((Math.pow(2,32)-Math.pow(2,31))));
        System.out.println(decimalToBinary((int) (Math.pow(2,31)-Math.pow(2,30))));


    }

    public static int reverseBits(int n) {
        int res = 0;
//        int max = (int) (Math.pow(2,31)-Math.pow(2,30));
        for (int i = 0; i < 32; i++) {
            res = (res << 1) | (n & 1);
            n = n >> 1;
        }
        return res;
    }

    // Function converting decimal to binary
    public static String decimalToBinary(int num) {
        // Creating and assigning binary array size
        int[] binary = new int[33];
        int id = 0;

        // Number should be positive
        while (num > 0) {
            binary[id++] = num % 2;
            num = num / 2;
        }

        // Print Binary
        // Iteration over array
        StringBuilder sb = new StringBuilder();
        for (int i = id - 1; i >= 0; i--)
            sb.append(binary[i]);

        return sb.toString();
    }

}
