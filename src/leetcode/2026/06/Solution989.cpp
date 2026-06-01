#include <vector>
using namespace std;

class Solution989 {
public:
    vector<int> addToArrayForm(vector<int>& num, int k) {
        vector<int> result;
        int carry = 0;
        int n = num.size();
        for (int i = n - 1; i >= 0 || k > 0; --i) {
            if (i >= 0) {
                k += num[i];
            }
            result.push_back(k % 10);
            k /= 10;
        }
        reverse(result.begin(), result.end());
        return result;
    }
};

int main() {
    Solution989 solution;
    vector<int> num = {1, 2, 0, 0};
    int k = 34;
    vector<int> result = solution.addToArrayForm(num, k);
    for (int digit : result) {
        printf("%d ", digit);
    }
    printf("\n");

    vector<int> num2 = {2, 7, 4};
    int k2 = 181;
    vector<int> result2 = solution.addToArrayForm(num2, k2);
    for (int digit : result2) {
        printf("%d ", digit);
    }
    printf("\n");

    vector<int> num3 = {2, 1, 5};
    int k3 = 806;
    vector<int> result3 = solution.addToArrayForm(num3, k3);
    for (int digit : result3) {
        printf("%d ", digit);
    }
    printf("\n");

    return 0;
}