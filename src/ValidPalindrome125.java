public class ValidPalindrome125 {
    public static boolean isPalindrome(String s) {
        StringBuilder builder = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                builder.append(Character.toLowerCase(ch));
            }
        }

        String filteredString = builder.toString();
        String reversedString = builder.reverse().toString();

        return filteredString.equals(reversedString);
    }

    /** An alternate solution using Java 8 Streams */
    public static boolean isPalindromeUsingStreams(String s) {
        StringBuilder builder = new StringBuilder();

        s
            .chars()
            .filter(c -> Character.isLetterOrDigit(c))
            .mapToObj(c -> Character.toLowerCase((char) c))
            .forEach(builder::append);

        return builder.toString().equals(builder.reverse().toString());
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("race a car"));
    }
}
