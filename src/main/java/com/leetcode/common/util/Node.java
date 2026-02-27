package com.leetcode.common.util;

import java.util.ArrayList;
import java.util.List;

public class Node {
    public int key;
    public int val;
    public Node left;
    public Node right;
    public Node prev;
    public Node next;
    public Node random;
    public List<Node> neighbors;

    public Node() {
        val = 0;
        this.neighbors = new ArrayList<Node>();
    }

    public Node(int val) {
        this.key = 0;
        this.val = val;
        this.left = null;
        this.right = null;
        this.prev = null;
        this.next = null;
        this.random = null;
        this.neighbors = new ArrayList<Node>();
    }

    public Node(int key, ArrayList<Node> neighbors) {
        this.key = key;
        this.val = val;
        this.left = null;
        this.right = null;
        this.prev = null;
        this.next = null;
        this.random = null;
        this.neighbors = neighbors;
    }

    public Node(int key, int val) {
        this.key = key;
        this.val = val;
        this.left = null;
        this.right = null;
        this.prev = null;
        this.next = null;
        this.random = null;
    }
}
