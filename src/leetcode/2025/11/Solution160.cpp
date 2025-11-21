#include <iostream>
using namespace std;

struct ListNode
{
    int val;
    ListNode *next;
    ListNode(int x) : val(x), next(NULL) {}
};

class Solution
{
public:
    ListNode *getIntersectionNode(ListNode *headA, ListNode *headB)
    {
        if (headA == nullptr || headB == nullptr)
        {
            return nullptr;
        }

        ListNode *pointerA = headA;
        ListNode *pointerB = headB;

        while (pointerA != pointerB)
        {
            pointerA = (pointerA == nullptr) ? headB : pointerA->next;
            pointerB = (pointerB == nullptr) ? headA : pointerB->next;
        }

        return pointerA;
    }
};

int main()
{
    // Example usage:
    Solution solution;

    // Constructing two linked lists that intersect:
    // List A: 1 -> 2 \
    //                  -> 8 -> 4 -> 5
    // List B:      3 /
    ListNode *common = new ListNode(8);
    common->next = new ListNode(4);
    common->next->next = new ListNode(5);

    ListNode *headA = new ListNode(1);
    headA->next = new ListNode(2);
    headA->next->next = common;

    ListNode *headB = new ListNode(3);
    headB->next = common;

    ListNode *intersection = solution.getIntersectionNode(headA, headB);
    if (intersection)
    {
        cout << "Intersection at node with value: " << intersection->val << endl;
    }
    else
    {
        cout << "No intersection." << endl;
    }

    // Clean up memory
    delete headA->next;        // Node with value 2
    delete headA;              // Node with value 1
    delete headB;              // Node with value 3
    delete common->next->next; // Node with value 5
    delete common->next;       // Node with value 4
    delete common;             // Node with value 8

    return 0;
}