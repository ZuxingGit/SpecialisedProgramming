class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class Solution160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }

        ListNode pointerA = headA;
        ListNode pointerB = headB;

        while (pointerA != pointerB) {
            pointerA = (pointerA == null) ? headB : pointerA.next;
            pointerB = (pointerB == null) ? headA : pointerB.next;
        }

        return pointerA;
    }

    public static void main(String[] args) {
        Solution160 solution = new Solution160();

        // Example 1
        ListNode common = new ListNode(8, new ListNode(4, new ListNode(5)));
        ListNode headA1 = new ListNode(4, new ListNode(1, common));
        ListNode headB1 = new ListNode(5, new ListNode(0, new ListNode(1, common)));
        ListNode result1 = solution.getIntersectionNode(headA1, headB1);
        System.out.println("Example 1: " + (result1 != null ? result1.val : "null"));
        // Expected: 8

        // Example 2
        ListNode headA2 = new ListNode(2, new ListNode(6, new ListNode(4)));
        ListNode headB2 = new ListNode(1, new ListNode(5));
        ListNode result2 = solution.getIntersectionNode(headA2, headB2);
        System.out.println("Example 2: " + (result2 != null ? result2.val : "null"));
        // Expected: null

        // Example 3
        ListNode common3 = new ListNode(3);
        ListNode headA3 = new ListNode(1, new ListNode(9, new ListNode(1, common3)));
        ListNode headB3 = new ListNode(2, common3);
        ListNode result3 = solution.getIntersectionNode(headA3, headB3);
        System.out.println("Example 3: " + (result3 != null ? result3.val : "null"));
        // Expected: 3
    }
}
