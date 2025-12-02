#include <cstdio>
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
    ListNode *removeElements(ListNode *head, int val)
    {
        ListNode *dummy = new ListNode(0);
        dummy->next = head;
        ListNode *current = dummy;

        while (current->next != nullptr)
        {
            if (current->next->val == val)
            {
                ListNode *temp = current->next;
                current->next = current->next->next;
                delete temp; // Free memory
            }
            else
            {
                current = current->next;
            }
        }

        ListNode *newHead = dummy->next;
        delete dummy; // Free memory
        return newHead;
    }
};

int main()
{
    // Example usage:
    Solution solution;

    // Creating a linked list: 1 -> 2 -> 6 -> 3 -> 4 -> 5 -> 6
    ListNode *head = new ListNode(1);
    head->next = new ListNode(2);
    head->next->next = new ListNode(6);
    head->next->next->next = new ListNode(3);
    head->next->next->next->next = new ListNode(4);
    head->next->next->next->next->next = new ListNode(5);
    head->next->next->next->next->next->next = new ListNode(6);

    int valToRemove = 6;
    ListNode *newHead = solution.removeElements(head, valToRemove);

    // Print the modified linked list
    ListNode *current = newHead;
    while (current != nullptr)
    {
        printf("%d ", current->val);
        current = current->next;
    }
    printf("\n");

    // Free remaining nodes
    current = newHead;
    while (current != nullptr)
    {
        ListNode *temp = current;
        current = current->next;
        delete temp;
    }

    return 0;
}