public class Solution657 {
    public boolean judgeCircle(String moves) {
        int x = 0, y = 0;
        for (char move : moves.toCharArray()) {
            switch (move) {
                case 'U':
                    y++;
                    break;
                case 'D':
                    y--;
                    break;
                case 'L':
                    x--;
                    break;
                case 'R':
                    x++;
                    break;
            }
        }
        return x == 0 && y == 0;
    }

    public static void main(String[] args) {
        Solution657 solution = new Solution657();

        String moves1 = "UD";
        System.out.println(solution.judgeCircle(moves1)); // Should print true

        String moves2 = "LL";
        System.out.println(solution.judgeCircle(moves2)); // Should print false
    }
}
