class Solution {
    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        String []strArray = s.split(" ");
        for(String str:strArray){
            String word = invertWord(str);
            result.append(word).append(" ");
        }
        return result.toString().trim();
    }
    
    static String invertWord(String s){
        StringBuilder sb = new StringBuilder(s);
        String rev = sb.reverse().toString();
        return rev;
    }
}