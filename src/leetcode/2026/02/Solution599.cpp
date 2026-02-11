#include <vector>
#include <string>
#include <unordered_map>
#include <iostream>

using namespace std;

class Solution599 {
public:
    vector<string> findRestaurant(vector<string>& list1, vector<string>& list2) {
        unordered_map<string, int> indexMap;
        for (int i = 0; i < list1.size(); ++i) {
            indexMap[list1[i]] = i;
        }

        vector<string> result;
        int minIndexSum = INT_MAX;

        for (int j = 0; j < list2.size(); ++j) {
            if (indexMap.count(list2[j])) {
                int indexSum = indexMap[list2[j]] + j;
                if (indexSum < minIndexSum) {
                    minIndexSum = indexSum;
                    result.clear();
                    result.push_back(list2[j]);
                } else if (indexSum == minIndexSum) {
                    result.push_back(list2[j]);
                }
            }
        }

        return result;
    }
};

int main() {
    Solution599 solution;
    vector<string> list1 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
    vector<string> list2 = {"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"};
    vector<string> result = solution.findRestaurant(list1, list2);
    for (const string& restaurant : result) {
        cout << restaurant << endl; // Output: Shogun
    }
    return 0;
}