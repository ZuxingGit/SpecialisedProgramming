#include <vector>
#include <algorithm>
#include <iostream>
using namespace std;

class Solution908 {
public:
    int smallestRangeI(vector<int>& nums, int k) {
        int min_val = *min_element(nums.begin(), nums.end());
        int max_val = *max_element(nums.begin(), nums.end());
        return max(0, max_val - min_val - 2 * k);
    }
};

int main() {
    Solution908 solution;

    vector<int> nums1 = {1, 3, 6};
    int k1 = 3;
    int result1 = solution.smallestRangeI(nums1, k1);
    cout << result1 << endl; // Output: 0

    vector<int> nums2 = {0, 10};
    int k2 = 2;
    int result2 = solution.smallestRangeI(nums2, k2);
    cout << result2 << endl; // Output: 6

    vector<int> nums3 = {1};
    int k3 = 0;
    int result3 = solution.smallestRangeI(nums3, k3);
    cout << result3 << endl; // Output: 0

    return 0;
}