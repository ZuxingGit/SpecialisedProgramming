#include <iostream>
using namespace std;

//  Definition for singly-linked list.
struct ListNode
{
    int val;
    ListNode *next;
    ListNode() : val(0), next(nullptr) {}
    ListNode(int x) : val(x), next(nullptr) {}
    ListNode(int x, ListNode *next) : val(x), next(next) {}
};

class Solution
{
public:
    ListNode *deleteDuplicates(ListNode *head)
    {
        if (!head)
            return nullptr;

        ListNode *current = head;
        while (current->next)
        {
            if (current->val == current->next->val)
            {
                ListNode *temp = current->next;
                current->next = current->next->next;
                delete temp;
            }
            else
            {
                current = current->next;
            }
        }
        return head;
    }
};

int main()
{
    Solution solution;
    // Test case 1: List with duplicates
    ListNode *head1 = new ListNode(1, new ListNode(1, new ListNode(2)));
    ListNode *result1 = solution.deleteDuplicates(head1);
    // Expected Output: 1 -> 2
    while (result1)
    {
        std::cout << result1->val << " ";
        result1 = result1->next;
    }
    std::cout << std::endl;

    // Test case 2: List with multiple duplicates
    ListNode *head2 = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3)))));
    ListNode *result2 = solution.deleteDuplicates(head2);
    // Expected Output: 1 -> 2 -> 3
    while (result2)
    {
        std::cout << result2->val << " ";
        result2 = result2->next;
    }
    std::cout << std::endl;

    return 0;
}