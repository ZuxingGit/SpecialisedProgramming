#include <iostream>
#include <vector>
using namespace std;

class Solution836 {
public:
    bool isRectangleOverlap(vector<int>& rec1, vector<int>& rec2) {
        return !(rec1[2] <= rec2[0] || rec1[0] >= rec2[2] || rec1[3] <= rec2[1] || rec1[1] >= rec2[3]);
    }
};

int main() {
    Solution836 solution;

    vector<int> rec1 = {0, 0, 2, 2};
    vector<int> rec2 = {1, 1, 3, 3};
    cout << solution.isRectangleOverlap(rec1, rec2) << endl; // true

    vector<int> rec3 = {0, 0, 1, 1};
    vector<int> rec4 = {1, 0, 2, 1};
    cout << solution.isRectangleOverlap(rec3, rec4) << endl; // false

    vector<int> rec5 = {0, 0, 1, 1};
    vector<int> rec6 = {2,2,3,3};
    cout << solution.isRectangleOverlap(rec5, rec6) << endl; // false

    return 0;
}