import java.util.Arrays;

class MoveZeros283{
    public static int[] moveZeroes(int[] nums) {
    
        int n = nums.length;
        int j = -1;
        int i = 0; 
       
        while(i < n ){
            
            //first occurence of 0
            if(nums[i] == 0 && j == -1) j = i;
            //has zero in the array before a valid digit, hence swap 
            else if(nums[i] != 0 && j != -1 ){
                nums[j] = nums[i];
                nums[i] = 0; 
                j++ ;  
             }
            i++;
        }

        return nums;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(moveZeroes(new int[]{0,1,0,3,12})));
    }
}
