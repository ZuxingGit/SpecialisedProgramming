#include <vector>
#include <unordered_map>
#include <iostream>
using namespace std;

class Solution350 {
public:
    vector<int> intersect(vector<int>& nums1, vector<int>& nums2) {
        unordered_map<int, int> countMap;
        vector<int> result;

        for (int num : nums1) {
            countMap[num]++;
        }

        for (int num : nums2) {
            if (countMap[num] > 0) {
                result.push_back(num);
                countMap[num]--;
            }
        }

        return result;
    }
};

int main() {
    // Example usage:
    Solution350 solution;

    vector<int> nums1 = {1, 2, 2, 1};
    vector<int> nums2 = {2, 2};
    vector<int> result = solution.intersect(nums1, nums2);
    cout << "Intersection: ";
    for (int num : result) {
        cout << num << " ";
    }
    cout << endl;
    // result should be [2, 2]
    
    vector<int> nums3 = {4, 9, 5};
    vector<int> nums4 = {9, 4, 9, 8, 4};
    vector<int> result2 = solution.intersect(nums3, nums4);
    cout << "Intersection: ";
    for (int num : result2) {
        cout << num << " ";
    }
    cout << endl;
    // result2 should be [4, 9] or [9, 4]
    return 0;
}