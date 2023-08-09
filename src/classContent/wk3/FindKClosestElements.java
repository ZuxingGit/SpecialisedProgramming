package classContent.wk3;

import java.util.*;
import java.util.stream.Collectors;

public class FindKClosestElements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println(findClosestElements(arr, 4, 3));
        System.out.println(findClosestElements(arr, 4, 1));
    }

    public static List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> resList = new ArrayList<>();
        List<Integer> souList = Arrays.stream(arr).boxed().collect(Collectors.toList());
        List<Integer> tmpList = new ArrayList<>(souList);
        tmpList.add(x);
        Collections.sort(tmpList);
        while (!tmpList.isEmpty() && resList.size() < k) {
            Integer closest = souList.get(0);
            int index = 0;
            int position = tmpList.indexOf(x);
            if (position == 0) {
                if (tmpList.size() > 1) {
                    closest = tmpList.get(position + 1);
                    index = position + 1;
                } else {
                    closest = tmpList.get(0);
                    index = 0;
                }
                tmpList.remove(index);
                resList.add(closest);
                continue;
            }
            if (position == tmpList.size() - 1) {
                if (tmpList.size() > 1) {
                    closest = tmpList.get(position - 1);
                    index = position - 1;
                } else {
                    closest = tmpList.get(0);
                    index = 0;
                }
                tmpList.remove(index);
                resList.add(closest);
                continue;
            }
            int left = tmpList.get(position - 1);
            int right = tmpList.get(position + 1);
            if (Math.abs(x - left) <= Math.abs(x - right)) {
                closest = left;
                index = position - 1;
            } else {
                closest = right;
                index = position + 1;
            }

            tmpList.remove(index);
            resList.add(closest);
        }

        Collections.sort(resList);
        return resList;
    }
}
