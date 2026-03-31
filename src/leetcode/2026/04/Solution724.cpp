#include <iostream>
#include <vector>
using namespace std;

class Solution724 {
public:
    int pivotIndex(vector<int>& nums) {
        int total = 0;
        for (int num : nums) {
            total += num;
        }

        int leftSum = 0;
        for (int i = 0; i < nums.size(); ++i) {
            if (leftSum == total - leftSum - nums[i]) {
                return i;
            }
            leftSum += nums[i];
        }

        return -1;
    }
};

int main() {
    Solution724 solution;

    vector<int> nums = {1, 7, 3, 6, 5, 6};
    int pivotIndex = solution.pivotIndex(nums);
    // Output: 3
    cout << "Pivot Index: " << pivotIndex << endl;

    nums = {1, 2, 3};
    pivotIndex = solution.pivotIndex(nums);
    // Output: -1
    cout << "Pivot Index: " << pivotIndex << endl;

    nums = {2, 1, -1};
    pivotIndex = solution.pivotIndex(nums);
    // Output: 0
    cout << "Pivot Index: " << pivotIndex << endl;
    
    return 0;
}