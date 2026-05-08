#include <iostream>
#include <vector>

using namespace std;

class Solution896 {
public:
    bool isMonotonic(vector<int>& nums) {
        bool increasing = true;
        bool decreasing = true;

        for (int i = 1; i < nums.size(); i++) {
            if (nums[i] > nums[i - 1]) {
                decreasing = false;
            }
            if (nums[i] < nums[i - 1]) {
                increasing = false;
            }
        }
        return increasing || decreasing;
    }
};

int main() {
    Solution896 solution;

    vector<int> nums = {1, 2, 2, 3};
    bool result = solution.isMonotonic(nums);
    cout << (result ? "true" : "false") << endl; // Output: true

    nums = {6, 5, 4, 4};
    result = solution.isMonotonic(nums);
    cout << (result ? "true" : "false") << endl; // Output: true

    nums = {1, 3, 2};
    result = solution.isMonotonic(nums);
    cout << (result ? "true" : "false") << endl; // Output: false

    nums = {1, 2, 4, 5};
    result = solution.isMonotonic(nums);
    cout << (result ? "true" : "false") << endl; // Output: true

    nums = {1, 1, 1};
    result = solution.isMonotonic(nums);
    cout << (result ? "true" : "false") << endl; // Output: true

    return 0;
}