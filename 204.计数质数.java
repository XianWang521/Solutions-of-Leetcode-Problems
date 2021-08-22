import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/*
 * @lc app=leetcode.cn id=204 lang=java
 *
 * [204] 计数质数
 */

// @lc code=start
// Sieve Of Euler
class Solution {
    public int countPrimes(int n) {
        int[] isPrime = new int[n];
        Arrays.fill(isPrime, 1);
        List<Integer> primes = new ArrayList<Integer>();
        for(int i = 2; i < n; i++){
            if(isPrime[i] == 1) primes.add(i);
            
            for(int j = 0; j < primes.size() && i * primes.get(j) < n; j++){
                isPrime[i * primes.get(j)] = 0;
                if(i % primes.get(j) == 0) break;
            }
        }
        int res = 0;
        for(int i = 2; i < n; i++)
            if(isPrime[i] == 1) res++;
        return res;
    }
}
/*
// Sieve Of Eratosthenes refer from official solution
class Solution {
    public int countPrimes(int n) {
        int[] isPrime = new int[n];
        Arrays.fill(isPrime, 1);
        for(int i = 2; i * i <= n; i++){
            if(isPrime[i] == 1){
                for(int j = i * i; j < n; j += i)
                    isPrime[j] = 0;
            }
        }
        int res = 0;
        for(int i = 2; i < n; i++)
            if(isPrime[i] == 1) res++;
        return res;
    }
}
*/

/* Time Limit Exceeded
class Solution {
    public int countPrimes(int n) {
        int res = 0;
        for(int i = 2; i < n; i++)
            if(isPrime(i)) res++;
        return res;
    }

    public boolean isPrime(int n){
        if(n < 2) return false;
        else if(n == 2) return true;
        if(n % 2 == 0) return false;

        for(int i = 3; i * i <= n; i += 2)
            if(n % i == 0) return false;
        
        return true;
    }
}
*/
// @lc code=end

