#include <vector>
#include <string>
#include <iostream>
using namespace std;

class Solution942 {
public:
    vector<int> diStringMatch(string s) {
        int n = s.size();
        int low = 0, high = n;
        vector<int> result(n + 1);

        for (int i = 0; i < n; i++) {
            if (s[i] == 'I') {
                result[i] = low++;
            } else {
                result[i] = high--;
            }
        }

        result[n] = low; // or result[n] = high; since low == high at this point
        return result;
    }
};

int main() {
    Solution942 solution;

    string s1 = "IDID";
    string s2 = "III";
    string s3 = "DDI";

    vector<int> result1 = solution.diStringMatch(s1);
    vector<int> result2 = solution.diStringMatch(s2);
    vector<int> result3 = solution.diStringMatch(s3);

    for (int num : result1) {
        cout << num << " ";
    }
    cout << endl;

    for (int num : result2) {
        cout << num << " ";
    }
    cout << endl;

    for (int num : result3) {
        cout << num << " ";
    }
    cout << endl;

    return 0;
}