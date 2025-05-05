package Solution;

import Util.ListNode;

public class DeleteDuplicates {
    //83. Remove Duplicates from Sorted List - https://leetcode.com/problems/remove-duplicates-from-sorted-list/description/
    public ListNode deleteDuplicates(ListNode head) {

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
