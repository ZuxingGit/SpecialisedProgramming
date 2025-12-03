#include <vector>
#include <unordered_map>
using namespace std;

class Solution219
{
public:
    bool containsNearbyDuplicate(vector<int> &nums, int k)
    {
        unordered_map<int, int> indexMap;

        for (int i = 0; i < nums.size(); i++)
        {
            if (indexMap.find(nums[i]) != indexMap.end())
            {
                if (i - indexMap[nums[i]] <= k)
                {
                    return true;
                }
            }
            indexMap[nums[i]] = i;
        }

        return false;
    }
};

int main()
{
    Solution219 solution;
    vector<int> nums1 = {1, 2, 3, 1};
    int k1 = 3;
    bool result1 = solution.containsNearbyDuplicate(nums1, k1);
    printf("%s\n", result1 ? "true" : "false");
    // Expected output: true

    vector<int> nums2 = {1, 0, 1, 1};
    int k2 = 1;
    bool result2 = solution.containsNearbyDuplicate(nums2, k2);
    printf("%s\n", result2 ? "true" : "false");
    // Expected output: true

    vector<int> nums3 = {1, 2, 3, 1, 2, 3};
    int k3 = 2;
    bool result3 = solution.containsNearbyDuplicate(nums3, k3);
    printf("%s\n", result3 ? "true" : "false");
    // Expected output: false

    return 0;
}