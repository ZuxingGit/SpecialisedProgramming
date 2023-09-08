package classContent.wk7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        int[] candidates1 = {2, 3, 6, 7};
        int target1 = 7;
        int[] candidates2 = {2, 3, 5};
        int target2 = 8;
        int[] candidates3 = {2};
        int target3 = 1;
//        List<List<Integer>> result1 = combinationSum(candidates1, target1);
//        List<List<Integer>> result2=combinationSum(candidates2,target2);
//        List<List<Integer>> result3=combinationSum(candidates3,target3);
        System.out.println(combinationSum(candidates1, target1).toString());
        System.out.println(combinationSum(candidates2,target2).toString());
        System.out.println(combinationSum(candidates3,target3).toString());
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        if (candidates == null || candidates.length == 0)
            return null;

        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        getCombinations(result, new ArrayList<Integer>(), candidates, target, 0);
        return result;
    }

    public static void getCombinations(List<List<Integer>> result, List<Integer> currentList, int[] candidates, int target, int start) {
//        List<List<Integer>> result = new ArrayList<>();
        if (target < 0) return;
        if (target == 0) {
            result.add(new ArrayList<Integer>(currentList));
        }

        for (int i = start; i < candidates.length; i++
        ) {
            if (i > start && candidates[i] == candidates[i - 1])
                continue;

            currentList.add(candidates[i]);
            getCombinations(result, currentList, candidates, target - candidates[i], i);
            currentList.remove(currentList.size() - 1);
        }
//        currentList.remove(currentList.size()-1);
    }
}
