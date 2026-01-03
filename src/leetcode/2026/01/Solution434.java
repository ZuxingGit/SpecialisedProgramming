public class Solution434 {
    public int countSegments(String s) {
        int count = 0;
        boolean inSegment = false;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                if (!inSegment) {
                    count++;
                    inSegment = true;
                }
            } else {
                inSegment = false;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Solution434 solution = new Solution434();

        String test1 = "Hello, my name is John";
        System.out.println("Number of segments in \"" + test1 + "\": " + solution.countSegments(test1));

        String test2 = "   Leading and trailing spaces   ";
        System.out.println("Number of segments in \"" + test2 + "\": " + solution.countSegments(test2));

        String test3 = "SingleWord";
        System.out.println("Number of segments in \"" + test3 + "\": " + solution.countSegments(test3));

        String test4 = "    ";
        System.out.println("Number of segments in \"" + test4 + "\": " + solution.countSegments(test4));

        String test5 = "";
        System.out.println("Number of segments in \"" + test5 + "\": " + solution.countSegments(test5));
    }
}
