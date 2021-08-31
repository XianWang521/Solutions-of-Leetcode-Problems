/*
 * @lc app=leetcode.cn id=208 lang=java
 *
 * [208] 实现 Trie (前缀树)
 */

// @lc code=start
class Trie {
    private Trie[] child;
    private boolean end;

    /** Initialize your data structure here. */
    public Trie() {
        child = new Trie[26];
        end = false;
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        if(word.length() == 0) return;
        Trie node = this;
        char[] letters = word.toCharArray();
        for(char temp : letters){
            if(node.child[temp-'a'] == null) node.child[temp-'a'] = new Trie();
            node = node.child[temp-'a'];
        }
        node.end = true;
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        Trie node = checkprefix(word, this);
        return node != null && node.end;
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        Trie node = checkprefix(prefix, this);
        return node != null;
    }

    public Trie checkprefix(String prefix, Trie node){
        if(prefix.length() == 0) return null;
        char[] letters = prefix.toCharArray();
        for(char temp : letters){
            if(node.child[temp-'a'] == null) return null;
            node = node.child[temp-'a'];
        }
        return node;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
// @lc code=end

