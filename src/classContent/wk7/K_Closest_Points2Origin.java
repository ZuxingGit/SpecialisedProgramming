package classContent.wk7;

import java.util.*;

public class K_Closest_Points2Origin {
    public static void main(String[] args) {
        int[][] points1 = {{1, 3}, {-2, 2}};
        int[][] points2 = {{3, 3}, {5, -1}, {-2, 4}};
        int[][] points3 = {{0, 1}, {1, 0}};
        System.out.println(Arrays.deepToString(kClosest(points1,1)));
        System.out.println(Arrays.deepToString(kClosest(points2,2)));
        System.out.println(Arrays.deepToString(kClosest(points3,2)));
    }

    public static int[][] kClosest(int[][] points, int k) {
        ArrayList<Double> res = new ArrayList<>(); //store distance^2
        HashMap<Double, List<int[]>> resMap = new HashMap<>(); //store <distance^2, point>
        int[][] resArray = new int[k][];
        int n = points.length;
        for (int i = 0; i < n; i++) {
            int[] point = points[i];
            Double length2pow = (Math.pow(point[0], 2) + Math.pow(point[1], 2));
            res.add(length2pow);
            if (resMap.containsKey(length2pow)) {
                List<int[]> l = resMap.get(length2pow);
                l.add(point);
                resMap.put(length2pow,l);
            } else {
                List<int[]> l = new ArrayList<>();
                l.add(point);
                resMap.put(length2pow, l);
            }
        }
        Collections.sort(res);
        for (int i = 0; i < k; ) {
            Double key=res.get(i);
            List<int[]> l = resMap.get(key);
            for (int[] point:l
                 ) {
                resArray[i++]=point;
            }
        }
        return resArray;
    }
}
