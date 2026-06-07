#include <cstdio>

class Solution1009 {
public:
    int bitwiseComplement(int n) {
        if (n == 0) {
            return 1;
        }

        int mask = 1;
        while (mask <= n) {
            mask <<= 1;
        }
        return (mask - 1) ^ n;
    }
};

int main() {
    Solution1009 solution;

    int n = 5;
    int res = solution.bitwiseComplement(n);
    printf("%d\n", res);

    int n2 = 7;
    int res2 = solution.bitwiseComplement(n2);
    printf("%d\n", res2);

    int n3 = 10;
    int res3 = solution.bitwiseComplement(n3);
    printf("%d\n", res3);
    
    return 0;
}