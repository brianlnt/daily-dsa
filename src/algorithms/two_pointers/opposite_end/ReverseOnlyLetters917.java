package algorithms.two_pointers.opposite_end;

public class ReverseOnlyLetters917 {
    public static String reverseOnlyLetters(String s) {
        /*
         * Time: O(n)
         * Space: O(n);
         */
        int start = 0; 
        int end = s.length() - 1;
        char[] sChar = s.toCharArray();

        while(start < end){
            if(Character.isLetter(sChar[start]) && Character.isLetter(sChar[end])){
                char temp = sChar[end];
                sChar[end] = sChar[start];
                sChar[start] = temp;
                start++;
                end--;
            }
            if(!Character.isLetter(sChar[start])) start++;
            if(!Character.isLetter(sChar[end])) end--;
        }
        return new String(sChar);
    }

    public static void main(String[] args) {
        System.out.println(reverseOnlyLetters("a-bC-dEf-ghIj"));
        System.out.println(reverseOnlyLetters("Test1ng-Leet=code-Q!"));
    }
}
