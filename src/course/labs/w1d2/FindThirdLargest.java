package course.labs.w1d2;

import java.util.Arrays;

public class FindThirdLargest {

    public static int f1(int[] a){
        /*
        Time: 0(n)
        Space: O(1)
         */
        int firstMax = a[0], firstIndex = 0;
        int secondMax = a[0], secondIndex = 0;
        int thirdMax = a[0];

        for(int i = 0; i < a.length; i++){
            if(a[i] > firstMax) {
                firstMax = a[i];
                firstIndex = i;
            }
        }
        for(int i = 0; i < a.length; i++){
            if(a[i] > secondMax && i != firstIndex) {
                secondMax = a[i];
                secondIndex = i;
            }
        }
        for(int i = 0; i < a.length; i++){
            if(a[i] > thirdMax && i != secondIndex && i != firstIndex) thirdMax = a[i];
        }

        return thirdMax;
    }

    public static int f2(int[] a){
         /*
        Time: 0(n)
        Space: O(1)
         */
        int max = a[0];
        int preMax = a[0];
        int prePreMax = a[0];

        for(int i = 0; i < a.length; i++){
            if(a[i] > max){
                prePreMax = preMax;
                preMax = max;
                max = a[i];
            } else if(a[i] > preMax){
                prePreMax = preMax;
                preMax = a[i];
            } else if(a[i] > prePreMax){
                prePreMax = a[i];
            }
        }
        return prePreMax;
    }

    public static int f3(int[] a){
         /*
        Time: 0(nlogn)
        Space: O(1)
         */
        Arrays.sort(a);
        return a[a.length - 3];
    }

    public static void main(String[] args) {
        int[] array = {7, 20, 18, 4, 20, 19, 20, 3};
//        int[] array = {1,5,4,7,3,9,2};

        long startTime1 = System.nanoTime();
        int thirdLargest1 = FindThirdLargest.f1(array);
        long endTime1 = System.nanoTime();
        long duration1 = endTime1 - startTime1;
        System.out.println("Algorithm 1 (Three Loops) - Third Largest: " + thirdLargest1 + ", Time: " + duration1 + " ns");

        // Measure time for Algorithm 2
        long startTime2 = System.nanoTime();
        int thirdLargest2 = FindThirdLargest.f2(array);
        long endTime2 = System.nanoTime();
        long duration2 = endTime2 - startTime2;
        System.out.println("Algorithm 2 (Single Loop) - Third Largest: " + thirdLargest2 + ", Time: " + duration2 + " ns");

        // Measure time for Algorithm 3
        long startTime3 = System.nanoTime();
        int thirdLargest3 = FindThirdLargest.f3(array);
        long endTime3 = System.nanoTime();
        long duration3 = endTime3 - startTime3;
        System.out.println("Algorithm 3 (Ordered Set) - Third Largest: " + thirdLargest3 + ", Time: " + duration3 + " ns");
    }
}

