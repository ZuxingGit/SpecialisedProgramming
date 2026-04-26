#include <iostream>
#include <vector>
using namespace std;

class Solution860 {
public:
    bool lemonadeChange(vector<int>& bills) {
        int five = 0, ten = 0;

        for (int bill : bills) {
            if (bill == 5) {
                five++;
            } else if (bill == 10) {
                if (five == 0) {
                    return false;
                }
                five--;
                ten++;
            } else { // bill == 20
                if (ten > 0 && five > 0) {
                    ten--;
                    five--;
                } else if (five >= 3) {
                    five -= 3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
};

int main() {
    Solution860 solution;

    vector<int> bills1 = {5, 5, 5, 10, 20};
    cout << solution.lemonadeChange(bills1) << endl; // true

    vector<int> bills2 = {5, 5, 10};
    cout << solution.lemonadeChange(bills2) << endl; // true

    vector<int> bills3 = {10, 10};
    cout << solution.lemonadeChange(bills3) << endl; // false

    vector<int> bills4 = {5, 5, 10, 10, 20};
    cout << solution.lemonadeChange(bills4) << endl; // false

    return 0;
}