class Solution {
    public int lengthOfLastWord(String s) {
        String [] str = s.split(" ");
        String lastWord = str[str.length-1];
        return lastWord.length();
    }
}