package leetcode.wk4;

public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode LN1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode LN2 = new ListNode(1, new ListNode(2, new ListNode(3)));
        ListNode LN3 = null;
        printListNode(LN1);
        printListNode(reverseList(LN1));
        printListNode(LN2);
        printListNode(reverseList(LN2));
        printListNode(LN3);
        printListNode(reverseList(LN3));
    }

    public static ListNode reverseList(ListNode head) {
        if (head == null)
            return null;
        // structure: val + next;
        // recursion
        ListNode tmpListNode = null;
        
        return revList(tmpListNode, head);
    }

    /**
     * recursion function
     *
     * @param newLn
     * @param oldLn
     * @return
     */
    public static ListNode revList(ListNode newLn, ListNode oldLn){
        if (oldLn.next==null)// base case
            return new ListNode(oldLn.val, newLn);
         
        return revList(new ListNode(oldLn.val, newLn), oldLn.next);
    }
    
    public static void printListNode(ListNode head) {
        if (head==null){
            System.out.println("empty");
        }
        while (head != null) {
            if (head.next != null)
                System.out.print(head.val + "->");
            else
                System.out.println(head.val);
            head = head.next;
        }
    }
}
