package com.leetcode.common.util;

import java.util.*;

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

    public Node(int[][] adjList) {

        int n = adjList.length;

        // Handle empty array case: Initialize as an empty node
        if (n == 0) {
            this.val = 0;
            this.neighbors = new ArrayList<>();
            return;
        }

        // [Core 1] Explicitly set 'this' as the 1st node.
        this.val = 1;
        this.neighbors = new ArrayList<>();

        // [Core 2] Create an array to hold the nodes, and place 'this' at index 1!
        Node[] nodes = new Node[n + 1];
        nodes[1] = this;

        // Pre-create the rest of the nodes from index 2 to n.
        for (int i = 2; i <= n; i++) {
            nodes[i] = new Node(i);
        }

        // Iterate through the adjacency list array and connect the edges.
        for (int i = 1; i <= n; i++) {
            for (int neighborVal : adjList[i - 1]) {
                nodes[i].neighbors.add(nodes[neighborVal]);
            }
        }
    }

    @Override
    public String toString() {
        if (this.val == 0) return "[]"; // Handle empty graph case

        // Use TreeMap to sort by node number (1, 2, 3...) automatically
        Map<Integer, List<Integer>> map = new TreeMap<>();
        Queue<Node> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();

        // BFS Initialization
        queue.add(this);
        visited.add(this.val);

        // Perform BFS traversal to collect all nodes and their neighbor relationships
        while (!queue.isEmpty()) {
            Node curr = queue.poll();
            List<Integer> neighborVals = new ArrayList<>();

            for (Node neighbor : curr.neighbors) {
                neighborVals.add(neighbor.val);
                // If it's a newly discovered neighbor, add to the queue for future processing
                if (!visited.contains(neighbor.val)) {
                    visited.add(neighbor.val);
                    queue.add(neighbor);
                }
            }
            map.put(curr.val, neighborVals);
        }

        // Assemble the collected data into a string format like [[2, 4], [1, 3], ...]
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        int n = map.size();
        for (int i = 1; i <= n; i++) {
            // Java's default List.toString() outputs nicely as "[2, 4]"
            sb.append(map.getOrDefault(i, new ArrayList<>()).toString());
            if (i < n) {
                sb.append(", "); // Add a comma if it's not the last node
            }
        }

        sb.append("]");
        return sb.toString();
    }
}
