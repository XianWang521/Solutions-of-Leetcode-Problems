import java.util.PriorityQueue;

/*
 * @lc app=leetcode.cn id=295 lang=java
 *
 * [295] 数据流的中位数
 */

// @lc code=start
class MedianFinder {
    PriorityQueue<Integer> smaller;
    PriorityQueue<Integer> bigger;

    public MedianFinder() {
        // Max Heap
        smaller = new PriorityQueue<>((a, b) -> (b - a));
        // Min Heap
        bigger =  new PriorityQueue<>();
    }
    
    public void addNum(int num) {
        if(smaller.isEmpty() || num <= smaller.peek()){
            smaller.add(num);
            if(bigger.size() < smaller.size() - 1) bigger.add(smaller.poll());
        }
        else{
            bigger.add(num);
            if(bigger.size() > smaller.size()) smaller.add(bigger.poll());
        }
    }
    
    public double findMedian() {
        if(smaller.size() != bigger.size()) return (double)smaller.peek();
        else return (double)(smaller.peek() + bigger.peek()) / 2.0;
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
// @lc code=end

