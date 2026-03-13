class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        List<Integer> vector = new ArrayList<>();
        int n = nums.length;

        for (int i = 2 * n - 1; i >= 0; i--) {

            while (!stack.isEmpty() && stack.peek() <= nums[i % n]) {
                stack.pop();
            }

            if (i < n) {
                if (stack.isEmpty()) {
                    vector.add(-1);
                } else {
                    vector.add(stack.peek());
                }
            }

            stack.push(nums[i % n]);
        }

        Collections.reverse(vector);

        return vector.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}

// class Solution {
//     public int[] nextGreaterElements(int[] nums) {
//         Stack<Integer> stack = new Stack<>();
//         List<Integer> vector = new ArrayList<>();
//         int n = nums.length;
//         int maxNum = 0;
//         for (int n1 : nums) {
//             maxNum = Math.max(maxNum, n1);
//         }
//         vector.add(maxNum);
//         for (int i = n - 2; i >= 0; i--) {
//             if (stack.isEmpty()) {
//                 vector.add(-1);
//             } else if (!stack.isEmpty() && stack.peek() > nums[i]) {
//                 vector.add(stack.peek());
//             } else if (!stack.isEmpty() && stack.peek() <= nums[i]) {
//                 while (!stack.isEmpty() && stack.peek() <= nums[i]) {
//                     stack.pop();
//                 }

//                 if (stack.isEmpty()) {
//                     vector.add(-1);
//                 } else if (!stack.isEmpty() && stack.peek() > nums[i]) {
//                     vector.add(stack.peek());
//                 }
//             }
//             // else if()
//             stack.push(nums[i]);
//         }
//         Collections.reverse(vector);
//         return vector.stream()
//                 .mapToInt(Integer::intValue)
//                 .toArray();
//     }
// }