import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution599 {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }
        int minSum = Integer.MAX_VALUE;
        List<String> result = new ArrayList<>();
        for (int j = 0; j < list2.length; j++) {
            if (map.containsKey(list2[j])) {
                int sum = map.get(list2[j]) + j;
                if (sum < minSum) {
                    minSum = sum;
                    result.clear();
                    result.add(list2[j]);
                } else if (sum == minSum) {
                    result.add(list2[j]);
                }
            }
        }
        return result.toArray(new String[0]);
    }

    public static void main(String[] args) {
        Solution599 solution = new Solution599();

        String[] list1 = { "Shogun", "Tapioca Express", "Burger King", "KFC" };
        String[] list2 = { "Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun" };
        String[] result1 = solution.findRestaurant(list1, list2);
        for (String restaurant : result1) {
            System.out.println(restaurant); // Should print "Shogun"
        }

        String[] list3 = { "Shogun", "Tapioca Express", "Burger King", "KFC" };
        String[] list4 = { "KFC", "Shogun", "Burger King" };
        String[] result2 = solution.findRestaurant(list3, list4);
        for (String restaurant : result2) {
            System.out.println(restaurant); // Should print "Shogun"
        }
    }
}
