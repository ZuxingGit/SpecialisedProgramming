#include <vector>
#include <string>
#include <iostream>
using namespace std;

class Solution506 {
public:
    vector<string> findRelativeRanks(vector<int>& score) {
        int n = score.size();
        vector<string> result(n);
        vector<int> sortedScores = score;
        sort(sortedScores.rbegin(), sortedScores.rend());

        for (int i = 0; i < n; ++i) {
            int rank = find(sortedScores.begin(), sortedScores.end(), score[i]) - sortedScores.begin() + 1;
            if (rank == 1) {
                result[i] = "Gold Medal";
            } else if (rank == 2) {
                result[i] = "Silver Medal";
            } else if (rank == 3) {
                result[i] = "Bronze Medal";
            } else {
                result[i] = to_string(rank);
            }
        }

        return result;
    }
};

int main() {
    Solution506 solution;

    vector<int> scores = {5, 4, 3, 2, 1};
    vector<string> ranks = solution.findRelativeRanks(scores);
    // Expected output: ["Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"]
    for (const string& rank : ranks) {
        cout << rank << " ";
    }
    cout << endl;

    vector<int> scores2 = {10, 3, 8, 9, 4};
    vector<string> ranks2 = solution.findRelativeRanks(scores2);
    // Expected output: ["Gold Medal", "5", "Bronze Medal", "Silver Medal", "4"]
    for (const string& rank : ranks2) {
        cout << rank << " ";
    }
    cout << endl;
    
    return 0;
}