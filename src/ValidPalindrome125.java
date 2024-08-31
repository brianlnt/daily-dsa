public class ValidPalindrome125 {
    public static boolean isPalindrome(String s){
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
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("race a car"));
    }
}
