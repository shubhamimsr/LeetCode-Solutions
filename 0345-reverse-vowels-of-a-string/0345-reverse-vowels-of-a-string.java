class Solution {
    public String reverseVowels(String s) {
        Stack<Character> stack = new Stack<>();
        String result = "";
        for(Character ch : s.toCharArray()){
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
               ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ){
                stack.push(ch);
            }
        }
        for(Character ch : s.toCharArray()){
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
               ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                result = result + stack.pop();
            }else{
                result = result + ch;
            }
        }
        
        return result;
    }
}