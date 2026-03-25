#include <unordered_map>
#include <vector>
// #include <algorithm>
#include <cstdio>

using namespace std;

class Solution {
public:
    int findShortestSubArray(vector<int>& nums) {
        int degree = 0, minLength = nums.size();
        unordered_map<int, int> countMap;
        unordered_map<int, int> firstIndexMap;

        for (int i=0; i<nums.size(); i++) {
            int num = nums[i];
            countMap[num]++;
            if (firstIndexMap.find(num) == firstIndexMap.end()) {
                firstIndexMap[num] = i;
            }
            if (countMap[num] > degree) {
                degree = countMap[num];
                minLength = i - firstIndexMap[num] + 1;
            } else if (countMap[num] == degree) {
                minLength = min(minLength, i - firstIndexMap[num] + 1);
            }
        }
        return minLength;
    }
};

int main() {
    Solution sol;

    vector<int> nums = {1, 2, 2, 3, 1};
    int ans = sol.findShortestSubArray(nums);
    printf("%d\n", ans);

    nums = {1, 2, 2, 3, 1, 4, 2};
    ans = sol.findShortestSubArray(nums);
    printf("%d\n", ans);
}