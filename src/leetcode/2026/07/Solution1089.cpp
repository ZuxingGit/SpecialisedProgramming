#include <iostream>
#include <vector>
using namespace std;

class Solution1089 {
public:
    void duplicateZeros(vector<int>& arr) {
        int n = arr.size();
        for (int i = 0; i < n; ++i) {
            if (arr[i] == 0) {
                // Shift elements to the right by 1
                for (int j = n - 1; j > i; --j) {
                    arr[j] = arr[j - 1];
                }
                if (i + 1 < n) {
                    arr[i + 1] = 0;
                    ++i;
                }
            }
        }
    }
};

int main() {
    Solution1089 solution;

    vector<int> arr1 = {1, 0, 2, 3, 0, 4, 5, 0};
    solution.duplicateZeros(arr1);
    for (int num : arr1) {
        cout << num << " ";
    }
    cout << endl;

    vector<int> arr2 = {1, 2, 3};
    solution.duplicateZeros(arr2);
    for (int num : arr2) {
        cout << num << " ";
    }
    cout << endl;

    return 0;
}