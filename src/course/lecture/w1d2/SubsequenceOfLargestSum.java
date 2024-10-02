package course.lecture.w1d2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsequenceOfLargestSum {
    public static int[] maxSubsequence(int[] nums, int k) {
        int max = 0, maxIndex1 = 0, maxIndex2 = 0;
        List list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[j] + nums[j-1] > max){
                    max = nums[j] + nums[j-1];
                    maxIndex1 = j;
                }
            }
            list.add(nums[maxIndex1]);
        }

        return new int[]{};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(maxSubsequence(new int[]{2, 1, 3, 3}, 2)));
        System.out.println(Arrays.toString(maxSubsequence(new int[]{-1,-2,3,4}, 3)));
    }
}
