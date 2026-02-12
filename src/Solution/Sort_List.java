package Solution;

import Util.ListNode;

import java.util.List;

public class Sort_List {
    //148. Sort List - https://leetcode.com/problems/sort-list/description/

    /*
     * Given the head of a linked list, return the list after sorting it in ascending order.
     *
     * Example 1:
     *      Input: head = [4,2,1,3]
     *      Output: [1,2,3,4]
     *
     * Example 2:
     *      Input: head = [-1,5,3,4,0]
     *      Output: [-1,0,3,4,5]
     *
     * Example 3:
     *      Input: head = []
     *      Output: []
     *
     * Constraints:
     *      The number of nodes in the list is in the range [0, 5 * 104].
     *      -105 <= Node.val <= 105
     *
     * Follow up:
     *      Can you sort the linked list in O(n logn) time and O(1) memory (i.e. constant space)?
     */
    public static ListNode sortList(ListNode head) {

        if(head == null || head.next == null) {
            return head;
        }

        ListNode left = head;
        ListNode right = getMid(head);
        ListNode temp = right.next;
        right.next = null;
        right = temp;

        left = sortList(left);
        right = sortList(right);

        return merge(left, right);
    }

    private static ListNode merge(ListNode left, ListNode right) {
        ListNode dummy = new ListNode();
        ListNode tail = dummy;

        while(left != null && right != null) {
            if(left.val < right.val) {
                tail.next = left;
                left = left.next;
            } else {
                tail.next = right;
                right = right.next;
            }
            tail = tail.next;
        }

        if(left != null) {
            tail.next = left;
        }

        if(right != null) {
            tail.next = right;
        }

        return dummy.next;
    }

    private static ListNode getMid(ListNode node) {

        ListNode slow = node, fast = node.next;

        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }
}
