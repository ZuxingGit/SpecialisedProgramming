#include <string>
#include <iostream>
using namespace std;

class Solution345
{
public:
    string reverseVowels(string s)
    {
        int left = 0;
        int right = s.length() - 1;
        string vowels = "aeiouAEIOU";

        while (left < right)
        {
            while (left < right && vowels.find(s[left]) == string::npos)
            {
                left++;
            }
            while (left < right && vowels.find(s[right]) == string::npos)
            {
                right--;
            }
            if (left < right)
            {
                swap(s[left], s[right]);
                left++;
                right--;
            }
        }
        return s;
    }
};

int main()
{
    Solution345 solution;

    string input0 = "IceCreAm";
    string output0 = solution.reverseVowels(input0);
    cout <<output0<<endl; // Output: "AmCrEeIc"

    string input1 = "hello";
    string output1 = solution.reverseVowels(input1);
    cout <<output1<<endl; // Output: "holle"

    string input2 = "leetcode";
    string output2 = solution.reverseVowels(input2);
    cout <<output2<<endl; // Output: "leotcede"



    return 0;
}