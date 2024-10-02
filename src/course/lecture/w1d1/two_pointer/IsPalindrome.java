package course.lecture.w1d1.two_pointer;

public class IsPalindrome {
    static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while(left < right){
            if(s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }

    static boolean isPalindromeForInteger(int[] a) {
        int left = 0;
        int right = a.length - 1;

        while(left < right){
            if(a[left] != a[right]) return false;
            left++;
            right--;
        }
        return true;
    }

    static boolean checkParity(int[] a){
        int left = 0;
        int right = a.length - 1;

        while(left < right){
            if(a[left] % 2 != a[right] % 2) return false;
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("abbaa"));
        System.out.println(isPalindrome("abba"));
        System.out.println(isPalindromeForInteger(new int[]{1,2,2,1}));
        System.out.println(isPalindromeForInteger(new int[]{1,2,2,1,3}));
        System.out.println(checkParity(new int[]{2,4,5,6,8}));
        System.out.println(checkParity(new int[]{2,4,5,6,9}));
    }
}
