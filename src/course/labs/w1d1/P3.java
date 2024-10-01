package course.labs.w1d1;

import java.util.Arrays;

public class P3 {
    /*
    242. Valid Anagram (https://leetcode.com/problems/valid-anagram/description/)
     */
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        char[] charArray1 = s.toCharArray();
        char[] charArray2 = t.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }
}
