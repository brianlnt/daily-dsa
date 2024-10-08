package algorithms.two_pointers.opposite_end;

public class ReversWordInaStringIII557 {
    public static String reverseWords(String s) {
        char[] sChar = s.toCharArray();
        int lastSpaceIndex = -1;

        for(int i = 0 ; i <= sChar.length; i++){
            if(i == sChar.length || sChar[i] == ' '){
                int start = lastSpaceIndex + 1;
                int end = i - 1;
            
                while(start < end){
                    char temp = sChar[start];
                    sChar[start] = sChar[end];
                    sChar[end] = temp;
                    start++;
                    end--;
                }
                lastSpaceIndex = i;
            }
        }
        return new String(sChar);
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));
        System.out.println(reverseWords("Mr Ding"));
    }
}
