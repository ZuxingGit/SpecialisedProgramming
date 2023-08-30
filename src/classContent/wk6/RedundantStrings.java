package classContent.wk6;

public class RedundantStrings {
    public static void main(String[] args) {
        System.out.println(howMany(1));
        System.out.println(howMany(2));
        System.out.println(howMany(4));
        System.out.println(howMany(10));
        System.out.println(howMany(30));
    }

    public static int howMany(int length) {
        if (length == 1)
            return 0;

        int result = 0;
        for (int i = 1; i < length; i++) {
            if (length % i == 0)
                result += Math.pow(2, i) - howMany(i);
        }

        return result;
    }

    public static boolean isRedundant(String s) {
        int length = s.length();
        if (length == 1)
            return false;

        for (int i = 1; i < length - 1; i++) {
            String tmpStr = s;
            if (length % i == 0) {
                String substr = s.substring(0, i);
                while (tmpStr.contains(substr)) {
                    tmpStr = tmpStr.replaceFirst(substr, "");
                }
                if (tmpStr.isEmpty() || tmpStr == "" || tmpStr == null) {
                    return true;
                }
            } else {
                return false;
            }
        }

        return false;
    }
}
