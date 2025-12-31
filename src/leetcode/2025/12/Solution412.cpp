#include <vector>
#include <string>
#include <iostream>
using namespace std;

class Solution412 {
public:
    vector<string> fizzBuzz(int n) {
        vector<string> result;
        for (int i = 1; i <= n; ++i) {
            if (i % 3 == 0 && i % 5 == 0) {
                result.push_back("FizzBuzz");
            } else if (i % 3 == 0) {
                result.push_back("Fizz");
            } else if (i % 5 == 0) {
                result.push_back("Buzz");
            } else {
                result.push_back(to_string(i));
            }
        }
        return result;
    }
};

int main() {
    Solution412 sol;

    int n1 = 3;
    vector<string> fizzBuzzResult1 = sol.fizzBuzz(n1);
    for (const string& s : fizzBuzzResult1) {
        cout << s << " ";
    }
    cout << endl;

    int n2 = 5;
    vector<string> fizzBuzzResult2 = sol.fizzBuzz(n2);
    for (const string& s : fizzBuzzResult2) {
        cout << s << " ";
    }
    cout << endl;

    int n3 = 15;
    vector<string> fizzBuzzResult3 = sol.fizzBuzz(n3);
    for (const string& s : fizzBuzzResult3) {
        cout << s << " ";
    }
    cout << endl;

    return 0;
}