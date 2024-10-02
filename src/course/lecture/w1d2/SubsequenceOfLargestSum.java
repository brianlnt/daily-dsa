package course.lecture.w1d2;

import java.util.Arrays;
import java.util.Comparator;

public class SubsequenceOfLargestSum {
    public static int[] maxSubsequence1(int[] nums, int k) {
        int max = 0, maxIndex = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] + nums[i-1] > max){
                max = nums[i] + nums[i-1];
                maxIndex = i;
            }
        }

        return new int[]{nums[maxIndex], nums[maxIndex-1]};
    }

    public static int[] maxSubsequence2(int[] nums, int k){
        /*
        Time: O(n * logn)
        Space: O(n)
         */
        int n = nums.length;
        int[][] indexAndVal = new int[n][2];
        for (int i = 0; i < n; ++i) {
            indexAndVal[i] = new int[]{i, nums[i]};
        }
        // Reversely sort by value.
        Arrays.sort(indexAndVal, Comparator.comparingInt(a -> -a[1]));
        int[][] maxK = Arrays.copyOf(indexAndVal, k);
        // Sort by index.
        Arrays.sort(maxK, Comparator.comparingInt(a -> a[0]));
        int[] seq = new int[k];
        for (int i = 0; i < k; ++i) {
            seq[i] = maxK[i][1];
        }
        return seq;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(maxSubsequence2(new int[]{2, 1, 3, 3}, 2)));
        System.out.println(Arrays.toString(maxSubsequence2(new int[]{-1,-2,3,4}, 3)));
    }
}
