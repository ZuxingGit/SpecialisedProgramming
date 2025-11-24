#include <string>
using namespace std;

class Solution171
{
public:
    int titleToNumber(string columnTitle)
    {
        int result = 0;
        for (char ch : columnTitle)
        {
            result = result * 26 + (ch - 'A' + 1);
        }
        return result;
    }
};

int main()
{
    // Example 1
    Solution171 solution;
    string columnTitle1 = "A";
    int result1 = solution.titleToNumber(columnTitle1);
    // Expected Output: 1
    printf("Column Title: %s -> Number: %d\n", columnTitle1.c_str(), result1);

    // Example 2
    string columnTitle2 = "AB";
    int result2 = solution.titleToNumber(columnTitle2);
    // Expected Output: 28
    printf("Column Title: %s -> Number: %d\n", columnTitle2.c_str(), result2);

    // Example 3
    string columnTitle3 = "ZY";
    int result3 = solution.titleToNumber(columnTitle3);
    // Expected Output: 701
    printf("Column Title: %s -> Number: %d\n", columnTitle3.c_str(), result3);

    return 0;
}