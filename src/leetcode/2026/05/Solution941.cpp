#include <vector>
#include <iostream>

using namespace std;

class Solution491 {
public:
    bool validMountainArray(vector<int>& arr) {
        if (arr.size() < 3) {
            return false;
        }

        int i = 0;

        while (i < arr.size() - 1 && arr[i] < arr[i + 1]) {
            i++;
        }

        if (i == 0 || i == arr.size() - 1) {
            return false;
        }

        while (i < arr.size() - 1 && arr[i] > arr[i + 1]) {
            i++;
        }

        return i == arr.size() - 1;
    }
};

int main() {
    Solution491 solution;

    vector<int> arr1 = {2, 1};
    vector<int> arr2 = {3, 5, 5};
    vector<int> arr3 = {0, 3, 2, 1};

    cout << solution.validMountainArray(arr1) << endl; // false
    cout << solution.validMountainArray(arr2) << endl; // false
    cout << solution.validMountainArray(arr3) << endl; // true

    return 0;
}