import java.util.ArrayList;
import java.util.List;

class ListNode {
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

public class Solution234 {
    public boolean isPalindrome(ListNode head) {
        List<Integer> arr = new ArrayList<>();

        while (head != null) {
            arr.add(head.val);
            head = head.next;
        }

        int left = 0;
        int right = arr.size() - 1;

        while (left < right) {
            if (!arr.get(left).equals(arr.get(right))) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        Solution234 sol = new Solution234();

        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1))));
        boolean res1 = sol.isPalindrome(l1);
        System.out.println(res1);
    }
}
