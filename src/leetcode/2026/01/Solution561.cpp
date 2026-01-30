#include <vector>
#include <iostream>
using namespace std;

class Solution561 {
public:
    int arrayPairSum(vector<int>& nums) {
        sort(nums.begin(), nums.end());
        int sum = 0;
        for (size_t i = 0; i < nums.size(); i += 2) {
            sum += nums[i];
        }
        return sum;
    }
};

int main() {
    Solution561 solution;

    vector<int> nums1 = {1, 4, 3, 2};
    int result1 = solution.arrayPairSum(nums1);
    cout << "Maximized Sum of Min Pairs: " << result1 << endl; // Output: 4

    vector<int> nums2 = {6, 2, 6, 5, 1, 2};
    int result2 = solution.arrayPairSum(nums2);
    cout << "Maximized Sum of Min Pairs: " << result2 << endl; // Output: 9

    return 0;
}