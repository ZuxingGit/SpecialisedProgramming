#include <string>
#include <vector>
#include <iostream>
using namespace std;

class Solution682 {
public:
    int calPoints(vector<string>& operations) {
        vector<int> scores;
        for (const string& op : operations) {
            if (op == "C") {
                if (!scores.empty()) {
                    scores.pop_back();
                }
            } else if (op == "D") {
                if (!scores.empty()) {
                    scores.push_back(2 * scores.back());
                }
            } else if (op == "+") {
                int size = scores.size();
                if (size >= 2) {
                    scores.push_back(scores[size - 1] + scores[size - 2]);
                } else if (size == 1) {
                    scores.push_back(scores[0]);
                }
            } else {
                scores.push_back(stoi(op));
            }
        }

        int totalScore = 0;
        for (int score : scores) {
            totalScore += score;
        }
        return totalScore;
    }
};

int main() {
    Solution682 solution;

    vector<string> operations = {"5", "2", "C", "D", "+"};
    int result = solution.calPoints(operations);
    cout << result << endl; // Output: 30
    
    return 0;
}