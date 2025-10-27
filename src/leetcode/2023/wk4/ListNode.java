package leetcode.wk4;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this != null) {
            sb.append(this.val);
        }
        if (this.next != null) {
            sb.append(",").append(this.next.toString());
        }
        return sb.toString();
    }
}
