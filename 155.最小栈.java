import java.util.Deque;
import java.util.LinkedList;

/*
 * @lc app=leetcode.cn id=155 lang=java
 *
 * [155] 最小栈
 */

// @lc code=start
class MinStack {
    private Deque<Integer> stack;
    private Deque<Integer> minstack;
    /** initialize your data structure here. */
    public MinStack() {
        stack = new LinkedList<Integer>();
        minstack = new LinkedList<Integer>();
    }
    
    public void push(int val) {
        stack.push(val);
        if(minstack.isEmpty()) minstack.push(val);
        else if(val <= minstack.peek()) minstack.push(val);
    }
    
    public void pop() {
        if(stack.pop().equals(minstack.peek())) minstack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minstack.peek();
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
// @lc code=end

