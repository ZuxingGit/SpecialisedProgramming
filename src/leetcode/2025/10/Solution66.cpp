#include <vector>
using namespace std;

class Solution
{
public:
    vector<int> plusOne(vector<int> &digits)
    {
        int n = digits.size();
        for (int i = n - 1; i >= 0; i--)
        {
            if (digits[i] < 9)
            {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        digits.insert(digits.begin(), 1);
        return digits;
    }
};

int main()
{
    Solution solution;
    vector<int> digits1 = {1, 2, 3};
    vector<int> result1 = solution.plusOne(digits1);
    for (int num : result1)
    {
        printf("%d ", num);
    }
    printf("\n");
    // Output: [1, 2, 4]

    vector<int> digits2 = {4, 3, 2, 1};
    vector<int> result2 = solution.plusOne(digits2);
    for (int num : result2)
    {
        printf("%d ", num);
    }
    printf("\n");
    // Output: [4, 3, 2, 2]

    vector<int> digits3 = {9};
    vector<int> result3 = solution.plusOne(digits3);
    for (int num : result3)
    {
        printf("%d ", num);
    }
    printf("\n");
    // Output: [1, 0]

    return 0;
}