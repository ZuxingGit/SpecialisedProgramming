#include <vector>
#include <iostream>
using namespace std;

class Solution448 {
public:
    vector<int> findDisappearedNumbers(vector<int>& nums) {
        vector<int> result;
        int n = nums.size();

        for (int i = 0; i < n; ++i) {
            int index = abs(nums[i]) - 1;
            if (nums[index] > 0) {
                nums[index] = -nums[index];
            }
        }

        for (int i = 0; i < n; ++i) {
            if (nums[i] > 0) {
                result.push_back(i + 1);
            }
        }

        return result;
    }
};

int main() {
    Solution448 solution;

    vector<int> nums1 = {4,3,2,7,8,2,3,1};
    vector<int> result1 = solution.findDisappearedNumbers(nums1);
    // Expected output: [5,6]
    cout << "Disappeared numbers: ";
    for (int num : result1) {
        cout << num << " ";
    }
    cout << endl;

    vector<int> nums2 = {1,1};
    vector<int> result2 = solution.findDisappearedNumbers(nums2);
    // Expected output: [2]
    cout << "Disappeared numbers: ";
    for (int num : result2) {
        cout << num << " ";
    }
    cout << endl;

    return 0;
}