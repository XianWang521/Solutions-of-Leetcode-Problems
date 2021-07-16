import java.lang.annotation.Target;
import java.util.HashMap;

/*
 * @lc app=leetcode.cn id=146 lang=java
 *
 * [146] LRU 缓存机制
 */

// @lc code=start
class LRUCache {
    private HashMap<Integer, Node> map = new HashMap<Integer, Node>();
    DoubleList cache = new DoubleList();
    int size;
    public LRUCache(int capacity) {
        this.size = capacity;
    }
    
    public int get(int key) {
        if(!map.containsKey(key)) return -1;
        Node target = map.get(key);
        cache.remove(target);
        cache.addTail(target);
        return target.val;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node target = map.get(key);
            target.val = value;
            map.put(key, target);
            cache.remove(target);
            cache.addTail(target);
        }
        else{
            if(cache.size == this.size){
                Node temp = cache.removeHead();
                map.remove(temp.key);
            }
            Node target = new Node(key, value);
            map.put(key, target);
            cache.addTail(target);
        }
    }
}

class Node{
    public int val, key;
    public Node prev, next;
    public Node(int k, int v){
        this.key = k;
        this.val = v;
    }
}

class DoubleList{
    public Node head, tail;
    public int size;
    public DoubleList(){
        this.head = new Node(0, 0);
        this.tail = new Node(0, 0);
        head.next = tail;
        tail.prev = head;
        this.size = 0;
    }

    public int getSize(){
        return this.size;
    }

    public void addTail(Node target){
        target.prev = this.tail.prev;
        target.next = this.tail;
        this.tail.prev.next = target;
        this.tail.prev = target;
        this.size++;
    }

    public Node removeHead(){
        if(this.head.next == this.tail) return null;
        Node temp = head.next;
        remove(temp);
        return temp;
    }

    public void remove(Node target){
        target.prev.next = target.next;
        target.next.prev = target.prev;
        size--;
    }
}
/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
// @lc code=end

