#include <iostream>
#include <vector>
using namespace std;

class Solution
{
public:
    void merge(vector<int> &nums1, int m, vector<int> &nums2, int n)
    {
        int p1 = m - 1;    // Pointer for nums1
        int p2 = n - 1;    // Pointer for nums2
        int p = m + n - 1; // Pointer for merged array

        // Merge in reverse order
        while (p1 >= 0 && p2 >= 0)
        {
            if (nums1[p1] > nums2[p2])
            {
                nums1[p] = nums1[p1];
                p1--;
            }
            else
            {
                nums1[p] = nums2[p2];
                p2--;
            }
            p--;
        }

        // If there are remaining elements in nums2, copy them
        while (p2 >= 0)
        {
            nums1[p] = nums2[p2];
            p2--;
            p--;
        }
        // (No need to copy remaining elements from nums1 as they are already in place)
    }
};

int main()
{
    Solution solution;
    vector<int> nums1 = {1, 2, 3, 0, 0, 0};
    vector<int> nums2 = {2, 5, 6};
    int m = 3; // Number of initialized elements in nums1
    int n = 3; // Number of elements in nums2

    solution.merge(nums1, m, nums2, n);

    // Expected Output: 1 2 2 3 5 6
    for (int num : nums1)
    {
        cout << num << " ";
    }
    cout << endl;

    return 0;
}