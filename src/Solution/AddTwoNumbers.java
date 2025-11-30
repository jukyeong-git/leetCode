package Solution;

import Util.ListNode;

public class AddTwoNumbers {
    //2. Add Two Numbers - https://leetcode.com/problems/add-two-numbers/description/
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum = 0, up = 0;
        ListNode node = new ListNode();
        ListNode result = node;

        while(l1 != null || l2 != null || up != 0){
            sum = up;

            if(l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if(l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            up = sum / 10;
            node.next = new ListNode(sum % 10);
            node = node.next;
        }

        return result.next;
    }
}
