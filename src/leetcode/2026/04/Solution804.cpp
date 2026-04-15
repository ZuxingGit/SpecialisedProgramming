#include <string>
#include <vector>
#include <unordered_set>
using namespace std;

class Solution804 {
public:
    int uniqueMorseRepresentations(vector<string>& words) {
        string morse[26] = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
                             "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--",
                             "--.." };
        unordered_set<string> uniqueTransformations;
        for (const string& word : words) {
            string transformation;
            for (char c : word) {
                transformation += morse[c - 'a'];
            }
            uniqueTransformations.insert(transformation);
        }
        return uniqueTransformations.size();
    }
};

int main() {
    Solution804 solution;

    vector<string> words1 = { "gin", "zen", "gig", "msg" };
    printf("Unique Morse representations: %d\n", solution.uniqueMorseRepresentations(words1)); // Output: 2

    vector<string> words2 = { "a" };
    printf("Unique Morse representations: %d\n", solution.uniqueMorseRepresentations(words2)); // Output: 1

    return 0;
}