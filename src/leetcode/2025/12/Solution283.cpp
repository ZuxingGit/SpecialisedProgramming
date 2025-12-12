#include <iostream>
#include <vector>
using namespace std;

class Solution283
{
public:
    void moveZeroes(vector<int> &nums)
    {
        int insertPos = 0;
        for (int num : nums)
        {
            if (num != 0)
            {
                nums[insertPos++] = num;
            }
        }
        while (insertPos < nums.size())
        {
            nums[insertPos++] = 0;
        }
    }
};

int main()
{
    Solution283 solution;

    vector<int> nums1 = {0, 1, 0, 3, 12};
    solution.moveZeroes(nums1);
    for (int num : nums1)
    {
        cout << num << " ";
    }
    cout << endl;

    vector<int> nums2 = {0};
    solution.moveZeroes(nums2);
    for (int num : nums2)
    {
        cout << num << " ";
    }
    cout << endl;

    return 0;
}