#include <vector>
#include <iostream>
using namespace std;

class Solution1018 {
public:
    vector<bool> prefixesDivBy5(vector<int>& nums) {
        vector<bool> result;
        int currentNum = 0;
        for (int num : nums) {
            currentNum = (currentNum * 2 + num) % 5;
            result.push_back(currentNum == 0);
        }
        return result;
    }
};

int main() {
    Solution1018 solution;

    vector<int> nums1 = {0, 1, 1};
    vector<int> nums2 = {1, 1, 1};
    vector<int> nums3 = {0, 1, 1, 1, 1, 1};
    vector<bool> result1 = solution.prefixesDivBy5(nums1);
    vector<bool> result2 = solution.prefixesDivBy5(nums2);
    vector<bool> result3 = solution.prefixesDivBy5(nums3);

    for (bool b : result1) {
        cout << b << " "; // true false false
    }
    cout << endl;

    for (bool b : result2) {
        cout << b << " "; // false false false
    }
    cout << endl;

    for (bool b : result3) {
        cout << b << " "; // true false false false true false
    }
    cout << endl;

    return 0;
}