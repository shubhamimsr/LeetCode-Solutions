class Solution {
    public String reverseParentheses(String s) {
        Stack<StringBuilder> stack = new Stack<>();
        StringBuilder result = new StringBuilder();

        for(char c:s.toCharArray()){
            if(c == '('){
                stack.push(result);
                result = new StringBuilder();
            }else if(c==')'){
                result.reverse();
                result = stack.pop().append(result);
            }else{
                result.append(c);
            }
        }
        return result.toString();
    }
}

// class Solution {
//     public String reverseParentheses(String s) {
//         int n = s.length();
//         Stack<Integer> stack = new Stack<>();
//         char[] arr = s.toCharArray();

//         for (int i = 0; i < n; i++) {
//             char c = arr[i];
//             if (c == '(') {
//                 stack.push(i);
//             } else if (c == ')') {
//                 int left = stack.pop() + 1;
//                 int right = i - 1;

//                 while (left < right) {
//                     char temp = arr[left];
//                     arr[left] = arr[right];
//                     arr[right] = temp;

//                     left++;
//                     right--;
//                 }

//             }
//         }

//         StringBuilder result = new StringBuilder();
//         for (char c : arr) {
//             if (c != '(' && c != ')') {
//                 result.append(c);
//             }
//         }
//         return result.toString();
//     }
// }