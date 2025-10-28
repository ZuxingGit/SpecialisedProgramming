#include <vector>
using namespace std;

class Solution
{
public:
    int removeElement(vector<int> &nums, int val)
    {
        int slow = 0;
        for (int fast = 0; fast < nums.size(); fast++)
        {
            if (nums[fast] != val)
            {
                nums[slow] = nums[fast];
                slow++;
            }
        }
        return slow;
    }
};

int main()
{
    Solution solution;
    vector<int> nums1 = {3, 2, 2, 3};
    int len1 = solution.removeElement(nums1, 3);
    // len1 should be 2, and the first two elements of nums1 should be 2
    for (int i = 0; i < len1; i++)
    {
        printf("%d ", nums1[i]);
    }
    printf("\n");

    vector<int> nums2 = {0, 1, 2, 2, 3, 0, 4, 2};
    int len2 = solution.removeElement(nums2, 2);
    // len2 should be 5, and the first five elements of nums2 should be 0, 1, 3, 0, 4
    for (int i = 0; i < len2; i++)
    {
        printf("%d ", nums2[i]);
    }
    printf("\n");

    return 0;
}