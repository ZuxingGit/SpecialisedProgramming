public class Solution495 {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int total = 0;
        for (int i = 0; i < timeSeries.length; i++) {
            if (i == 0 || timeSeries[i] >= timeSeries[i - 1] + duration) {
                total += duration;
            } else {
                total += timeSeries[i] + duration - (timeSeries[i - 1] + duration);
            }
        }
        return total;
    }

    public static void main(String[] args) {
        Solution495 solution = new Solution495();

        int[] timeSeries1 = { 1, 4 };
        int duration1 = 2;
        int result1 = solution.findPoisonedDuration(timeSeries1, duration1);
        System.out.println("Total Poisoned Duration: " + result1);

        int[] timeSeries2 = { 1, 2 };
        int duration2 = 2;
        int result2 = solution.findPoisonedDuration(timeSeries2, duration2);
        System.out.println("Total Poisoned Duration: " + result2);
    }
}
