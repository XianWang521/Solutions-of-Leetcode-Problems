import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=229 lang=java
 *
 * [229] 求众数 II
 */

// @lc code=start
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> res = new ArrayList<>();
        if(nums.length == 0) return res;

        int a = nums[0], b = nums[0], acount = 0, bcount = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == a) acount++;
            else if(nums[i] == b) bcount++;
            if(nums[i] != a && nums[i] != b){  
                if(acount == 0){
                    a = nums[i];
                    acount = 1;
                    continue;
                }
                else if(bcount == 0){
                    b = nums[i];
                    bcount = 1;
                    continue;
                }
                acount--;
                bcount--;
            }
        }

        acount = bcount = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == a) acount++;
            else if(nums[i] == b) bcount++;
        }
        if(acount > nums.length / 3) res.add(a);
        if(bcount > nums.length / 3) res.add(b);
        return res;
    }
}
/*
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++)
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        List<Integer> res = new ArrayList<Integer>();
        for(int i: map.keySet())
            if(map.get(i) > nums.length/3) res.add(i);
        return res;
    }
}
*/
// @lc code=end

