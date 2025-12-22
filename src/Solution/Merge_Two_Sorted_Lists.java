package Solution;

import Util.ListNode;

public class Merge_Two_Sorted_Lists {
    //21. Merge Two Sorted Lists - https://leetcode.com/problems/merge-two-sorted-lists/description/
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode node = new ListNode();
        ListNode result = node;

        while(list1 != null || list2 != null) {
            if(list1 != null && list2 !=null) {
                if(list1.val <= list2.val) {
                    node.next = new ListNode(list1.val);
                    node = node.next;
                    list1 = list1.next;
                } else {
                    node.next = new ListNode(list2.val);
                    node = node.next;
                    list2 = list2.next;
                }
            } else if(list1 != null) {
                node.next = new ListNode(list1.val);
                node = node.next;
                list1 = list1.next;
            } else {
                node.next = new ListNode(list2.val);
                node = node.next;
                list2 = list2.next;
            }
        }

        return result.next;
    }
}
