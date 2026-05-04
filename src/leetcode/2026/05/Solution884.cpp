#include <iostream>
#include <vector>
#include <unordered_map>
#include <sstream>
using namespace std;

class Solution884 {
public:
    vector<string> uncommonFromSentences(string s1, string s2) {
        stringstream ss1(s1), ss2(s2);
        string word;

        unordered_map<string, int> count;
        while (ss1 >> word) {
            count[word]++;
        }
        while (ss2 >> word) {
            count[word]++;
        }
        vector<string> result;
        for (const auto& entry : count) {
            if (entry.second == 1) {
                result.push_back(entry.first);
            }
        }
        return result;
    }
};

int main() {
    Solution884 solution;

    string s1 = "this apple is sweet";
    string s2 = "this apple is sour";
    vector<string> result = solution.uncommonFromSentences(s1, s2);
    for (const string& word : result) {
        cout << word << " ";
    }
    cout << endl; // Output: "sweet sour"

    s1 = "apple apple";
    s2 = "banana";
    result = solution.uncommonFromSentences(s1, s2);
    for (const string& word : result) {
        cout << word << " ";
    }
    cout << endl; // Output: "banana"
    
    return 0;
}