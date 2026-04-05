#include <vector>
#include <iostream>
using namespace std;

class Solution747 {
public:
    int dominantIndex(vector<int>& nums) {
        if (nums.empty()) {
            return -1;
        }
        int maxIndex = 0;
        for (int i = 1; i < nums.size(); ++i) {
            if (nums[i] > nums[maxIndex]) {
                maxIndex = i;
            }
        }
        for (int i = 0; i < nums.size(); ++i) {
            if (i != maxIndex && nums[i] * 2 > nums[maxIndex]) {
                return -1;
            }
        }
        return maxIndex;
    }
};

int main() {
    Solution747 solution;

    vector<int> nums1 = {3, 6, 1, 0};
    cout << solution.dominantIndex(nums1) << endl; // Output: 1

    vector<int> nums2 = {1, 2, 3, 4};
    cout << solution.dominantIndex(nums2) << endl; // Output: -1

    vector<int> nums3 = {1};
    cout << solution.dominantIndex(nums3) << endl; // Output: 0

    return 0;
}