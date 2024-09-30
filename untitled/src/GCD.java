public class GCD {
    public static int gcd(int a, int b) {
        /*
        P problem
        Time: O(log(n)) ~ O(n)
         */
        if(b == 0) return a;
        return gcd(b, a % b);
    }

    public static int gcd1(int a, int b) {
        /*
        Iterative solution
        Time: O(n)
         */
        while(b != 0){
            int temp = b;
            b = a % temp;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(gcd(36, 16));
        System.out.println(gcd1(36, 16));
    }
}
