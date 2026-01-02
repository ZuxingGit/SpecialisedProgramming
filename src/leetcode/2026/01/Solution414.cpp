#include <vector>
#include <iostream>
using namespace std;

class Solution414 {
public:
    int thirdMax(vector<int>& nums) {
        long firstMax = LONG_MIN, secondMax = LONG_MIN, thirdMax = LONG_MIN;
        for (int num : nums) {
            if (num > firstMax) {
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = num;
            } else if (num > secondMax && num < firstMax) {
                thirdMax = secondMax;
                secondMax = num;
            } else if (num > thirdMax && num < secondMax) {
                thirdMax = num;
            }
        }
        return thirdMax == LONG_MIN ? firstMax : thirdMax;
    }
};

int main() {
    Solution414 solution;

    vector<int> nums1 = {3, 2, 1};
    int result1 = solution.thirdMax(nums1); // Expected output: 1
    cout << result1 << endl;

    vector<int> nums2 = {1, 2};
    int result2 = solution.thirdMax(nums2); // Expected output: 2
    cout << result2 << endl;

    vector<int> nums3 = {2, 2, 3, 1};
    int result3 = solution.thirdMax(nums3); // Expected output: 1
    cout << result3 << endl;

    return 0;
}