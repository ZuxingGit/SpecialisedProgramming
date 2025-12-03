#include <string>
#include <unordered_map>
using namespace std;

class Solution205
{
public:
    bool isIsomorphic(string s, string t)
    {
        if (s.length() != t.length())
        {
            return false;
        }

        int mapS[256] = {0};
        int mapT[256] = {0};

        for (size_t i = 0; i < s.length(); i++)
        {
            char charS = s[i];
            char charT = t[i];

            if (mapS[charS] != mapT[charT])
            {
                return false;
            }

            mapS[charS] = i + 1;
            mapT[charT] = i + 1;
        }

        return true;
    }
};

int main()
{
    Solution205 solution;
    string s1 = "egg";
    string t1 = "add";
    bool result1 = solution.isIsomorphic(s1, t1);
    printf("%s\n", result1 ? "true" : "false");
    // Expected output: true

    string s2 = "foo";
    string t2 = "bar";
    bool result2 = solution.isIsomorphic(s2, t2);
    printf("%s\n", result2 ? "true" : "false");
    // Expected output: false

    string s3 = "paper";
    string t3 = "title";
    bool result3 = solution.isIsomorphic(s3, t3);
    printf("%s\n", result3 ? "true" : "false");
    // Expected output: true

    return 0;
}