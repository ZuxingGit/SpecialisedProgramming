public class Soultion733 {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int originalColor = image[sr][sc];
        if (originalColor != color) {
            fill(image, sr, sc, originalColor, color);
        }
        return image;
    }

    private void fill(int[][] image, int sr, int sc, int originalColor, int color) {
        if (sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length || image[sr][sc] != originalColor) {
            return;
        }
        image[sr][sc] = color;
        fill(image, sr + 1, sc, originalColor, color);
        fill(image, sr - 1, sc, originalColor, color);
        fill(image, sr, sc + 1, originalColor, color);
        fill(image, sr, sc - 1, originalColor, color);
    }

    public static void main(String[] args) {
        Soultion733 solution = new Soultion733();

        int[][] image = { { 1, 1, 1 }, { 1, 1, 0 }, { 1, 0, 1 } };
        int sr = 1, sc = 1, color = 2;
        int[][] output = solution.floodFill(image, sr, sc, color);
        System.out.println("Output:");
        for (int[] row : output) {
            System.out.println(java.util.Arrays.toString(row));
        }

        image = new int[][] { { 0, 0, 0 }, { 0, 0, 0 } };
        sr = 0;
        sc = 0;
        color = 2;
        output = solution.floodFill(image, sr, sc, color);
        System.out.println("Output:");
        for (int[] row : output) {
            System.out.println(java.util.Arrays.toString(row));
        }
    }
}
