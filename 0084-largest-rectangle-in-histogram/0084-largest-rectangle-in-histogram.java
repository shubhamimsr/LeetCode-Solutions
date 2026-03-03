class Solution {
    public int largestRectangleArea(int[] heights) {
        int[] left = getNSL(heights);
        int[] right = getNSR(heights);
        int n = heights.length;
        // for(int n:left){
        //     System.out.print(n+" ");
        // }
        // for(int n:right){
        //     System.out.print(n+" ");
        // }
        int[] height = new int[n];
        int maxResult = 0;
        for (int i = 0; i < n; i++) {
            height[i] = right[i] - left[i] - 1;
            int num = heights[i] * height[i];
            maxResult = Math.max(maxResult, num);
        }

        return maxResult;
    }

    private int[] getNSL(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (stack.isEmpty()) {
                list.add(-1);
            } else if (!stack.isEmpty() && nums[stack.peek()] < nums[i]) {
                list.add(stack.peek());
            } else if (!stack.isEmpty() && nums[stack.peek()] >= nums[i]) {
                while (!stack.isEmpty() && nums[stack.peek()] >= nums[i]) {
                    stack.pop();
                }
                if (stack.isEmpty()) {
                    list.add(-1);
                } else if (!stack.isEmpty() && nums[stack.peek()] < nums[i]) {
                    list.add(stack.peek());
                }
            }
            stack.push(i);
        }
        return list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    private int[] getNSR(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();
        int n = nums.length;

        for (int i = n - 1; i >= 0; i--) {
            if (stack.isEmpty()) {
                list.add(n);
            } else if (!stack.isEmpty() && nums[stack.peek()] < nums[i]) {
                list.add(stack.peek());
            } else if (!stack.isEmpty() && nums[stack.peek()] >= nums[i]) {
                while (!stack.isEmpty() && nums[stack.peek()] >= nums[i]) {
                    stack.pop();
                }
                if (stack.isEmpty()) {
                    list.add(n);
                } else if (!stack.isEmpty() && nums[stack.peek()] < nums[i]) {
                    list.add(stack.peek());
                }
            }
            stack.push(i);
        }
        Collections.reverse(list);

        return list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}