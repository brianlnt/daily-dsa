class LongPressedName925{
    public boolean isLongPressedName(String name, String typed) {
        int i = 0;
        int j = 0;

        while(i< name.length() && j < typed.length()){
            if(name.charAt(i) == typed.charAt(j)) {
                j++;
            } else {
                i++;
                if(name.charAt(i) == typed.charAt(j-1)) return false;
            }
        }
        return true;
    }
}