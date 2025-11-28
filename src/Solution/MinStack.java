package Solution;

public class MinStack {
    //155. Min Stack - https://leetcode.com/problems/min-stack/description/
    int[] arr;
    int idx = 0;

    public MinStack() {
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
