#include <vector>
#include <iostream>
using namespace std;

class Solution495 {
public:
    int findPoisonedDuration(vector<int>& timeSeries, int duration) {
        int totalDuration = 0;
        int n = timeSeries.size();

        for (int i = 0; i < n - 1; ++i) {
            int interval = timeSeries[i + 1] - timeSeries[i];
            totalDuration += min(interval, duration);
        }

        totalDuration += duration; // Add duration for the last attack
        return totalDuration;
    }
};

int main() {
    Solution495 solution;

    vector<int> timeSeries1 = {1, 4};
    int duration1 = 2;
    int result1 = solution.findPoisonedDuration(timeSeries1, duration1);
    // Output: 4
    cout << result1 << endl;

    vector<int> timeSeries2 = {1, 2};
    int duration2 = 2;
    int result2 = solution.findPoisonedDuration(timeSeries2, duration2);
    // Output: 3
    cout << result2 << endl;

    return 0;
}