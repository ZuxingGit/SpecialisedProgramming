#include <vector>
#include <unordered_set>
#include <iostream>
using namespace std;

class Solution961 {
public:
    int repeatedNTimes(vector<int>& nums) {
        unordered_set<int> seen;

        for (int num : nums) {
            if (seen.count(num)) {
                return num;
            }
            seen.insert(num);
        }
        return -1; // This line should never be reached since the problem guarantees a solution.
    }
};

int main() {
    Solution961 solution;

    vector<int> nums1 = {1, 2, 3, 3};
    int result1 = solution.repeatedNTimes(nums1);
    cout << result1 << endl; // Output: 3

    vector<int> nums2 = {2, 1, 2, 5, 3, 2};
    int result2 = solution.repeatedNTimes(nums2);
    cout << result2 << endl; // Output: 2

    vector<int> nums3 = {5, 1, 5, 2, 5, 3, 5, 4};
    int result3 = solution.repeatedNTimes(nums3);
    cout << result3 << endl; // Output: 5
}