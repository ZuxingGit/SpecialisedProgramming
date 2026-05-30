#include <iostream>
#include <vector>

using namespace std;

class Solution976 {
public:
    int largestPerimeter(vector<int>& nums) {
        sort(nums.begin(), nums.end());
        for (int i = nums.size() - 1; i >= 2; i--) {
            if (nums[i] < nums[i - 1] + nums[i - 2]) {
                return nums[i] + nums[i - 1] + nums[i - 2];
            }
        }
        return 0;
    }
};

int main() {
    Solution976 solution;

    vector<int> nums1 = {2, 1, 2};
    cout << solution.largestPerimeter(nums1) << endl;

    vector<int> nums2 = {1, 2, 1};
    cout << solution.largestPerimeter(nums2) << endl;

    vector<int> nums3 = {3, 2, 3, 4};
    cout << solution.largestPerimeter(nums3) << endl;

    return 0;
}