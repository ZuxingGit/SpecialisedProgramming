#include <string>
using namespace std;

class Solution168
{
public:
    string convertToTitle(int columnNumber)
    {
        string result;
        while (columnNumber > 0)
        {
            columnNumber--; // Adjust for 0-based index
            char ch = 'A' + (columnNumber % 26);
            result = ch + result;
            columnNumber /= 26;
        }
        return result;
    }
};

int main()
{
    // Example 1
    Solution168 solution;
    int columnNumber1 = 1;
    string result1 = solution.convertToTitle(columnNumber1);
    // Expected Output: "A"
    printf("Column Number: %d -> Title: %s\n", columnNumber1, result1.c_str());

    // Example 2
    int columnNumber2 = 28;
    string result2 = solution.convertToTitle(columnNumber2);
    // Expected Output: "AB"
    printf("Column Number: %d -> Title: %s\n", columnNumber2, result2.c_str());

    // Example 3
    int columnNumber3 = 701;
    string result3 = solution.convertToTitle(columnNumber3);
    // Expected Output: "ZY"
    printf("Column Number: %d -> Title: %s\n", columnNumber3, result3.c_str());

    return 0;
}