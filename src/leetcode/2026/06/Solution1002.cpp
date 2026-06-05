#include <vector>
#include <string>
using namespace std;

class Solution1002 {
public:
    vector<string> commonChars(vector<string>& words) {
        vector<string> res;
        vector<int> count(26, 0);
        for (char c : words[0]) {
            count[c - 'a']++;
        }

        for (int i = 1; i < words.size(); i++) {
            vector<int> temp(26, 0);
            for (char c : words[i]) {
                temp[c - 'a']++;
            }
            for (int j = 0; j < 26; j++) {
                count[j] = min(count[j], temp[j]);
            }
        }

        for (int i = 0; i < 26; i++) {
            while (count[i] > 0) {
                res.push_back(string(1, 'a' + i));
                count[i]--;
            }
        }
        return res;
    }
};

int main() {
    Solution1002 solution;

    vector<string> words = {"bella", "label", "roller"};
    vector<string> res = solution.commonChars(words);
    for (const string& s : res) {
        printf("%s ", s.c_str());
    }
    printf("\n");

    vector<string> words2 = {"cool", "lock", "cook"};
    vector<string> res2 = solution.commonChars(words2);
    for (const string& s : res2) {
        printf("%s ", s.c_str());
    }
    printf("\n");
    
    return 0;
}