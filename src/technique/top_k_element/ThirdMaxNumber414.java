package technique.top_k_element;

import java.util.Arrays;

public class ThirdMaxNumber414 {
    /*
    414. Third Maximum Number (https://leetcode.com/problems/third-maximum-number/description/)
     */

    public static int thirdMax1(int[] nums) {
        /*
        Approach 1: Sorting
         */

        Arrays.sort(nums); //[1,2,3,4,4,5] //[1,2,2,3]
        int thirdMax = nums[nums.length-1]; //5
        int count = 1;
        for(int i = nums.length - 2; i >= 0; i--){
            if(nums[i] != thirdMax){
                thirdMax = nums[i];
                count++;
            }
            if(count == 3) return thirdMax;
        }

        return thirdMax;

        /*
        Time: O(nlogn + n) = O(nlogn)
        Space: O(n)
         */
    }

    public static int thirdMax2(int[] nums){

        /*
        Approach 2: Min-heap to find kth largest element
         */



        return 1;
    }

    public static void main(String[] args) {
        System.out.println(thirdMax1(new int[]{4,4,2,5,3,1}));
        System.out.println(thirdMax1(new int[]{2,2,3,1}));
    }

}
