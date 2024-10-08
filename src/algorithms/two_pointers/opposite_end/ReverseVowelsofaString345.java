package algorithms.two_pointers.opposite_end;

class ReverseVowelsofaString345{
    public static boolean isVowel(char c){
        return c == 'u' || c == 'e' || c == 'o' || c == 'a' || c == 'i'
            || c == 'U' || c == 'E' || c == 'O' || c == 'A' || c == 'I';
    }

    /*
     * Time: O(n)
     * Space: O(n)
     */

    public static String reverseVowels(String s) {
        int start = 0, end = s.length() - 1;
        char[] sChar = s.toCharArray();

        while ( start < end ){
            while(start < s.length() && !isVowel(sChar[start])){
                start++;
            }
            while(end >= 0 && !isVowel(sChar[end])){
                end--;
            }
            if(start < end){
                char temp = sChar[start];
                sChar[start] = sChar[end];
                sChar[end] = temp;
                start++; 
                end--;
            }
            
        }
        return new String(sChar);
    }

    public static void main(String[] args) {
        System.out.println(reverseVowels("hello"));
    }
}