#include <iostream>
#include <vector>
#include <string>
using namespace std;

class Solution830 {
public:
    vector<vector<int>> largeGroupPositions(string s) {
        vector<vector<int>> result;
        int n = s.size();
        int i = 0;
        while (i < n) {
            int j = i;
            while (j < n && s[j] == s[i]) {
                j++;
            }
            if (j - i >= 3) {
                result.push_back({i, j - 1});
            }
            i = j;
        }
        return result;
    }
};

int main() {
    Solution830 solution;

    string s = "abbxxxxzzy";
    vector<vector<int>> result = solution.largeGroupPositions(s);
    for (const auto& group : result) {
        cout << "[" << group[0] << ", " << group[1] << "]" << endl;
    }

    string s2 = "abc";
    vector<vector<int>> result2 = solution.largeGroupPositions(s2);
    for (const auto& group : result2) {
        cout << "[" << group[0] << ", " << group[1] << "]" << endl;
    }

    string s3 = "abcdddeeeeaabbbcd";
    vector<vector<int>> result3 = solution.largeGroupPositions(s3);
    for (const auto& group : result3) {
        cout << "[" << group[0] << ", " << group[1] << "]" << endl;
    }


    return 0;
}