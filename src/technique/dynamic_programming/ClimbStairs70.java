package technique.dynamic_programming;

public class ClimbStairs70 {
    /*
    70. Climb Stairs (https://leetcode.com/problems/climbing-stairs/description/)
     */
    public static int climbStart(int n){
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

    public static void main(String[] args) {
        System.out.println(climbStart(5));
    }
}
