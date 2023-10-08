package classContent.wk10;

import leetcode.wk4.ListNode;

public class MergekSortedLists {
    public static void main(String[] args) {
        //[[1,4,5],[1,3,4],[2,6]]
        ListNode[] listNodes1 = {new ListNode(1, new ListNode(4, new ListNode(5))),
                new ListNode(1, new ListNode(3, new ListNode(4))),
                new ListNode(2, new ListNode(6))};
        System.out.println(mergeKLists(listNodes1));
    }

    public static ListNode mergeKLists(ListNode[] lists) {
        int length = lists.length;
        if (length == 0)
            return null;

        return divide(lists, 0, length - 1);
    }

    public static ListNode divide(ListNode[] lists, int l, int r) {
        if (l + 1 < r) {
            int m = (r - l) / 2 + l;
            return sortAndMerge(divide(lists, l, m), divide(lists, m + 1, r));
        } else if (l + 1 == r) {
            return sortAndMerge(lists[l], lists[r]);
        } else if (l == r) {
            return lists[l];
        }
        return null;
    }

    public static ListNode sortAndMerge(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return null;
        }

        while (l1 != null || l2 != null) {
            if (l1 != null && l2 != null) {
                if (l1.val <= l2.val) {
                    return new ListNode(l1.val, sortAndMerge(l1.next, l2));
                } else {
                    return new ListNode(l2.val, sortAndMerge(l1, l2.next));
                }
            } else if (l1 != null) {
                return new ListNode(l1.val, sortAndMerge(l1.next, l2));
            } else {
                return new ListNode(l2.val, sortAndMerge(l1, l2.next));
            }
        }
        return null;
    }
}

