package Solution;

import Util.ListNode;

public class ReverseList {
    //206. Reverse Linked List - https://leetcode.com/problems/reverse-linked-list/description/
    public ListNode reverseList(ListNode head) {
        if(head == null) return null;

        ListNode node = head;
        ListNode reverse = null;

        while(node != null) {
            ListNode temp = node.next;
            node.next = reverse;
            reverse = node;
            node = temp;
        }

        return reverse;
    }
}
