#include <vector>
#include <unordered_set>
#include <iostream>
using namespace std;

class Solution575 {
public:
    int distributeCandies(vector<int>& candyType) {
        bool typeSeen[200001] = {false};
        int uniqueTypeCount = 0;
        int maxCandies = candyType.size() / 2;
        for (int type : candyType) {
            if (!typeSeen[type + 100000]) {
                typeSeen[type + 100000] = true;
                uniqueTypeCount++;
                if (uniqueTypeCount >= maxCandies) {
                    return maxCandies;
                }
            }
        }
        return uniqueTypeCount;
    }
};

int main() {
    // Example usage:
    Solution575 solution;

    vector<int> candyType1 = {1, 1, 2, 2, 3, 3};
    int result1 = solution.distributeCandies(candyType1);
    // result1 should be 3
    cout << "Result 1: " << result1 << endl;

    vector<int> candyType2 = {1, 1, 2, 3};
    int result2 = solution.distributeCandies(candyType2);
    // result2 should be 2
    cout << "Result 2: " << result2 << endl;

    vector<int> candyType3 = {6, 6, 6, 6};
    int result3 = solution.distributeCandies(candyType3);
    // result3 should be 1
    cout << "Result 3: " << result3 << endl;

    return 0;
}