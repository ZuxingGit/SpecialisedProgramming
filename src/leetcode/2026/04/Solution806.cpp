#include <vector>
#include <string>
#include <iostream>

using namespace std;

class Solution806 {
public:
    vector<int> numberOfLines(vector<int>& widths, string s) {
        int lines = 1;
        int width = 0;

        for (char c : s) {
            int charWidth = widths[c - 'a'];
            if (width + charWidth > 100) {
                lines++;
                width = charWidth;
            } else {
                width += charWidth;
            }
        }

        return { lines, width };
    }
};

int main() {
    Solution806 solution;

    vector<int> widths1 = { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10,
            10, 10, 10 };
    string s1 = "abcdefghijklmnopqrstuvwxyz";
    vector<int> result1 = solution.numberOfLines(widths1, s1);
    cout << result1[0] << ", " << result1[1] << endl; // Output: 3, 60

    vector<int> widths2 = { 4, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10,
            10, 10 };
    string s2 = "bbbcccdddaaa";
    vector<int> result2 = solution.numberOfLines(widths2, s2);
    cout << result2[0] << ", " << result2[1] << endl; // Output: 2, 4
}
