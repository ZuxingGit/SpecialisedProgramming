#include <vector>
using namespace std;

class Solution645 {
public:
    vector<int> findErrorNums(vector<int>& nums) {
        int n = nums.size();
        vector<int> count(n + 1, 0);
        for (int num : nums) {
            count[num]++;
        }
        vector<int> result(2);
        for (int i = 1; i <= n; i++) {
            if (count[i] == 2) {
                result[0] = i; // Duplicate number
            } else if (count[i] == 0) {
                result[1] = i; // Missing number
            }
        }
        return result;
    }
};

int main() {
    Solution645 solution;

    vector<int> nums = {1, 2, 2, 4};
    vector<int> result = solution.findErrorNums(nums);
    // Output: [2, 3]
    printf("Duplicate: %d, Missing: %d\n", result[0], result[1]);

    vector<int> nums2 = {1, 1};
    vector<int> result2 = solution.findErrorNums(nums2);
    // Output: [1, 2]
    printf("Duplicate: %d, Missing: %d\n", result2[0], result2[1]);

    return 0;
}