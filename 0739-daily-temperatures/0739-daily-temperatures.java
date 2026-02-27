class Solution {
    public int[] dailyTemperatures(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();
        int n = nums.length;
        int[] result = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            if (stack.isEmpty()) {
                list.add(i);
            } else if (!stack.isEmpty() && nums[stack.peek()] > nums[i]) {
                list.add(stack.peek());
            } else if (!stack.isEmpty() && nums[stack.peek()] <= nums[i]) {
                while (!stack.isEmpty() && nums[stack.peek()] <= nums[i]) {
                    stack.pop();
                }
                if (stack.isEmpty()) {
                    list.add(i);
                } else if (!stack.isEmpty() && nums[stack.peek()] > nums[i]) {
                    list.add(stack.peek());
                }
            }
            stack.push(i);
        }
        Collections.reverse(list);

        System.out.println(list);
        for (int i = 0; i < n; i++) {
            result[i] = list.get(i) - i;
        }
        return result;
    }
}