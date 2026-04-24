#include <iostream>
#include <string>
using namespace std;

class Solution844 {
public:
    bool backspaceCompare(string s, string t) {
        int i = s.size() - 1, j = t.size() - 1;
        int skipS = 0, skipT = 0;

        while (i >= 0 || j >= 0) {
            while (i >= 0) {
                if (s[i] == '#') {
                    skipS++;
                    i--;
                } else if (skipS > 0) {
                    skipS--;
                    i--;
                } else {
                    break;
                }
            }

            while (j >= 0) {
                if (t[j] == '#') {
                    skipT++;
                    j--;
                } else if (skipT > 0) {
                    skipT--;
                    j--;
                } else {
                    break;
                }
            }

            if (i >= 0 && j >= 0 && s[i] != t[j]) {
                return false;
            }

            if ((i >= 0) != (j >= 0)) {
                return false;
            }

            i--;
            j--;
        }

        return true;
    }
};

int main() {
    Solution844 solution;

    string s1 = "ab#c", t1 = "ad#c";
    cout << solution.backspaceCompare(s1, t1) << endl; // true

    string s2 = "ab##", t2 = "c#d#";
    cout << solution.backspaceCompare(s2, t2) << endl; // true

    string s3 = "a##c", t3 = "#a#c";
    cout << solution.backspaceCompare(s3, t3) << endl; // true

    string s4 = "a#c", t4 = "b";
    cout << solution.backspaceCompare(s4, t4) << endl; // false

    return 0;
}