public class RemovePalindromicSubsequences1332 {
    public static int removePalindromeSub(String s) {
        /*
         * Time: O(n)
         * Space: O(n)
         */
        if (s.isEmpty()) {
            return 0;
        }
        // See below for code that compacts this into one line.
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String reversedString = sb.toString();
        if (reversedString.equals(s)) {
            return 1;
        }
        return 2;
    }

    public static int removePalindromeSub1(String s) {
        /*
         * Time: O(n)
         * Space: O(n)
         */
        
        if(s.isEmpty()) return 0;
        
        if(isPalindrome(s)){
            return 1;
        }
        return 2;
    }

    private static boolean isPalindrome(String s){
        int start = 0;
        int end = s.length() - 1;

        while(start < end){
            if(s.charAt(start) != s.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }
    
    public static void main(String[] args) {
        System.out.println(removePalindromeSub("ababa"));
        System.out.println(removePalindromeSub("abb"));
        System.out.println(removePalindromeSub("baabb"));
    }
}
