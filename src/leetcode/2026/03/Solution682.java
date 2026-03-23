public class Solution682 {
    public int calPoints(String[] operations) {
        int[] points = new int[operations.length];
        int index = 0;

        for (String op : operations) {
            if (op.equals("C")) {
                if (index > 0) {
                    index--;
                }
            } else if (op.equals("D")) {
                if (index > 0) {
                    points[index] = 2 * points[index - 1];
                    index++;
                }
            } else if (op.equals("+")) {
                if (index > 1) {
                    points[index] = points[index - 1] + points[index - 2];
                    index++;
                }
            } else {
                points[index] = Integer.parseInt(op);
                index++;
            }
        }

        int totalPoints = 0;
        for (int i = 0; i < index; i++) {
            totalPoints += points[i];
        }
        return totalPoints;
    }

    public static void main(String[] args) {
        Solution682 solution = new Solution682();

        String[] operations0 = { "5", "2", "C", "D", "+" };
        System.out.println(solution.calPoints(operations0)); // Should print 30

        String[] operations1 = { "5", "-2", "4", "C", "D", "9", "+", "+" };
        System.out.println(solution.calPoints(operations1)); // Should print 27

        String[] operations2 = { "1", "C" };
        System.out.println(solution.calPoints(operations2)); // Should print 0
    }
}
