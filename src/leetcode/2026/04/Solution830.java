import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution830 {
    public List<List<Integer>> largeGroupPositions(String s) {
        String[] groups = s.split("(?<=(.))(?!\\1)");
        List<List<Integer>> result = new ArrayList<>();
        int index = 0;
        for (String group : groups) {
            if (group.length() >= 3) {
                result.add(Arrays.asList(index, index + group.length() - 1));
            }
            index += group.length();
        }
        return result;
    }

    public static void main(String[] args) {
        Solution830 solution = new Solution830();

        String s1 = "abbxxxxzzy";
        List<List<Integer>> result1 = solution.largeGroupPositions(s1);
        System.out.println(result1); // Output: [[3, 6]]

        String s2 = "abc";
        List<List<Integer>> result2 = solution.largeGroupPositions(s2);
        System.out.println(result2); // Output: []

        String s3 = "abcdddeeeeaabbbcd";
        List<List<Integer>> result3 = solution.largeGroupPositions(s3);
        System.out.println(result3); // Output: [[3, 5], [6, 9], [12, 14]]
    }
}
