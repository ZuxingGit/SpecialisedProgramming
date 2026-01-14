#include <vector>
#include <iostream>
using namespace std;

class Solution492 {
public:
    vector<int> constructRectangle(int area) {
        int width = static_cast<int>(sqrt(area));
        while (area % width != 0) {
            width--;
        }
        int length = area / width;
        return {length, width};
    }
};

int main() {
    Solution492 solution;

    int area1 = 4;
    vector<int> result1 = solution.constructRectangle(area1);
    // Output: [2, 2]
    cout << "[" << result1[0] << ", " << result1[1] << "]" << endl;

    int area2 = 37;
    vector<int> result2 = solution.constructRectangle(area2);
    // Output: [37, 1]
    cout << "[" << result2[0] << ", " << result2[1] << "]" << endl;

    int area3 = 122122;
    vector<int> result3 = solution.constructRectangle(area3);
    // Output: [427, 286]
    cout << "[" << result3[0] << ", " << result3[1] << "]" << endl;

    return 0;
    
}