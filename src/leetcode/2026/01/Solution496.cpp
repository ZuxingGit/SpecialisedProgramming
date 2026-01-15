#include <vector>
#include <iostream>
using namespace std;

class Solution496 {
public:
    vector<int> nextGreaterElement(vector<int>& nums1, vector<int>& nums2) {
        vector<int> result;
        for (int num1 : nums1) {
            bool found = false;
            int nextGreater = -1;
            for (int num2 : nums2) {
                if (num2 == num1) {
                    found = true;
                } else if (found && num2 > num1) {
                    nextGreater = num2;
                    break;
                }
            }
            result.push_back(nextGreater);
        }
        return result;
    }
};

int main() {
    Solution496 solution;

    vector<int> nums1_1 = {4, 1, 2};
    vector<int> nums2_1 = {1, 3, 4, 2};
    vector<int> result1 = solution.nextGreaterElement(nums1_1, nums2_1);
    // Output: [-1,3,-1]
    for (int num : result1) {
        cout << num << " ";
    }
    cout << endl;

    vector<int> nums1_2 = {2, 4};
    vector<int> nums2_2 = {1, 2, 3, 4};
    vector<int> result2 = solution.nextGreaterElement(nums1_2, nums2_2);
    // Output: [3,-1]
    for (int num : result2) {
        cout << num << " ";
    }
    cout << endl;

    return 0;
}