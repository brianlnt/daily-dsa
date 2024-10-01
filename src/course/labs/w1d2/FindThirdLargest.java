package course.labs.w1d2;

public class FindThirdLargest {

    public static int f1(int[] a){
        /*
        Time: 0(n^3)
        Space: O(1)
         */
        int firstMax = a[0];
        int secondMax = a[0];
        int thirdMax = a[0];

        for(int i = 0; i < a.length; i++){
            if(a[i] > firstMax) firstMax = a[i];
        }
        for(int i = 0; i < a.length; i++){
            if(a[i] > secondMax && a[i] != firstMax) secondMax = a[i];
        }
        for(int i = 0; i < a.length; i++){
            if(a[i] > thirdMax && a[i] != firstMax && a[i] != secondMax) thirdMax = a[i];
        }
        return thirdMax;
    }

    public static int f2(int[] a){
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(f1(new int[]{1,2,3,4,5,6}));
    }}

