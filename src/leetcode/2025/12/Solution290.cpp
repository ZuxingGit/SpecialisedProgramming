#include <iostream>
#include <string>
#include <unordered_map>
#include <sstream>
using namespace std;

class Solution290
{
public:
    bool wordPattern(string pattern, string s)
    {
        unordered_map<char, string> charToWord;
        unordered_map<string, char> wordToChar;
        istringstream iss(s);
        string word;
        int index = 0;

        while (iss >> word)
        {
            if (index >= pattern.size())
            {
                return false;
            }

            char c = pattern[index];

            if (charToWord.count(c) && charToWord[c] != word)
            {
                return false;
            }
            if (wordToChar.count(word) && wordToChar[word] != c)
            {
                return false;
            }

            charToWord[c] = word;
            wordToChar[word] = c;
            index++;
        }

        return index == pattern.size();
    }
};

int main()
{
    Solution290 solution;

    string pattern1 = "abba";
    string s1 = "dog cat cat dog";
    cout << (solution.wordPattern(pattern1, s1) ? "true" : "false") << endl;
    // Expected output: true

    string pattern2 = "abba";
    string s2 = "dog cat cat fish";
    cout << (solution.wordPattern(pattern2, s2) ? "true" : "false") << endl;
    // Expected output: false

    string pattern3 = "aaaa";
    string s3 = "dog cat cat dog";
    cout << (solution.wordPattern(pattern3, s3) ? "true" : "false") << endl;
    // Expected output: false

    string pattern4 = "abba";
    string s4 = "dog dog dog dog";
    cout << (solution.wordPattern(pattern4, s4) ? "true" : "false") << endl;
    // Expected output: false

    return 0;
}