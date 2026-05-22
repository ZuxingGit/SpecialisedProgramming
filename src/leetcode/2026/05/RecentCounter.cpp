#include <queue>
#include <iostream>
using namespace std;

class RecentCounter {
public:
    RecentCounter() {
        // Initializes the counter with zero recent requests
        q = queue<int>();
    }
    
    int ping(int t) {
        q.push(t);
        while (q.front() < t - 3000) {
            q.pop();
        }
        return q.size();
    }

private:
    queue<int> q;
};

int main() {
    RecentCounter recentCounter;

    cout << recentCounter.ping(1) << endl;   // Output: 1
    cout << recentCounter.ping(100) << endl; // Output: 2
    cout << recentCounter.ping(3001) << endl; // Output: 3
    cout << recentCounter.ping(3002) << endl; // Output: 3

    return 0;
}