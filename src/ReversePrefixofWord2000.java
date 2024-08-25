public class ReversePrefixofWord2000 {

    /*
     * Time: O(n)
     * Space: O(n)
     */
    public static String reversePrefix(String word, char ch) {
        char[] result = word.toCharArray();
        for(int i = 0; i < word.length(); i++){
            if(result[i] == ch){
                for(int j = i; j >= 0; j--){
                    result[i-j] = word.charAt(j);
                }
                return new String(result);
            }
        }
        return word;
    }

    public static void main(String[] args) {
        System.out.println(reversePrefix("abcdefh", 'd'));
    }
    
}
