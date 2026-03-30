#include <iostream>
#include <string>
using namespace std;

class Solution {
public:
    string toLowerCase(string s) {
        for (char &c : s) {
            if (c >= 'A' && c <= 'Z') {
                c = c - 'A' + 'a';
            }
        }
        return s;
    }
};

int main() {
    Solution solution;
    
    string input = "Hello, World!";
    string output = solution.toLowerCase(input);
    cout << "Input: " << input << endl;
    cout << "Output: " << output << endl; // Should print "hello, world!"
}