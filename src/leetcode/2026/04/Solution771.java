public class Solution771 {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        for (char jewel : jewels.toCharArray()) {
            for (char stone : stones.toCharArray()) {
                if (jewel == stone) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Solution771 solution = new Solution771();

        String jewels = "aA";
        String stones = "aAAbbbb";
        int output = solution.numJewelsInStones(jewels, stones);
        System.out.println("Output: " + output);

        jewels = "z";
        stones = "ZZ";
        output = solution.numJewelsInStones(jewels, stones);
        System.out.println("Output: " + output);
    }
}
