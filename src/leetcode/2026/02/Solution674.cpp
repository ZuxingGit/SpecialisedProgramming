#include <vector>
#include <algorithm>
#include <iostream>
using namespace std;

class Solution674 {
public:
    int findLengthOfLCIS(vector<int>& nums) {
        if (nums.empty()) {
            return 0;
        }

        int maxLength = 1;
        int currentLength = 1;

        for (size_t i = 1; i < nums.size(); ++i) {
            if (nums[i] > nums[i - 1]) {
                ++currentLength;
            } else {
                maxLength = max(maxLength, currentLength);
                currentLength = 1;
            }
        }
        maxLength = max(maxLength, currentLength);

        return maxLength;
    }
};

int main() {
    Solution674 solution;

    vector<int> nums1 = {1, 3, 5, 4, 7};
    int result1 = solution.findLengthOfLCIS(nums1);
    // Output: 3
    cout << result1 << endl;

    vector<int> nums2 = {2, 2, 2, 2, 2};
    int result2 = solution.findLengthOfLCIS(nums2);
    // Output: 1
    cout << result2 << endl;

    return 0;
}