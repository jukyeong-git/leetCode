package com.leetcode.solution;

public class Min_Stack {
    //155. Min Stack - https://leetcode.com/problems/min-stack/description/

    /*
     * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
     * Implement the MinStack class:
     * - MinStack() initializes the stack object.
     * - void push(int val) pushes the element val onto the stack.
     * - void pop() removes the element on the top of the stack.
     * - int top() gets the top element of the stack.
     * - int getMin() retrieves the minimum element in the stack.
     * You must implement a com.leetcode.solution with O(1) time complexity for each function.
     *
     * Example 1:
     *      Input:  ["MinStack","push","push","push","getMin","pop","top","getMin"]
     *              [[],[-2],[0],[-3],[],[],[],[]]
     *      Output: [null,null,null,null,-3,null,0,-2]
     * Explanation
     *      MinStack minStack = new MinStack();
     *      minStack.push(-2);
     *      minStack.push(0);
     *      minStack.push(-3);
     *      minStack.getMin(); // return -3
     *      minStack.pop();
     *      minStack.top();    // return 0
     *      minStack.getMin(); // return -2
     *
     * Constraints:
     *      -231 <= val <= 231 - 1
     *      Methods pop, top and getMin operations will always be called on non-empty stacks.
     *      At most 3 * 104 calls will be made to push, pop, top, and getMin.
     */
    int[] arr;
    int idx = 0;

    public Min_Stack() {
        arr = new int[30000];
        idx = -1;
    }

    public void push(int val) {
        arr[++idx] = val;
    }

    public void pop() {
        idx--;
    }

    public int top() {
        return arr[idx];
    }

    public int getMin() {
        int min = arr[0];
        for(int i = 1; i <= idx; i++)
            min = Math.min(min, arr[i]);
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
