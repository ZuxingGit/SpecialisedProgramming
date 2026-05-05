#include <iostream>
#include <vector>
#include <unordered_set>
#include <numeric>
using namespace std;

class Solution888 {
public:
    vector<int> fairCandySwap(vector<int>& aliceSizes, vector<int>& bobSizes) {
        int sumAlice = accumulate(aliceSizes.begin(), aliceSizes.end(), 0);
        int sumBob = accumulate(bobSizes.begin(), bobSizes.end(), 0);
        int diff = (sumAlice - sumBob) / 2;

        unordered_set<int> bobSet(bobSizes.begin(), bobSizes.end());
        for (int x : aliceSizes) {
            if (bobSet.count(x - diff)) {
                return {x, x - diff};
            }
        }
        return {};
    }
};

int main() {
    Solution888 solution;

    vector<int> aliceSizes = {1, 2, 5};
    vector<int> bobSizes = {2, 4};
    vector<int> result = solution.fairCandySwap(aliceSizes, bobSizes);
    cout << result[0] << " " << result[1] << endl; // Output: "5 4"

    aliceSizes = {1, 1};
    bobSizes = {2, 2};
    result = solution.fairCandySwap(aliceSizes, bobSizes);
    cout << result[0] << " " << result[1] << endl; // Output: "1 2"
    
    return 0;
}