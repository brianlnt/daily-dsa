class IsSubsequence392 {
    public static boolean isSubsequence(String s, String t) {
        /*
         * Time: O(m+n)
         * Space: O(1)
         */
        int check = 0;
        for(int i = 0; i < s.length(); i++){
            for(int j = 0; j < t.length(); j++){
                if(s.charAt(i) == t.charAt(j)) check += 1;
            }
        }
        return check == s.length() ? true:false;
    }

    public static void main(String[] args) {
        System.out.println(isSubsequence("abc", "ahbgdc"));
        System.out.println(isSubsequence("axc", "ahbgdc"));
    }
}