class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder sb = new StringBuilder();
        // String temp = "";
        while(s.length() >= 2*k){
            String temp = s.substring(0,k);
            sb.append(new StringBuilder(temp).reverse());
            sb.append(s.substring(k,2*k));
            s = s.substring(2*k);
        }
        if(s.length()<=k){
            sb.append(new StringBuilder(s).reverse());
        }else{
            sb.append(new StringBuilder(s.substring(0,k)).reverse());
            sb.append(s.substring(k));
        }
        return sb.toString();
    }
}