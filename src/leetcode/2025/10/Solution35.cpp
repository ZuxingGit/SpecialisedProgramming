#include <iostream>
#include <vector>
using namespace std;

class Solution
{
public:
    int searchInsert(vector<int> &nums, int target)
    {
        int left = 0;
        int right = nums.size() - 1;

        while (left <= right)
        {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target)
            {
                return mid;
            }
            else if (nums[mid] < target)
            {
                left = mid + 1;
            }
            else
            {
                right = mid - 1;
            }
        }
        return left;
    }
};

int main()
{
    Solution solution;
    vector<int> nums1 = {1, 3, 5, 6};
    int target1 = 5;
    int index1 = solution.searchInsert(nums1, target1);
    cout << index1 << endl;
    // Output: 2

    vector<int> nums2 = {1, 3, 5, 6};
    int target2 = 2;
    int index2 = solution.searchInsert(nums2, target2);
    cout << index2 << endl;
    // Output: 1

    vector<int> nums3 = {1, 3, 5, 6};
    int target3 = 7;
    int index3 = solution.searchInsert(nums3, target3);
    cout << index3 << endl;
    // Output: 4

    vector<int> nums4 = {1, 3, 5, 6};
    int target4 = 0;
    int index4 = solution.searchInsert(nums4, target4);
    cout << index4 << endl;
    // Output: 0

    return 0;
}