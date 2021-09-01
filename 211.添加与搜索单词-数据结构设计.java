/*
 * @lc app=leetcode.cn id=211 lang=java
 *
 * [211] 添加与搜索单词 - 数据结构设计
 */

// @lc code=start
class WordDictionary {
    private WordDictionary[] child;
    private boolean end;

    /** Initialize your data structure here. */
    public WordDictionary() {
        child = new WordDictionary[26];
        end = false;
    }
    
    public void addWord(String word) {
        if(word.length() == 0) return;
        WordDictionary node = this;
        char[] letters = word.toCharArray();
        for(char temp : letters){
            if(node.child[temp-'a'] == null) node.child[temp-'a'] = new WordDictionary();
            node = node.child[temp-'a'];
        }
        node.end = true;
    }
    
    public boolean search(String word) {
        return dfs(word, 0, this);
    }
    
    public boolean dfs(String word, int index, WordDictionary node){
        if(index == word.length()) return node.end;
        char cur = word.charAt(index);
        if(cur == '.'){
            for(int i = 0; i < 26; i++)
                if(node.child[i] != null && dfs(word, index+1, node.child[i])) return true;
        }
        else
            if(node.child[cur-'a'] != null) return dfs(word, index+1, node.child[cur-'a']);
        return false;
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */
// @lc code=end

