class Solution {
    public int maxWidthRamp(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int result = 0;
        
            for(int i=0; i < nums.length; i++){
            if(stack.isEmpty() || nums[stack.peek()] > nums[i])
            {
                stack.push(i);
            }
        }
        
        for(int i=nums.length-1; i >= 0; i--){
            while(!stack.isEmpty() && nums[stack.peek()] <= nums[i]){
                result = Math.max(result, i-stack.pop());
            }
        }
        return result;
    }
}