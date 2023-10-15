package classContent.wk10;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MaximumNumberOfEventsThatCanBeAttended {
    public static void main(String[] args) {
        int[][] et1 = {{1, 2}, {2, 3}, {3, 4}};
        int[][] et2 = {{1, 2}, {2, 3}, {3, 4}, {1, 2}};
        int[][] et3 = {{1, 5}, {1, 5}, {1, 5}, {2, 3}, {2, 3}};
        int[][] et4 = {{52, 79}, {7, 34}};
        int[][] et5 = {{1, 1}, {26, 27}, {17, 17}, {1, 2}, {4, 7}, {16, 16}, {20, 23}, {8, 9}, {17, 19}, {4, 4}, {15, 15}, {23, 27}, {28, 31}, {25, 26}, {25, 29}, {30, 33}};
        int[][] et6 = {{27, 29}, {28, 32}, {3, 3}, {24, 25}, {7, 7}, {22, 25}, {14, 15}, {13, 17}, {1, 2}, {7, 7}, {10, 12}, {9, 13}, {21, 25}, {20, 21}, {20, 22}, {19, 20}, {27, 28}, {9, 9}, {21, 24}, {18, 21}, {6, 10}, {29, 30}, {22, 24}};

//        System.out.println(maxEvents(et1));
//        System.out.println(maxEvents(et2));
        System.out.println(maxEvents(et3));
        System.out.println(maxEvents(et4));
        System.out.println(maxEvents(et5));
        System.out.println(maxEvents(et6));
    }

    public static int maxEvents(int[][] events) {
        Arrays.sort(events, Comparator.comparingInt(e -> e[0]));
        int count = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        int length = events.length;
        if (length == 0)
            return 0;

        int i = 0, day = 0;
        while (i < length || !queue.isEmpty()) {
            if (queue.isEmpty()) {
                day = events[i][0];
            }
            while (i < length && day == events[i][0]) {
                queue.add(events[i][1]);
                i++;
            }
            queue.poll();
            day++;
            count++;
            while (!queue.isEmpty() && day > queue.peek()) {
                queue.poll();
            }
        }
        return count;
    }
}