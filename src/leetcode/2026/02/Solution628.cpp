#include <iostream>
#include <vector>
using namespace std;

class Solution628 {
public:
    int maximumProduct(vector<int>& nums) {
        int n = nums.size();
        sort(nums.begin(), nums.end());
        return max(nums[0] * nums[1] * nums[n - 1], nums[n - 1] * nums[n - 2] * nums[n - 3]);
    }
};

int main() {
    Solution628 solution;

    vector<int> nums1 = {1, 2, 3};
    int result = solution.maximumProduct(nums1);
    cout << result << endl; // Output: 6

    vector<int> nums2 = {1, 2, 3, 4};
    result = solution.maximumProduct(nums2);
    cout << result << endl; // Output: 24

    vector<int> nums3 = {-1, -2, -3};
    result = solution.maximumProduct(nums3);
    cout << result << endl; // Output: -6

    return 0;
}