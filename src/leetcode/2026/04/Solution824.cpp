#include <string>
#include <unordered_set>
#include <sstream>
#include <iostream>

using namespace std;

class Solution824 {
public:
    string toGoatLatin(string sentence) {
        unordered_set<char> vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        stringstream ss(sentence);
        string word;
        string result;
        int index = 1;
        
        while (ss >> word) {
            if (vowels.find(word[0]) != vowels.end()) {
                word += "ma";
            } else {
                word = word.substr(1) + word[0] + "ma";
            }
            word += string(index, 'a');
            if (index > 1) result += " ";
            result += word;
            index++;
        }
        
        return result;
    }
};

int main() {
    Solution824 solution;

    string sentence = "I speak Goat Latin";
    string result = solution.toGoatLatin(sentence);
    // Expected output: "Imaa peaksmaaa oatGmaaaa atinLmaaaaa"
    cout << result << endl;

    sentence = "The quick brown fox jumped over the lazy dog";
    result = solution.toGoatLatin(sentence);
    // Expected output: "heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa"
    cout << result << endl;

    return 0;
}