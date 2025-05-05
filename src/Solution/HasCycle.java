package Solution;

import Util.ListNode;

public class HasCycle {
    //141. Linked List Cycle - https://leetcode.com/problems/linked-list-cycle/description/
    public boolean hasCycle(ListNode head) {
        if(head == null) return false;

        ListNode slow = head;
        ListNode fast = head.next;

        while(slow != fast) {
            if(fast == null || fast.next == null)
                return false;

            slow = slow.next;
            fast = fast.next.next;
        }

        return true;
    }
}
