package leetcode.wk4;

public class FibonacciNumber {
    public static void main(String[] args) {
        System.out.println(fib(2));
        System.out.println(fib(3));
        System.out.println(fib(4));
        System.out.println(fib(5));
    }

    public static int fib(int n) {
        if (n==0)
            return 0;
        if (n==1)
            return 1;
        
        if (n<0||n>30)
            System.err.println("wrong input!");
        
        return fib(n-2)+fib(n-1);
    }
}
