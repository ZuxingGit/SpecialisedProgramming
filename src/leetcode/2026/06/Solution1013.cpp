#include <iostream>
#include <vector>
#include <numeric>
using namespace std;

class Solution1013 {
public:
    bool canThreePartsEqualSum(vector<int>& arr) {
        int total = accumulate(arr.begin(), arr.end(), 0);
        if (total % 3 != 0) {
            return false;
        }

        int target = total / 3;
        int currentSum = 0;
        int count = 0;
        for (int num : arr) {
            currentSum += num;
            if (currentSum == target) {
                count++;
                currentSum = 0;
            }
        }
        return count >= 3;
    }
};

int main() {
    Solution1013 solution;

    vector<int> arr1 = {0, 2, 1, -6, 6, -7, 9, 1, 2, 0, 1};
    vector<int> arr2 = {0, 2, 1, -6, 6, 7, 9, -1, 2, 0, 1};
    vector<int> arr3 = {3, 3, 6, 5, -2, 2, 5, 1, -9, 4};
    cout << solution.canThreePartsEqualSum(arr1) << endl; // true
    cout << solution.canThreePartsEqualSum(arr2) << endl; // false
    cout << solution.canThreePartsEqualSum(arr3) << endl; // true

    return 0;
}