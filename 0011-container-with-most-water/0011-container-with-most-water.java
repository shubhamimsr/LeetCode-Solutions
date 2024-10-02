class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length-1, maxArea = 0;
        
        while(left < right){
            int len = Math.min(height[left],height[right]);
            int width = right - left;
            int area = len * width;
            maxArea = Math.max(maxArea, area);
            if(height[left] > height[right]){
                right--;
            }else if(height[left] < height[right]){
                left++;
            }else{
                left++;
                right--;
            }
        }
        return maxArea;
    }
}