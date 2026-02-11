#include <vector>
#include <iostream>
using namespace std;

class Solution605 {
public:
    bool canPlaceFlowers(vector<int>& flowerbed, int n) {
        int count = 0;
        for (int i = 0; i < flowerbed.size(); ++i) {
            if (flowerbed[i] == 0) {
                bool leftEmpty = (i == 0) || (flowerbed[i - 1] == 0);
                bool rightEmpty = (i == flowerbed.size() - 1) || (flowerbed[i + 1] == 0);
                if (leftEmpty && rightEmpty) {
                    flowerbed[i] = 1; // Plant a flower here
                    count++;
                }
            }
        }
        return count >= n;
    }
};

int main() {
    Solution605 solution;

    vector<int> flowerbed1 = {1, 0, 0, 0, 1};
    int n1 = 1;
    bool result1 = solution.canPlaceFlowers(flowerbed1, n1);
    // Expected output: true
    cout << result1 << endl;

    vector<int> flowerbed2 = {1, 0, 0, 0, 1};
    int n2 = 2;
    bool result2 = solution.canPlaceFlowers(flowerbed2, n2);
    // Expected output: false
    cout << result2 << endl;

    return 0;
}