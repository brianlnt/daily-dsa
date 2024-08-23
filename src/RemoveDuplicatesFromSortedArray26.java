public class RemoveDuplicatesFromSortedArray26{
    /*
     * Time: O(n)
     * Space: O(1)
     */
    public static int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;
        int insertIndex = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] != nums[i]) {
                nums[insertIndex] = nums[i];
                insertIndex++;
            }
        }
        return insertIndex;
    }

    public static void main (String[] args){
        System.out.println(removeDuplicates(new int[]{1,1,2}));
        System.out.println(removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
    }
}