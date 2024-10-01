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
            for(int j = i + 1; j < a.length; j++){
                if(a[j] > firstMax) secondMax = a[j];
                for(int k = j + 1; k < a.length; k++){
                    if(a[k] > secondMax) thirdMax = a[k];
                }
            }
        }
        return thirdMax;
    }

    public static void main(String[] args) {
        System.out.println(f1(new int[]{7, 20, 18, 4, 20, 19, 20, 3}));
    }}
