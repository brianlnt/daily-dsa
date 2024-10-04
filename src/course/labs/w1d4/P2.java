package course.labs.w1d4;

import java.util.ArrayList;
import java.util.List;

public class P2 {
    /*
    Write a Java program to solve the subset problem.
        (a) T or F.
        (b) One solution.
        (c) All solutions.
     */

    static boolean subsetSumA(int[] a, int k){
        int n = a.length;
        boolean[][] table = new boolean[n+1][k+1];

        for(int i = 0; i <= n; i++){
            table[i][0] = true;
        }

        for(int i = 1; i <= n; i++){
            for(int sum = 1; sum <= k; sum++){
                if(a[i-1] > sum){
                    table[i][sum] = table[i-1][sum];
                } else {
                    table[i][sum] = table[i-1][sum] || table[i-1][sum - a[i-1]];
                }
            }
        }

        return table[n][k];
    }

    public static void main(String[] args) {
        System.out.println(subsetSumA(new int[]{3, 4, 7, 8}, 15));
    }
}
