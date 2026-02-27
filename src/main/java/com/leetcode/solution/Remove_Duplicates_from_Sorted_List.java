package com.leetcode.solution;

import com.leetcode.common.util.ListNode;

public class Remove_Duplicates_from_Sorted_List {
    //83. Remove Duplicates from Sorted List - https://leetcode.com/problems/remove-duplicates-from-sorted-list/description/

    /*
     * Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.
     *
     * Example 1:
     *      Input: head = [1,1,2]
     *      Output: [1,2]
     *
     * Example 2:
     *      Input: head = [1,1,2,3,3]
     *      Output: [1,2,3]
     *
     * Constraints:
     *      The number of nodes in the list is in the range [0, 300].
     *      -100 <= Node.val <= 100
     *      The list is guaranteed to be sorted in ascending order.
     */
    public static ListNode deleteDuplicates(ListNode head) {

        ListNode node = head;

        while(node != null){
            if(node.next != null && node.val == node.next.val)
                node.next = node.next.next;
            else
                node = node.next;
        }

        return head;
    }
}
