package com.leetcode.common.util;

import java.util.LinkedList;
import java.util.Queue;

public class QuadTreeNode {

    public boolean val;
    public boolean isLeaf;
    public QuadTreeNode topLeft;
    public QuadTreeNode topRight;
    public QuadTreeNode bottomLeft;
    public QuadTreeNode bottomRight;

    public QuadTreeNode() {
        this.val = false;
        this.isLeaf = false;
        this.topLeft = null;
        this.topRight = null;
        this.bottomLeft = null;
        this.bottomRight = null;
    }

    public QuadTreeNode(boolean val, boolean isLeaf) {
        this.val = val;
        this.isLeaf = isLeaf;
        this.topLeft = null;
        this.topRight = null;
        this.bottomLeft = null;
        this.bottomRight = null;
    }

    public QuadTreeNode(boolean val, boolean isLeaf, QuadTreeNode topLeft, QuadTreeNode topRight, QuadTreeNode bottomLeft, QuadTreeNode bottomRight) {
        this.val = val;
        this.isLeaf = isLeaf;
        this.topLeft = topLeft;
        this.topRight = topRight;
        this.bottomLeft = bottomLeft;
        this.bottomRight = bottomRight;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Queue<QuadTreeNode> queue = new LinkedList<>();
        queue.offer(this);

        sb.append("[");
        boolean first = true;

        while (!queue.isEmpty()) {
            QuadTreeNode node = queue.poll();

            if (!first) sb.append(",");
            first = false;

            // [isLeaf, val] 형태로 추가
            sb.append("[")
                    .append(node.isLeaf ? 1 : 0)
                    .append(",")
                    .append(node.val ? 1 : 0)
                    .append("]");

            // 리프 노드가 아닐 때만 자식을 큐에 추가
            if (!node.isLeaf) {
                queue.offer(node.topLeft);
                queue.offer(node.topRight);
                queue.offer(node.bottomLeft);
                queue.offer(node.bottomRight);
            }
        }

        sb.append("]");
        return sb.toString();
    }
}
