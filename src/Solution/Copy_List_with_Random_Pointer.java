package Solution;

import Util.Node;

import java.util.HashMap;
import java.util.Map;

public class Copy_List_with_Random_Pointer {
    //138. Copy List with Random Pointer - https://leetcode.com/problems/copy-list-with-random-pointer/description/
    public static Node copyRandomList(Node head) {
        if(head == null) return null;

        Map<Node, Node> map = new HashMap<>();
        Node curr = head;

        while(curr != null) {
            map.put(curr, new Node(curr.val));
            curr = curr.next;
        }

        curr = head;
        while(curr != null) {
            map.get(curr).next = map.get(curr.next);
            map.get(curr).random = map.get(curr.random);
            curr = curr.next;
        }

        return map.get(head);
    }
}
