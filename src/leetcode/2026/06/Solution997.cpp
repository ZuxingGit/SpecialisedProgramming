#include <iostream>
#include <vector>
using namespace std;

class Solution997 {
public:
    int findJudge(int n, vector<vector<int>>& trust) {
        vector<int> inDegree(n + 1, 0);
        vector<int> outDegree(n + 1, 0);
        for (const auto& t : trust) {
            outDegree[t[0]]++;
            inDegree[t[1]]++;
        }
        for (int i = 1; i <= n; i++) {
            if (inDegree[i] == n - 1 && outDegree[i] == 0) {
                return i;
            }
        }
        return -1;
    }
};

int main() {
    Solution997 solution;

    vector<vector<int>> trust = {{1, 2}};
    int n = 2;
    int judge = solution.findJudge(n, trust);
    cout << "The town judge is: " << judge << endl;

    vector<vector<int>> trust2 = {{1, 3}, {2, 3}};
    n = 3;
    judge = solution.findJudge(n, trust2);
    cout << "The town judge is: " << judge << endl;

    vector<vector<int>> trust3 = {{1, 3}, {2, 3}, {3, 1}};
    n = 3;
    judge = solution.findJudge(n, trust3);
    cout << "The town judge is: " << judge << endl;

    return 0;
}