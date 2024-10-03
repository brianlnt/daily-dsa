package technique.two_pointers.opposite_end;

public class ValidPalindrome125 {
    public static boolean isPalindrome(String s){
        /*
         * Time: O(n)
         * Space: O(n)
         */
        StringBuilder builder = new StringBuilder();

        for( char ch : s.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                builder.append(Character.toLowerCase(ch));
            }
        }

        String filteString = builder.toString();
        String reverseString = builder.reverse().toString();
        
        return filteString.equals(reverseString);
    }

    public static boolean isPalindrome2(String s){
        /*
         * Time: O(n)
         * Space: O(1)
         */
        for(int i = 0, j = s.length() - 1; i < j; i++, j--){
            while(i < j && !Character.isLetterOrDigit(s.charAt(i))){
                i++;
            }

            while(i < j && !Character.isLetterOrDigit(s.charAt(j))){
                j--;
            }

            if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))){
                return false;
            }
        }

        return true;
    }


    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("race a car"));

        System.out.println(isPalindrome2("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome2("race a car"));
    }
}
