package Solution;

import Util.ListNode;

import java.util.HashSet;

public class LinkedListCycle {
    //141. Linked List Cycle - https://leetcode.com/problems/linked-list-cycle/description/
    public static boolean hasCycle(ListNode head) {

        /*
        if(head == null) return false;

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast)
                return true;
        }

        return false;
        */

        HashSet<ListNode> hSet = new HashSet<>();

        while(head != null) {
            if(hSet.contains(head)) {
                return true;
            } else {
                hSet.add(head);
                head = head.next;
            }
        }

        return false;
    }
}
