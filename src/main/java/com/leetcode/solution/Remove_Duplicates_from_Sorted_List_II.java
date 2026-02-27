package com.leetcode.solution;

import com.leetcode.common.util.ListNode;

public class Remove_Duplicates_from_Sorted_List_II {
    //82. Remove Duplicates from Sorted List II - https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/description/

    /*
     * Given the head of a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list.
     * Return the linked list sorted as well.
     *
     * Example 1:
     *      Input: head = [1,2,3,3,4,4,5]
     *      Output: [1,2,5]
     *
     * Example 2:
     *      Input: head = [1,1,1,2,3]
     *      Output: [2,3]
     *
     * Constraints:
     *      The number of nodes in the list is in the range [0, 300].
     *      -100 <= Node.val <= 100
     *
     * The list is guaranteed to be sorted in ascending order.
     */
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode res = new ListNode(0, head);
        ListNode prev = res;
        ListNode curr = head;

        while(curr != null && curr.next != null) {
            if(curr.val == curr.next.val) {
                while(curr.next != null && curr.val == curr.next.val)
                    curr = curr.next;
                prev.next = curr.next;
            } else {
                prev = prev.next;
            }
            curr = curr.next;
        }

        return res.next;
    }
}
