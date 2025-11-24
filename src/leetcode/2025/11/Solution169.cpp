#include <vector>
using namespace std;

class Solution
{
public:
    int majorityElement(vector<int> &nums)
    {
        int count = 0;
        int candidate = 0;

        for (int num : nums)
        {
            if (count == 0)
            {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }
};

int main()
{
    // Example 1
    Solution solution;
    vector<int> nums1 = {3, 2, 3};
    int result1 = solution.majorityElement(nums1);
    // Expected Output: 3
    printf("Majority Element: %d\n", result1);

    // Example 2
    vector<int> nums2 = {2, 2, 1, 1, 1, 2, 2};
    int result2 = solution.majorityElement(nums2);
    // Expected Output: 2
    printf("Majority Element: %d\n", result2);

    return 0;
}