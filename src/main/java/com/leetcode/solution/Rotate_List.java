package com.leetcode.solution;

import com.leetcode.common.util.ListNode;

public class Rotate_List {
    //61. Rotate List - https://leetcode.com/problems/rotate-list/description/

    /*
     * Given the head of a linked list, rotate the list to the right by k places.
     *
     * Example 1:
     *      Input: head = [1,2,3,4,5], k = 2
     *      Output: [4,5,1,2,3]
     *
     * Example 2:
     *      Input: head = [0,1,2], k = 4
     *      Output: [2,0,1]
     *
     * Constraints:
     *      The number of nodes in the list is in the range [0, 500].
     *      -100 <= Node.val <= 100
     *      0 <= k <= 2 * 109
     */
    public static ListNode rotateRight(ListNode head, int k) {
        if(head == null || k == 0) return head;

        int len = 1;
        ListNode loop = head;
        while(loop.next != null) {
            len++;
            loop = loop.next;
        }

        int pos = k%len;
        if(pos == 0) return head;

        ListNode curr = head;
        for(int i = 1; i < len - pos; i++) {
            curr = curr.next;
        }

        ListNode res = curr.next;
        curr.next = null;
        loop.next = head;

        return res;
    }
}
