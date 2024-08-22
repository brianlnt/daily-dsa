public class MergeStringsAlternately1768 {

    /*
     * Given: Two string word1, word2
     * 
     * Goal: Merge two string into one, by alternately (luan phien) adding characters 
     * starting from word1. If one string is longer, append addictional characters too
     * 
     * Time Complexity: O(m+n) m is length of word1, n is length of word2
     * Space Complexity: O(m+n) 
     */

    public static String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        while(i < word1.length() || i < word2.length()){
            if(i < word1.length()){
                result.append(word1.charAt(i));
            }
            if(i < word2.length()){
                result.append(word2.charAt(i));
            }
            i++;
        }
        return result.toString();
    }

    public static void main(String[] args) throws Exception {
        System.out.println(mergeAlternately("abc", "pqr"));
        System.out.println(mergeAlternately("ab", "pqrs"));
        System.out.println(mergeAlternately("abcd", "pq"));
    }
}