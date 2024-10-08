package algorithms.two_pointers.opposite_end;

public class FaultyKeyboard2810 {
    public static String finalString(String s) {
        /*
         * Time: O(n)
         * Space: O(n)
         */
        char[] sChar = s.toCharArray();
        StringBuilder result = new StringBuilder();
        int start;

        for(int i = 0; i < sChar.length; i++){
            start = 0;
            if(sChar[i] == 'i'){
                int end = i -1 ;
                while(start < end){
                    char temp = sChar[end];
                    sChar[end] = sChar[start];
                    sChar[start] = temp;
                    start++;
                    end--;
                }
            }
        }

        for(int i = 0; i < sChar.length; i++){
            if(sChar[i] != 'i'){
                result.append(sChar[i]);
            }
        }

        return new String(result);
    }

    public static String finalString2(String s) {
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'i'){
                result = result.reverse();
            } else {
                result.append(s.charAt(i));
            }
        }
        return new String(result);
    }

    public static void main(String[] args) {
        System.out.println(finalString("string"));
        System.out.println(finalString("poiinter"));
        System.out.println(10e4 - Integer.MIN_VALUE);
    }
}
