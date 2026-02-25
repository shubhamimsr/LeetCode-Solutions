class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();
        int n = temperatures.length;
        int[] result = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            if (stack.isEmpty()) {
                list.add(i);
            } else if (!stack.isEmpty() && temperatures[stack.peek()] > temperatures[i]) {
                list.add(stack.peek());
            } else if (!stack.isEmpty() && temperatures[stack.peek()] <= temperatures[i]) {
                while (!stack.isEmpty() && temperatures[stack.peek()] <= temperatures[i]) {
                    stack.pop();
                }

                if (stack.isEmpty()) {
                    list.add(i);
                } else if (!stack.isEmpty() && temperatures[stack.peek()] > temperatures[i]) {
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