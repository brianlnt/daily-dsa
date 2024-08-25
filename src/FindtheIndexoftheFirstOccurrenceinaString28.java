public class FindtheIndexoftheFirstOccurrenceinaString28 {
    /* 
     * Approach: Sliding Window
     * Time: O((m-n+1)*n)
     * Space: O(1)
     */
    public static int strStr(String haystack, String needle) {
        int m = haystack.length();
        int n = needle.length();
        int check = 0;
        if(m < n) return -1;
        for(int i = 0; i < (m - n) + 1; i++){
            for(int j = 0; j < n; j++){
                if((haystack.charAt(j+i) != needle.charAt(j))){
                    check = 0;
                    break;
                }
                check = 1;
            }
            if(check == 1) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(strStr("sadbutsad", "sad"));
        System.out.println(strStr("leetcode", "leeto"));
        System.out.println(strStr("butsad", "sad"));
        System.out.println(strStr("mississippi", "issipp"));
        System.out.println(strStr("mississippi", "issipi"));
        System.out.println(strStr("aaa", "aaaa"));
    }
}
