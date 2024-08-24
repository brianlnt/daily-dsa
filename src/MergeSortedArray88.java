import java.util.Arrays;

public class MergeSortedArray88 {

    
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        /* Brute Force
         * Time: O((m+n)log(m+n))
         * Space: O(n)
         */
        // for (int i = 0; i < n; i++) {
        //     nums1[i + m] = nums2[i];
        // }
        // Arrays.sort(nums1);
        // return nums1;


        /* Three pointers start from beginning 
         * Time: O(m+n)
         * Space: O(m)
        */
        // int[] nums1Copy = new int[m];
        // for(int i = 0; i < nums1Copy.length; i++){
        //     nums1Copy[i] = nums1[i];
        // }

        // int p1 = 0;
        // int p2 = 0;
        // int p = 0;
        // while(p < nums1.length){
        //     if(p2 >= n || (p1 < m && nums1Copy[p1] <= nums2[p2])){
        //         nums1[p] = nums1Copy[p1];
        //         p1++;
        //     }else{
        //         nums1[p] = nums2[p2];
        //         p2++;
        //     }
        //     p++;
        // }
        // return nums1;

        /*
         * Three pointers start from the end
         * Time: O(m+n)
         * Space: O(1)
         */
        int p1 = m-1;
        int p2 = n-1;
        for(int p = m+n-1; p >= 0; p--){
            if(p2 < 0) break;
            if(p1 >= 0 && nums1[p1] > nums2[p2]){
                nums1[p] = nums1[p1--];
            }else{
                nums1[p] = nums2[p2--];
            }
        }
        return nums1;

    }
    public static void main(String[] args){
        System.out.println(Arrays.toString(merge(new int[]{1,2,3,0,0,0}, 3, new int[]{2,5,6}, 3)));
        System.out.println(Arrays.toString(merge(new int[]{1}, 1, new int[]{}, 0)));
        System.out.println(Arrays.toString(merge(new int[]{0}, 0, new int[]{1}, 1)));
    }
}
