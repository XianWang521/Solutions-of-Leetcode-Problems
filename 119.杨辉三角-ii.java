/*
 * @lc app=leetcode.cn id=119 lang=java
 *
 * [119] 杨辉三角 II
 */

// @lc code=start
class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<Integer>();
        for(int i = 0; i <= rowIndex; i++){
            List<Integer> temp = new ArrayList<Integer>();
            for(int j = 0; j <= i; j++){
                if(j == 0 || j == i) temp.add(1);
                else temp.add(res.get(j-1) + res.get(j));
            }
            res = temp;
        }
        return res;
    }
}
// @lc code=end

