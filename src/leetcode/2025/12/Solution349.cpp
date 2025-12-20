#include <iostream>
#include <vector>
#include <unordered_set>
using namespace std;

class Solution349 {
public:
    vector<int> intersection(vector<int>& nums1, vector<int>& nums2) {
        unordered_set<int> set1(nums1.begin(), nums1.end());
        unordered_set<int> resultSet;

        for (int num : nums2) {
            if (set1.count(num)) {
                resultSet.insert(num);
            }
        }

        return vector<int>(resultSet.begin(), resultSet.end());
    }
};

int main() {
    Solution349 solution;

    vector<int> nums1_0 = {1, 2, 2, 1};
    vector<int> nums2_0 = {2, 2};
    vector<int> output0 = solution.intersection(nums1_0, nums2_0);
    for (int num : output0) {
        cout << num << " "; // Output: 2
    }
    cout << endl;

    vector<int> nums1_1 = {4, 9, 5};
    vector<int> nums2_1 = {9, 4, 9, 8, 4};
    vector<int> output1 = solution.intersection(nums1_1, nums2_1);
    for (int num : output1) {
        cout << num << " "; // Output: 9 4 (order may vary)
    }
    cout << endl;

    return 0;
}