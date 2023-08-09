package classContent.wk3;

public class I000IstPrime {
    public static void main(String[] args) {
        System.out.println(I000IstPrime());
    }

    public static int I000IstPrime() {

        int count = 10001;
        int number = 1;

        while (count>0){
            number++;
            int i=1;
            for (; i <= number; i++) {
                if (number % i == 0 && number != i && 1 != i) {
                    break;
                }
            }
            if ((i-1)==number) {
                count--;
            }
        }
        
        return number;
    }
}
