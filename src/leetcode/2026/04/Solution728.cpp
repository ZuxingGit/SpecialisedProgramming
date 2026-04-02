#include <vector>
#include <iostream>
using namespace std;

class Solution728 {
public:
    vector<int> selfDividingNumbers(int left, int right) {
        vector<int> result;

        for (int num = left; num <= right; ++num) {
            if (isSelfDividing(num)) {
                result.push_back(num);
            }
        }
        return result;
    }

private:
    bool isSelfDividing(int num) {
        int original = num;
        while (num > 0) {
            int digit = num % 10;
            if (digit == 0 || original % digit != 0) {
                return false;
            }
            num /= 10;
        }
        return true;

    }
};

int main() {
    Solution728 solution;

    int left = 1, right = 22;
    vector<int> selfDividingNumbers = solution.selfDividingNumbers(left, right);
    // Output: [1,2,3,4,5,6,7,8,9,11,12,15,22]
    cout << "Self Dividing Numbers: ";
    for (int num : selfDividingNumbers) {
        cout << num << " ";
    }
    cout << endl;

    left = 47, right = 85;
    selfDividingNumbers = solution.selfDividingNumbers(left, right);
    // Output: [48,55,66,77]
    cout << "Self Dividing Numbers: ";
    for (int num : selfDividingNumbers) {
        cout << num << " ";
    }
    cout << endl;

    return 0;
}