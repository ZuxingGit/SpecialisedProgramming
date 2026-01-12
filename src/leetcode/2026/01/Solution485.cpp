#include <iostream>
#include <vector>
using namespace std;

class Solution485 {
public:
    int findMaxConsecutiveOnes(vector<int>& nums) {
        int maxCount = 0;
        int currentCount = 0;

        for (int num : nums) {
            if (num == 1) {
                currentCount++;
                maxCount = max(maxCount, currentCount);
            } else {
                currentCount = 0;
            }
        }

        return maxCount;
    }
};

int main() {
    Solution485 solution;

    vector<int> nums1 = {1, 1, 0, 1, 1, 1};
    int result1 = solution.findMaxConsecutiveOnes(nums1);
    cout << "Max consecutive ones: " << result1 << endl; // Output: 3

    vector<int> nums2 = {0, 0, 0, 0};
    int result2 = solution.findMaxConsecutiveOnes(nums2);
    cout << "Max consecutive ones: " << result2 << endl; // Output: 0

    return 0;
}