package technique.two_pointers.opposite_end;

public class ReverseStringII541 {
    public static String reverseStr(String s, int k) {
        /* 
        abcdefg -> bacdfeg -> less than 2k but greater than or equal to k
        k = 2

        abcdef gh -> cbadef hg -> fewer than k left -> reverse all
        k = 3
        */
        char[] sChar = s.toCharArray();

        for(int i = 0; i < sChar.length; i += 2*k){
            int first = i, last = Math.min(i + k - 1, sChar.length - 1);
            while(first < last){
                char temp = sChar[first];
                sChar[first] = sChar[last];
                sChar[last] = temp;
                first++;
                last--;
            }
        }
        return new String(sChar);
    }

    public static void main(String[] args) {
        System.out.println(reverseStr("abcdefg", 2));
        System.out.println(reverseStr("abcdefgh", 3));
    }
}
