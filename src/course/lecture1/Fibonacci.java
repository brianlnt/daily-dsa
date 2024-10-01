package course.lecture1;

public class Fibonacci {
    public static int fibonacci(int n) {
        /*
        F = 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144
        Fn = Fn-1 + Fn-2
        Time: O(n)
         */
        int f1 = 1;
        int f2 = 1;
        int f = 0;

        if(n == 0) return n;
        if(n < 3) return 1;
        while(n != 1){
            f = f1 + f2;
            f1 = f2;
            f2 = f;
            n--;
        }
        return f1;
    }

    public static int fibonacci1(int n){

        return 0;
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(10));
        System.out.println(fibonacci(10));
    }
}
