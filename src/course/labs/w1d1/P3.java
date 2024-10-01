package course.labs.w1d1;

import java.util.Arrays;

public class P3 {
    /*
    242. Valid Anagram (https://leetcode.com/problems/valid-anagram/description/)
     */

    /*
    Time: O(nlogn)
    Space: O(n)
     */
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        char[] charArray1 = s.toCharArray();
        char[] charArray2 = t.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }

    /*
    Time: O(n)
    Space: O(n)
     */
    public boolean isAnagram2(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] counter = new int[26];
        for (int i = 0; i < s.length(); i++) {
            counter[s.charAt(i) - 'a']++;
            counter[t.charAt(i) - 'a']--;
        }
        for (int count : counter) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
}
