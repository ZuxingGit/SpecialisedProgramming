#include <string>
#include <vector>
#include <sstream>
#include <iostream>

using namespace std;

class Solution1078 {
public:
    vector<string> findOcurrences(string text, string first, string second) {
        stringstream ss(text);
        string word;
        vector<string> words;
        while (ss >> word) {
            words.push_back(word);
        }

        vector<string> result;
        for (size_t i = 0; i < words.size() - 2; ++i) {
            if (words[i] == first && words[i + 1] == second) {
                result.push_back(words[i + 2]);
            }
        }

        return result;
    }
};

int main() {
    Solution1078 solution;

    string text1 = "alice is a good girl she is a good student";
    string first1 = "a";
    string second1 = "good";
    vector<string> result1 = solution.findOcurrences(text1, first1, second1);
    for (const string& word : result1) {
        cout << word << " ";
    }
    cout << endl;

    string text2 = "we will we will rock you";
    string first2 = "we";
    string second2 = "will";
    vector<string> result2 = solution.findOcurrences(text2, first2, second2);
    for (const string& word : result2) {
        cout << word << " ";
    }
    cout << endl;
}