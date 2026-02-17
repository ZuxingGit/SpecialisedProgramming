#include <iostream>
#include <vector>
// #include <algorithm>

using namespace std;

class Solution643 {
public:
    double findMaxAverage(vector<int>& nums, int k) {
        int n = nums.size();
        double sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        double maxAvg = sum / k;
        for (int i = k; i < n; i++) {
            sum += nums[i] - nums[i - k];
            maxAvg = max(maxAvg, sum / k);
        }
        return maxAvg;
    }
};

int main() {
    Solution643 solution;

    vector<int> nums = {1, 12, -5, -6, 50, 3};
    int k = 4;
    double result = solution.findMaxAverage(nums, k);
    cout << "Maximum average: " << result << endl; // Output: 12.75

    vector<int> nums2 = {5};
    int k2 = 1;
    double result2 = solution.findMaxAverage(nums2, k2);
    cout << "Maximum average: " << result2 << endl; // Output: 5

    return 0;
}