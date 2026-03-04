package com.leetcode.common.util;

public class ListNode {

    public int val;
    public ListNode next;
    public ListNode() {}
    public ListNode(int val) { this.val = val; }
    public ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    // ==========================================
    // 💡 Add this Constructor!
    // Takes an int[] array and initializes the linked list
    // ==========================================
    public ListNode(int[] arr) {

        // Handle edge cases (null or empty array)
        if(arr == null || arr.length == 0) return;

        // 1. Set the value of the head (current node) to the first element
        val = arr[0];
        ListNode curr = this;

        // 2. Loop through the rest of the array to create and attach subsequent nodes
        for(int i = 1; i < arr.length; i++) {
            curr.next = new ListNode(arr[i]);
            curr = curr.next;
        }
    }

    // ==========================================
    // 💡 Add this toString() method!
    // This will convert the node chain into a readable format like [1, 2, 3]
    // ==========================================
    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("[");

        ListNode curr = this;
        while (curr != null) {
            sb.append(curr.val);
            if (curr.next != null) {
                sb.append(", ");
            }
            curr = curr.next;
        }

        sb.append("]");
        return sb.toString();
    }
}
