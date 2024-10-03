package technique.two_pointers.same_end;

public class ReversePrefixofWord2000 {

    /*
     * Time: O(n)
     * Space: O(n)
     */
    public static String reversePrefix(String word, char ch) {
        // char[] result = word.toCharArray();
        // for(int i = 0; i < word.length(); i++){
        //     if(result[i] == ch){
        //         for(int j = i; j >= 0; j--){
        //             result[i-j] = word.charAt(j);
        //         }
        //         return new String(result);
        //     }
        // }
        // return word;
        int chIndex = word.indexOf(ch);
        if(chIndex == -1) return word;

        StringBuilder result = new StringBuilder();

        for(int i = 0; i < word.length(); i++){
            if(i <= chIndex){
                result.append(word.charAt(chIndex - i));
            } else {
                result.append(word.charAt(i));
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(reversePrefix("abcdefh", 'd'));
    }
    
}
