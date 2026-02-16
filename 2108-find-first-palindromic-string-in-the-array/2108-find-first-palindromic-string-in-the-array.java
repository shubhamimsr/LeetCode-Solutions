class Solution {
    public String firstPalindrome(String[] words) {

        for (String word : words) {
            if (checkPalindromeWord(word)) {
                return word;
            }
        }
        return "";
    }
private boolean checkPalindromeWord(String word) {
String reverse = new StringBuffer(word).reverse().toString();
return word.equals(reverse);
}

//TO CHECK PALINDROM WE USE THE BELOW LOGIC TOO..

    // private boolean checkPalindromeWord(String word) {
    //     char[] ch = word.toCharArray();
    //     int l = 0, 
    //     r = ch.length-1;

    //     while (l < r) {
    //         if (ch[l] != ch[r]) {
    //             return false;
    //         }
    //         l++;
    //         r--;
    //     }
    //     return true;
    // }
}