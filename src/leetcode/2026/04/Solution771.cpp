#include <iostream>
#include <string>
using namespace std;

class Solution771 {
public:
    int numJewelsInStones(string jewels, string stones) {
        int count = 0;

        for (char stone : stones) {
            if (jewels.find(stone) != string::npos) {
                count++;
            }
        }
        return count;
    }
};

int main() {
    Solution771 solution;

    string jewels1 = "aA";
    string stones1 = "aAAbbbb";
    int result1 = solution.numJewelsInStones(jewels1, stones1);
    printf("Result 1: %d\n", result1);

    string jewels2 = "z";
    string stones2 = "ZZ";
    int result2 = solution.numJewelsInStones(jewels2, stones2);
    printf("Result 2: %d\n", result2);
    
    return 0;
}