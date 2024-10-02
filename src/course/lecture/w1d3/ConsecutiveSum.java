package course.lecture.w1d3;

import java.util.Arrays;

public class ConsecutiveSum {
    static int[] consecutiveSum(int[] a, int k){
        int[] result = new int[a.length - k + 1];
        int t = 0;

        for(int i = 0; i < a.length - 1 && t < result.length; i++){
            int sum = 0;
            for(int j = i; j < i+k; j++){
                sum += a[j];
            }
            result[t++] = sum;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(consecutiveSum(new int[]{1,2,3,4,5,6}, 2)));//[3,5,7,9,11]
        System.out.println(Arrays.toString(consecutiveSum(new int[]{1,2,3,4,5,6}, 3)));//[6, 9, 12, 15]

    }
}
