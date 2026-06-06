#include <vector>
using namespace std;

class Solution1005 {
public:
    int largestSumAfterKNegations(vector<int>& nums, int k) {
        sort(nums.begin(), nums.end());
        for (int i = 0; i < nums.size() && k > 0; i++) {
            if (nums[i] < 0) {
                nums[i] = -nums[i];
                k--;
            } else {
                break;
            }
        }

        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        if (k % 2 == 1) {
            int minNum = *min_element(nums.begin(), nums.end());
            sum -= 2 * minNum;
        }

        return sum;
    }
};

int main() {
    Solution1005 solution;

    vector<int> nums = {4, 2, 3};
    int k = 1;
    int res = solution.largestSumAfterKNegations(nums, k);
    printf("%d\n", res);

    vector<int> nums2 = {3, -1, 0, 2};
    int k2 = 3;
    int res2 = solution.largestSumAfterKNegations(nums2, k2);
    printf("%d\n", res2);

    vector<int> nums3 = {2, -3, -1, 5, -4};
    int k3 = 2;
    int res3 = solution.largestSumAfterKNegations(nums3, k3);
    printf("%d\n", res3);
    
    return 0;
}