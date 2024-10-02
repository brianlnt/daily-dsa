package course.lecture.w1d2;

import java.util.Arrays;

public class SubsequenceOfLargestSum {
    public static int[] maxSubsequence(int[] nums, int k) {
        int max = 0, maxIndex = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] + nums[i-1] > max){
                max = nums[i] + nums[i-1];
                maxIndex = i;
            }
        }

        return new int[]{nums[maxIndex], nums[maxIndex-1]};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(maxSubsequence(new int[]{2, 1, 3, 3}, 2)));
        System.out.println(Arrays.toString(maxSubsequence(new int[]{-1,-2,3,4}, 2)));
    }
}
