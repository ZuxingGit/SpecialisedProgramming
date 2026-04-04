#include <iostream>
#include <vector>

using namespace std;

class Solution {
public:
    char nextGreatestLetter(vector<char>& letters, char target) {
        int left = 0, right = letters.size() - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (letters[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return letters[left % letters.size()];
    }
};

int main() {
    Solution solution;

    vector<char> letters1 = {'c', 'f', 'j'};
    char target1 = 'a';
    cout << solution.nextGreatestLetter(letters1, target1) << endl; // Output: 'c'

    vector<char> letters2 = {'c', 'f', 'j'};
    char target2 = 'c';
    cout << solution.nextGreatestLetter(letters2, target2) << endl; // Output: 'f'

    vector<char> letters3 = {'x', 'x', 'y', 'y'};
    char target3 = 'z';
    cout << solution.nextGreatestLetter(letters3, target3) << endl; // Output: 'x'

    return 0;
}