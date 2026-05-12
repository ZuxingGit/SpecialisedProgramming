#include <unordered_map>
#include <vector>
#include <iostream>
using namespace std;

class Solution914 {
public:
    bool hasGroupsSizeX(vector<int>& deck) {
        unordered_map<int, int> count;
        for (int card : deck) {
            count[card]++;
        }

        int g = 0;
        for (auto& [_, c] : count) {
            g = gcd(g, c);
        }
        return g >= 2;
    }

private:
    int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
};

int main() {
    Solution914 solution;

    vector<int> deck = {1, 2, 3, 4, 4, 3, 2, 1};
    cout << solution.hasGroupsSizeX(deck) << endl; // Output: true

    vector<int> deck2 = {1, 1, 1, 2, 2, 2, 3, 3};
    cout << solution.hasGroupsSizeX(deck2) << endl; // Output: false

    vector<int> deck3 = {1};
    cout << solution.hasGroupsSizeX(deck3) << endl; // Output: false
    return 0;
}