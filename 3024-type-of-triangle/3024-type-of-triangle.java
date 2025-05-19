class Solution {
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

    public boolean isTriangle(int [] nums){
        int first = nums[0];
        int second = nums[1];
        int third = nums[2];
        if(first+second>third && second+third>first && first+third>second)
            return true;
        else
            return false;
    }
}