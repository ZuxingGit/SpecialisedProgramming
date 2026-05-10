#include <vector>
#include <iostream>
using namespace std;

class Solution905 {
public:
    vector<int> sortArrayByParity(vector<int>& nums) {
        vector<int> result(nums.size());
        int evenIndex = 0;
        int oddIndex = nums.size() - 1;

        for (int num : nums) {
            if (num % 2 == 0) {
                result[evenIndex++] = num;
            } else {
                result[oddIndex--] = num;
            }
        }

        return result;
    }
};

int main() {
    Solution905 solution;

    vector<int> nums1 = {3, 1, 2, 4};
    vector<int> result1 = solution.sortArrayByParity(nums1);
    for (int num : result1) {
        cout << num << " "; // Output: 2 4 3 1
    }
    cout << endl;

    vector<int> nums2 = {0};
    vector<int> result2 = solution.sortArrayByParity(nums2);
    for (int num : result2) {
        cout << num << " "; // Output: 0
    }
    cout << endl;

    return 0;
}