package Solution;

import Util.ListNode;

public class MiddleNode {
    //876. Middle of the Linked List - https://leetcode.com/problems/middle-of-the-linked-list/description/
    public ListNode middleNode(ListNode head) {

        ListNode node = head;
        int count = 0;

        while(node != null) {
            count++;
            node = node.next;
        }

        count = count/2;

        for(int i = 0; i < count; i++)
            head = head.next;

        return head;

    }
}
