class Solution {
    public int maximalRectangle(char[][] matrix) {
        if (matrix == null)
            return 0;
        int[][] nums = Arrays.stream(matrix)
                .map(row -> new String(row)
                        .chars()
                        .map(c -> c - '0')
                        .toArray())
                .toArray(int[][]::new);

        int n = nums.length;
        int m = nums[0].length;
        int areas[] = new int[m];

        for (int j = 0; j < m; j++) {
            areas[j] = nums[0][j];
        }
        int maxArea = MAH(areas);
        // int maxArea = area;

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (nums[i][j] == 0) {
                    areas[j] = 0;
                } else {
                    areas[j] = areas[j] + nums[i][j];
                }
            }
            maxArea = Math.max(maxArea,  MAH(areas));
        }
        return maxArea;
    }

    public int MAH(int[] heights) {
        int[] left = getNSL(heights);
        int[] right = getNSR(heights);
        int n = heights.length;

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