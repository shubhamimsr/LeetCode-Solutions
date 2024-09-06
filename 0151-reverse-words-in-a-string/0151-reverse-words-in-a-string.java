class Solution {
    public String reverseWords(String s) {
     String [] strArray = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(int i=strArray.length-1; i>=0; i--){
            sb.append(strArray[i]).append(" ");
        }
        return sb.toString().trim();
    }
}