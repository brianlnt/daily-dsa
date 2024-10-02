package course.lecture.w1d2;

import java.util.PriorityQueue;

public class KthLargestElementInAnArray215 {
    /*
    215. Kth Largest Element in an Array (https://leetcode.com/problems/kth-largest-element-in-an-array/description/)
     */

    public static int findKthLargest(int[] nums, int k) {
        /* Using sorting
        Time: O(nlog(n))
        Space: O(log(n)
        */
        // Arrays.sort(nums);
        // return nums[nums.length - k];

        /* Using min heap
        Time: O(nlog(k))
        Space: O(k)
        */

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(int num: nums){
            minHeap.add(num);
            if(minHeap.size() > k){
                minHeap.remove();
            }
        }
        return minHeap.peek();
    }

    public static void main(String[] args) {
        System.out.println(findKthLargest(new int[]{3,2,3,1,2,4,5,5,6}, 4));
    }
}
