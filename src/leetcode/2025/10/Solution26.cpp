#include <iostream>
#include <vector>
using namespace std;

class Solution
{
public:
    int removeDuplicates(vector<int> &nums)
    {
        if (nums.empty())
            return 0;

        int writeIndex = 1;
        for (int readIndex = 1; readIndex < nums.size(); readIndex++)
        {
            if (nums[readIndex] != nums[readIndex - 1])
            {
                nums[writeIndex] = nums[readIndex];
                writeIndex++;
            }
        }
        return writeIndex;
    }
};

int main()
{
    Solution solution;
    vector<int> nums1 = {1, 1, 2};
    int len1 = solution.removeDuplicates(nums1);
    cout << len1 << endl; // Output: 2

    vector<int> nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
    int len2 = solution.removeDuplicates(nums2);
    cout << len2 << endl; // Output: 5

    return 0;
}