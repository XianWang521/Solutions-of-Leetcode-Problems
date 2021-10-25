/*
 * @lc app=leetcode.cn id=313 lang=java
 *
 * [313] 超级丑数
 */

// @lc code=start
// DP refer from other's solution
class Solution {
    public int nthSuperUglyNumber(int n, int[] primes){
        int len = primes.length;
        int[] index = new int[len];
        int[] dp = new int[n];
        dp[0] = 1;

        for(int i = 1; i < n; i++){
            dp[i] = Integer.MAX_VALUE;
            for(int j = 0; j < len; j++)
                dp[i] = Math.min(dp[i], dp[index[j]] * primes[j]);
            for(int j = 0; j < len; j++){
                if(dp[i] == dp[index[j]] * primes[j]) index[j]++;
            }
        }
        return dp[n-1];
    }
}
// Time limit exceeded
/*
class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
        Set<Long> set = new HashSet<>();
        Queue<Long> p = new PriorityQueue<>();
        set.add((long)1);
        p.add((long)1);
        long temp = (long)1;
        
        while(n-- > 0){
            temp = p.poll();
            for(int j : primes){
                long s = j * temp;
                if(!set.contains(s)){
                    set.add(s);
                    p.add(s);
                }
            }
        }
        return (int)temp;
    }
}
*/
// @lc code=end

