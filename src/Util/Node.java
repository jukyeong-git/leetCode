package Util;

public class Node {
    public int key;
    public int val;
    public Node prev;
    public Node next;
    public Node random;

    public Node(int val) {
        this.key = 0;
        this.val = val;
        this.prev = null;
        this.next = null;
        this.random = null;
    }

    public Node(int key, int val) {
        this.key = key;
        this.val = val;
        this.prev = null;
        this.next = null;
        this.random = null;
    }
}
