#include <vector>
#include <string>

class Solution
{
public:
    vector<string> summaryRanges(vector<int> &nums)
    {
        vector<string> result;

        if (nums.empty())
        {
            return result;
        }

        int start = nums[0];

        for (int i = 1; i <= nums.size(); i++)
        {
            // break range if not consecutive or end of array
            if (i == nums.size() || nums[i] != nums[i - 1] + 1)
            {

                if (start == nums[i - 1])
                {
                    // single number
                    result.push_back(to_string(start));
                }
                else
                {
                    // range: start->end
                    result.push_back(to_string(start) + "->" + to_string(nums[i - 1]));
                }

                if (i < nums.size())
                {
                    start = nums[i];
                }
            }
        }

        return result;
    }
};