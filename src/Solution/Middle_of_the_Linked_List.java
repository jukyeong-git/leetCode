package Solution;

import Util.ListNode;

public class Middle_of_the_Linked_List {
    //876. Middle of the Linked List - https://leetcode.com/problems/middle-of-the-linked-list/description/

    /*
     * Given the head of a singly linked list, return the middle node of the linked list.
     * If there are two middle nodes, return the second middle node.
     *
     * Example 1:
     *      Input: head = [1,2,3,4,5]
     *      Output: [3,4,5]
     * Explanation:
     *      The middle node of the list is node 3.
     *
     * Example 2:
     *      Input: head = [1,2,3,4,5,6]
     *      Output: [4,5,6]
     * Explanation:
     *      Since the list has two middle nodes with values 3 and 4, we return the second one.
     *
     * Constraints:
     *      The number of nodes in the list is in the range [1, 100].
     *      1 <= Node.val <= 100
     */
    public static ListNode middleNode(ListNode head) {

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
