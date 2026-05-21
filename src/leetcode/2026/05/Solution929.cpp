#include <string>
#include <unordered_set>
#include <iostream>
using namespace std;

class Solution929 {
public:
    int numUniqueEmails(vector<string>& emails) {
        unordered_set<string> uniqueEmails;

        for (const string& email : emails) {
            string localName;
            string domainName;
            bool ignoreLocal = false;

            for (char c : email) {
                if (c == '@') {
                    domainName = email.substr(email.find('@') + 1);
                    break;
                }
                if (c == '+') {
                    ignoreLocal = true;
                } else if (c != '.' && !ignoreLocal) {
                    localName += c;
                }
            }

            uniqueEmails.insert(localName + "@" + domainName);
        }

        return uniqueEmails.size();
    }
};

int main() {
    Solution929 solution;

    vector<string> emails1 = { "test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com" };
    int result1 = solution.numUniqueEmails(emails1);
    cout << "Output: " << result1 << endl; // Output: 2

    vector<string> emails2 = { "a@leetcode.com", "b@leetcode.com", "c@leetcode.com"};
    int result2 = solution.numUniqueEmails(emails2);
    cout << "Output: " << result2 << endl; // Output: 3

}