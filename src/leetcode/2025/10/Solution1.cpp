#include <vector>
#include <unordered_map>
#include <iostream>
using namespace std;

class Solution
{
public:
    /**
     * Finds two indices in the input vector such that their corresponding values add up to the target.
     * @param nums The vector of integers to search.
     * @param target The target sum.
     * @return A vector containing the indices of the two numbers that add up to the target.
     */
    vector<int> twoSum(vector<int> &nums, int target)
    {
        unordered_map<int, int> numMap;
        for (int i = 0; i < nums.size(); i++)
        {
            int complement = target - nums[i];
            if (numMap.find(complement) != numMap.end())
            {
                return {numMap[complement], i};
            }
            numMap[nums[i]] = i;
        }
        return {};
    }
};

int main()
{
    Solution solution;
    vector<int> nums = {2, 7, 11, 15};
    int target = 9;
    vector<int> result = solution.twoSum(nums, target);
    cout << "Indices: " << result[0] << ", " << result[1] << endl;

    vector<int> nums2 = {3, 2, 4};
    target = 6;
    result = solution.twoSum(nums2, target);
    cout << "Indices: " << result[0] << ", " << result[1] << endl;

    vector<int> nums3 = {3, 3};
    target = 6;
    result = solution.twoSum(nums3, target);
    cout << "Indices: " << result[0] << ", " << result[1] << endl;
    return 0;
}