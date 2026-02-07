#include <iostream>
#include <vector>
#include <unordered_map>

using namespace std;

class Solution594 {
public:
    int findLHS(vector<int>& nums) {
        unordered_map<int, int> frequencyMap;
        for (int num : nums) {
            frequencyMap[num]++;
        }

        int maxLength = 0;
        for (const auto& pair : frequencyMap) {
            int key = pair.first;
            int value = pair.second;
            if (frequencyMap.find(key + 1) != frequencyMap.end()) {
                int currentLength = value + frequencyMap[key + 1];
                maxLength = max(maxLength, currentLength);
            }
        }

        return maxLength;
    }
};

int main() {
    Solution594 solution;
    vector<int> nums = {1, 3, 2, 2, 5, 2, 3, 7};
    int result = solution.findLHS(nums);
    // Expected output: 5 (the longest harmonious subsequence is [3,2,2,2,3])
    cout << "Length of Longest Harmonious Subsequence: " << result << endl;
    return 0;
}