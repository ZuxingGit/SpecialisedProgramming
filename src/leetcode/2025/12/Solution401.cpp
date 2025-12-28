#include <iostream>
#include <vector>
#include <string>
using namespace std;

class Solution401 {
public:
    vector<string> readBinaryWatch(int turnedOn) {
        vector<string> result;
        for (int h = 0; h < 12; ++h) {
            for (int m = 0; m < 60; ++m) {
                if (__builtin_popcount(h) + __builtin_popcount(m) == turnedOn) {
                    result.push_back(to_string(h) + (m < 10 ? ":0" : ":") + to_string(m));
                }
            }
        }
        return result;
    }
};

int main(){
    Solution401 solution;

    int turnedOn1 = 1;
    vector<string> times1 = solution.readBinaryWatch(turnedOn1);
    for (const string& time : times1) {
        cout << time << " ";
    }
    cout << endl;

    int turnedOn2 = 9;;
    vector<string> times2 = solution.readBinaryWatch(turnedOn2);
    for (const string& time : times2) {
        cout << time << " ";
    }
    cout << endl;

    int turnedOn3 = 3;
    vector<string> times3 = solution.readBinaryWatch(turnedOn3);
    for (const string& time : times3) {
        cout << time << " ";
    }
    cout << endl;

    return 0;
}