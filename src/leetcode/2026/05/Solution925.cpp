#include <iostream>
#include <string>
using namespace std;

class Solution925 {
public:
    bool isLongPressedName(string name, string typed) {
        int i = 0; // Pointer for name
        int j = 0; // Pointer for typed

        while (i < name.length() && j < typed.length()) {
            if (name[i] == typed[j]) {
                i++;
                j++;
            } else if (j > 0 && typed[j] == typed[j - 1]) {
                j++;
            } else {
                return false;
            }
        }

        if (j != typed.length()) {
            while (j < typed.length()) {
                if (typed[j] != typed[j - 1]) {
                    return false;
                }
                j++;
            }
        }

        // Check if all characters in name were matched
        return i == name.length();
    }
};

int main() {
    Solution925 solution;
    string name1 = "alex";
    string typed1 = "aaleex";
    cout << boolalpha << solution.isLongPressedName(name1, typed1) << endl; // true

    string name2 = "saeed";
    string typed2 = "ssaaedd";
    cout << boolalpha << solution.isLongPressedName(name2, typed2) << endl; // false

    string name3 = "leelee";
    string typed3 = "lleeelee";
    cout << boolalpha << solution.isLongPressedName(name3, typed3) << endl; // true

    string name4 = "alex";
    string typed4 = "aaleexa";
    cout << boolalpha << solution.isLongPressedName(name4, typed4) << endl; // false

    return 0;
}