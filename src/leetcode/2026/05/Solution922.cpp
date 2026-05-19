#include <iostream>
#include <vector>

using namespace std;

class Solution922 {
public:
    vector<int> sortArrayByParityII(vector<int>& nums) {
        vector<int> result(nums.size());
        int evenIndex = 0;
        int oddIndex = 1;

        for (int num : nums) {
            if (num % 2 == 0) {
                result[evenIndex] = num;
                evenIndex += 2;
            } else {
                result[oddIndex] = num;
                oddIndex += 2;
            }
        }
        return result;
    }
};

int main() {
    Solution922 solution;
    vector<int> nums = {4, 2, 5, 7};
    vector<int> result = solution.sortArrayByParityII(nums);
    for (int num : result) {
        cout << num << " ";
    }
    cout << endl;

    vector<int> nums2 = {2, 3};
    vector<int> result2 = solution.sortArrayByParityII(nums2);
    for (int num : result2) {
        cout << num << " ";
    }
    cout << endl;

    return 0;
}