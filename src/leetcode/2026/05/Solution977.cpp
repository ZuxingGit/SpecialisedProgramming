#include <vector>
#include <iostream>
using namespace std;

class Solution977 {
public:
    vector<int> sortedSquares(vector<int>& nums) {
        int n = nums.size();
        vector<int> result(n);
        int left = 0, right = n - 1, index = n - 1;

        while (left <= right) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];
            if (leftSquare > rightSquare) {
                result[index--] = leftSquare;
                left++;
            } else {
                result[index--] = rightSquare;
                right--;
            }
        }
        return result;
    }
};

int main() {
    Solution977 solution;

    vector<int> nums1 = {-4, -1, 0, 3, 10};
    vector<int> result1 = solution.sortedSquares(nums1);
    for (int num : result1) {
        cout << num << " ";
    }
    cout << endl;

    vector<int> nums2 = {-7, -3, 2, 3, 11};
    vector<int> result2 = solution.sortedSquares(nums2);
    for (int num : result2) {
        cout << num << " ";
    }
    cout << endl;

    return 0;
}