#include <iostream>
#include <string>
using namespace std;

class Solution
{
public:
    int lengthOfLastWord(string s)
    {
        int length = 0;
        int i = s.length() - 1;

        // Skip trailing spaces
        while (i >= 0 && s[i] == ' ')
        {
            i--;
        }

        // Count the length of the last word
        while (i >= 0 && s[i] != ' ')
        {
            length++;
            i--;
        }

        return length;
    }
};

int main()
{
    Solution solution;
    string s1 = "Hello World";
    int result1 = solution.lengthOfLastWord(s1);
    cout << "Result: " << result1 << endl; // Output: 5

    string s2 = "   fly me   to   the moon  ";
    int result2 = solution.lengthOfLastWord(s2);
    cout << "Result: " << result2 << endl; // Output: 4

    string s3 = "luffy is still joyboy";
    int result3 = solution.lengthOfLastWord(s3);
    cout << "Result: " << result3 << endl; // Output: 6

    string s4 = "a ";
    int result4 = solution.lengthOfLastWord(s4);
    cout << "Result: " << result4 << endl; // Output: 1

    return 0;
}
