#include <iostream>
#include <string>
using namespace std;

class Solution
{
public:
    int strStr(string haystack, string needle)
    {
        if (needle.empty())
        {
            return 0;
        }
        int haystackLength = haystack.length();
        int needleLength = needle.length();

        for (int i = 0; i <= haystackLength - needleLength; i++)
        {
            if (haystack.substr(i, needleLength) == needle)
            {
                return i;
            }
        }
        return -1;
    }
};

int main()
{
    Solution solution;
    string haystack1 = "hello";
    string needle1 = "ll";
    int index1 = solution.strStr(haystack1, needle1);
    cout << index1 << endl;
    // Output: 2

    string haystack2 = "aaaaa";
    string needle2 = "bba";
    int index2 = solution.strStr(haystack2, needle2);
    cout << index2 << endl;
    // Output: -1

    string haystack3 = "";
    string needle3 = "";
    int index3 = solution.strStr(haystack3, needle3);
    cout << index3 << endl;
    // Output: 0

    return 0;
}