class Solution {
    public int trap(int[] height) {
        int size = height.length;
        int maxLeft[] = new int[size];
        int maxRight[] = new int[size];
        int waterHeight[] = new int[size];

        maxLeft[0] = height[0];
        for (int i = 1; i < size; i++) {
            maxLeft[i] = Math.max(maxLeft[i - 1], height[i]);
        }

        maxRight[size - 1] = height[size - 1];
        for (int i = size - 2; i >= 0; i--) {
            maxRight[i] = Math.max(maxRight[i + 1], height[i]);
        }

        int sum = 0;
        for (int i = 0; i < size; i++) {
            waterHeight[i] = Math.min(maxLeft[i], maxRight[i]) - height[i];
            sum = sum + waterHeight[i];
        }

        return sum;
    }
}
// class Solution {
//     public int trap(int[] height) {
//         int left = 0, right = height.length - 1;
//         int leftMax = 0, rightMax = 0, water = 0;

//         while (left <= right) {
//             if (height[left] <= height[right]) {
//                 if (height[left] >= leftMax) {
//                     leftMax = height[left];
//                 } else {
//                     water += leftMax - height[left];
//                 }
//                 left++;
//             } else {
//                 if (height[right] >= rightMax) {
//                     rightMax = height[right];
//                 } else {
//                     water += rightMax - height[right];
//                 }
//                 right--;
//             }
//         }

//         return water;
//     }
// }