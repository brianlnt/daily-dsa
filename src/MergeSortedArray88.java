import java.util.Arrays;

public class MergeSortedArray88 {

    /*
     * Time: O((m+n)log(m+n))
     * Space: O(n)
     */
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i++) {
            nums1[i + m] = nums2[i];
        }
        Arrays.sort(nums1);
        return nums1;
    }
    public static void main(String[] args){
        System.out.println(Arrays.toString(merge(new int[]{1,2,3,0,0,0}, 3, new int[]{2,5,6}, 3)));
        System.out.println(Arrays.toString(merge(new int[]{1}, 1, new int[]{}, 0)));
        System.out.println(Arrays.toString(merge(new int[]{0}, 0, new int[]{1}, 1)));
    }
}
