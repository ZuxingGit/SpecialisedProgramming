public class Solution492 {
    public int[] constructRectangle(int area) {
        int width = (int) Math.sqrt(area);
        while (area % width != 0) {
            width--;
        }
        int length = area / width;
        return new int[] { length, width };
    }

    public static void main(String[] args) {
        Solution492 solution = new Solution492();

        int area1 = 4;
        int[] result1 = solution.constructRectangle(area1);
        System.out.println("Length: " + result1[0] + ", Width: " + result1[1]);

        int area2 = 37;
        int[] result2 = solution.constructRectangle(area2);
        System.out.println("Length: " + result2[0] + ", Width: " + result2[1]);

        int area3 = 122122;
        int[] result3 = solution.constructRectangle(area3);
        System.out.println("Length: " + result3[0] + ", Width: " + result3[1]);
    }
}
