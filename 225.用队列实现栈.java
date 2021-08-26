import java.util.LinkedList;
import java.util.Queue;

/*
 * @lc app=leetcode.cn id=225 lang=java
 *
 * [225] 用队列实现栈
 */

// @lc code=start
// One queue
class MyStack {
    Queue<Integer> q;
    public MyStack(){
        q = new LinkedList<Integer>();
    }
    public void push(int x){
        int size = q.size();
        q.offer(x);
        for(int i = 0; i < size; i++) q.offer(q.poll());
    }
    public int pop(){
        return q.poll();
    }
    public int top(){
        return q.peek();
    }
    public boolean empty(){
        return q.isEmpty();
    }
}
/* Two queues
class MyStack {
    Queue<Integer> q1;
    Queue<Integer> q2;
    /** Initialize your data structure here. */
    /*
    public MyStack() {
        q1 = new LinkedList<Integer>();
        q2 = new LinkedList<Integer>();
    }
    
    /** Push element x onto stack. */
    /*
    public void push(int x) {
        q2.offer(x);
        while(!q1.isEmpty())
            q2.offer(q1.poll());
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }
    
    /** Removes the element on top of the stack and returns that element. */
    /*
    public int pop() {
        return q1.poll();
    }
    
    /** Get the top element. */
    /*
    public int top() {
        return q1.peek();
    }
    
    /** Returns whether the stack is empty. */
    /*
    public boolean empty() {
        return q1.isEmpty();
    }
}
*/
/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
// @lc code=end

