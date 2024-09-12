class Solution {
    public String reverseOnlyLetters(String s) {
        Stack<Character> stack = new Stack<>();
        for(char ch: s.toCharArray()){
            if(Character.isAlphabetic(ch)){
                stack.push(ch);
            }
        }
        
        String result="";
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isAlphabetic(ch)){
                result = result + stack.pop();
            }else{
                result = result + ch;
            }
        }
        return result;
    }
}