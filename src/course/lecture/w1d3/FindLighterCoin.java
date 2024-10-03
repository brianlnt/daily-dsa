package course.lecture.w1d3;

import java.util.Arrays;

public class FindLighterCoin {

    static int findLighterCoin(int[] a){
        /*
        Time: O(log(n))
        Space: O(n)
         */
        if(a.length == 1){
            return a[0];
        }

        int groupSize = a.length / 3;

        int[] firstGroup = Arrays.copyOfRange(a, 0, groupSize);
        int[] secondGroup = Arrays.copyOfRange(a, groupSize, groupSize*2);
        int[] thirdGroup = Arrays.copyOfRange(a, groupSize*2, a.length);

        int compareResult = compare(firstGroup, secondGroup);

        if(compareResult == 0){
            return findLighterCoin(thirdGroup);
        } else if(compareResult > 0){
            return findLighterCoin(secondGroup);
        } else {
            return findLighterCoin(firstGroup);
        }
    }

    static int compare(int[] a, int[] b){
        int sum1 = Arrays.stream(a).sum();
        int sum2 = Arrays.stream(b).sum();
        return Integer.compare(sum1, sum2);
    }

    public static void main(String[] args) {
        int[] a = new int[81];
        Arrays.fill(a, 10);
        a[79] = 7;

        System.out.println(findLighterCoin(a));
    }
}
