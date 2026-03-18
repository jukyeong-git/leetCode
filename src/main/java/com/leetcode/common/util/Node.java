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

    // ==========================================
    // 💡 Constructor for 133. Clone Graph
    // Input example: [[2,4],[1,3],[2,4],[1,3]] (Adjacency list)
    // ==========================================
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

    // ==========================================
    // 💡 Constructor for 138. Copy List with Random Pointer
    // Input example: [[7,null],[13,0],[11,4],[10,2],[1,0]]
    // ==========================================
    public Node(Integer[][] arr) {

        int n = arr.length;
        if (n == 0) return;

        // 1. Set 'this' as the 0th node (Head) of the linked list.
        this.val = arr[0][0];
        this.neighbors = new ArrayList<>(); // Prevent collision with the existing graph toString()

        // 2. Pre-create nodes in an array to quickly find them by index (random_index).
        Node[] nodes = new Node[n];
        nodes[0] = this; // 🚨 Place 'this' instead of a 'new Node' at index 0!

        for (int i = 1; i < n; i++) {
            nodes[i] = new Node(arr[i][0]);
        }

        // 3. Connect the next and random pointers.
        for (int i = 0; i < n; i++) {
            // Connect next pointer (exclude the last node as it has no next)
            if (i < n - 1) {
                nodes[i].next = nodes[i + 1];
            }

            // Connect random pointer (only if it's not null, connect to the node at the corresponding index)
            Integer randomIndex = arr[i][1];
            if (randomIndex != null) {
                nodes[i].random = nodes[randomIndex];
            }
        }
    }

    @Override
    public String toString() {
        // 1. Declare StringBuilder at the very beginning
        StringBuilder sb = new StringBuilder();

        // 2. Main Scope 1: Check if it's a Graph (neighbors is not null and not empty)
        if (this.neighbors != null && !this.neighbors.isEmpty()) {

            Map<Integer, List<Integer>> map = new TreeMap<>();
            Queue<Node> queue = new LinkedList<>();
            Set<Integer> visited = new HashSet<>();

            queue.add(this);
            visited.add(this.val);

            while (!queue.isEmpty()) {
                Node curr = queue.poll();
                List<Integer> neighborVals = new ArrayList<>();

                for (Node neighbor : curr.neighbors) {
                    neighborVals.add(neighbor.val);
                    if (!visited.contains(neighbor.val)) {
                        visited.add(neighbor.val);
                        queue.add(neighbor);
                    }
                }
                map.put(curr.val, neighborVals);
            }

            // Append Graph format to StringBuilder
            sb.append("[");
            int n = map.size();
            for (int i = 1; i <= n; i++) {
                sb.append(map.getOrDefault(i, new ArrayList<>()).toString());
                if (i < n) sb.append(", ");
            }
            sb.append("]");

        }
        // 3. Main Scope 2: If it's a Random Linked List (neighbors is null or empty)
        else {

            // Step 1: Record all nodes and their order (index) in a Map.
            Map<Node, Integer> nodeToIndex = new HashMap<>();
            Node curr = this;
            int index = 0;
            while (curr != null) {
                nodeToIndex.put(curr, index++);
                curr = curr.next;
            }

            // Step 2: Append Linked List format to StringBuilder
            sb.append("[");
            curr = this;

            while (curr != null) {
                sb.append("[").append(curr.val).append(",");

                // 💡 Inner Scope: Check if the random pointer is null
                if (curr.random == null) {
                    sb.append("null");
                } else if (nodeToIndex.containsKey(curr.random)) {
                    sb.append(nodeToIndex.get(curr.random));
                } else {
                    sb.append("null");
                }

                sb.append("]");

                curr = curr.next;
                if (curr != null) {
                    sb.append(",");
                }
            }
            sb.append("]");
        }

        // 4. Return the final string at the very end
        return sb.toString();
    }
}
