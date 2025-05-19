class Solution {
    public String triangleType(int[] nums) {
        // No need to assign to separate variables; use array indices directly

        if (isTriangle(nums)) {
            if (nums[0] == nums[1] && nums[1] == nums[2]) {
                return "equilateral";
            } else if (nums[0] == nums[1] || nums[1] == nums[2] || nums[2] == nums[0]) {
                return "isosceles";
            } else {
                return "scalene";
            }
        }
        return "none";
    }

    private boolean isTriangle(int[] nums) {
        return nums[0] + nums[1] > nums[2] &&
               nums[1] + nums[2] > nums[0] &&
               nums[2] + nums[0] > nums[1];
    }
}

/*class Solution {
    public String triangleType(int[] nums) {
        // Arrays.sort(nums);
        int first = nums[0];
        int second = nums[1];
        int third = nums[2];

        if (isTriangle(nums)) {
            if (first == second && second == third)
                return "equilateral";
            else if (first == second || second == third || third == first)
                return "isosceles";
            else
                return "scalene";

        } else {
            return "none";
        }
    }

    public boolean isTriangle(int[] nums) {
        int first = nums[0];
        int second = nums[1];
        int third = nums[2];
        if (first + second > third && second + third > first && first + third > second)
            return true;
        else
            return false;
    }
}*/