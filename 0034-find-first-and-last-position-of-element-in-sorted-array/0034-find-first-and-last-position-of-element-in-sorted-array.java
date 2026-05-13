class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first=-1,last=-1;
        for(int i=0; i<nums.length; i++){
            if(target == nums[i]){
                if(first == -1){
                    first=i;
                }
                last=i;
            }
        }
        return new int[]{first, last};
    }
}
// public class Solution {
// public int[] searchRange(int[] nums, int target) {
//     int[] result = new int[2];
//     result[0] = findFirst(nums, target);
//     result[1] = findLast(nums, target);
//     return result;
// }

// private int findFirst(int[] nums, int target){
//     int idx = -1;
//     int start = 0;
//     int end = nums.length - 1;
//     while(start <= end){
//         int mid = (start + end) / 2;
//         if(nums[mid] >= target){
//             end = mid - 1;
//         }else{
//             start = mid + 1;
//         }
//         if(nums[mid] == target) idx = mid;
//     }
//     return idx;
// }

// private int findLast(int[] nums, int target){
//     int idx = -1;
//     int start = 0;
//     int end = nums.length - 1;
//     while(start <= end){
//         int mid = (start + end) / 2;
//         if(nums[mid] <= target){
//             start = mid + 1;
//         }else{
//             end = mid - 1;
//         }
//         if(nums[mid] == target) idx = mid;
//     }
//     return idx;
// }
// }