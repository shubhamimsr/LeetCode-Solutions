class Solution {
    public boolean isPalindrome(String s) {
        String r = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        StringBuffer sb = new StringBuffer(r);
        String rev = sb.reverse().toString();
        
        if(r.equals(rev)){
            return true;
        }
        return false;
    }
}