package technique.dynamic_programming;

import java.util.HashMap;

public class ClimbStairs70 {
    /*
    70. Climb Stairs (https://leetcode.com/problems/climbing-stairs/description/)
     */

    private static HashMap<Integer, Integer> memo = new HashMap<>();

    public static int climbStart1(int n){
        /*
        Approach: Dynamic programming (bottom-up)
         */
        if(n <= 2) return n;

        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;

        for(int i = 3; i< dp.length; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];

        /*
        Time: O(n)
        Space: O(n)
         */
    }

    public static int climbStart2(int n){
        /*
        Approach: Dynamic programming (top-down-without-memoization)
         */
        if(n <= 2) return n;

        return climbStart2(n-1) + climbStart2(n-2);

        /*
        Time: O(2^n)
        Space: O(n)
         */
    }

    public static int climbStart3(int n){
        /*
        Approach: Dynamic programming (top-down-with-memoization)
         */
        if(n <= 2) return n;

        if(!memo.containsKey(n)){
            memo.put(n, climbStart3(n-1) + climbStart3(n-2));
        }

        return memo.get(n);

        /*
        Time: O(n)
        Space: O(n)
         */
    }

    public static void main(String[] args) {
        System.out.println(climbStart1(44));
        System.out.println(climbStart2(44));
        System.out.println(climbStart3(44));
    }
}
