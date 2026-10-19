class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> result = new ArrayList<>();
        
        int countA=0;
        int countB=0;
        
        for(int num:nums){
            if(num<target){
                countA++;           //count of nums[i]s less than target
            }else if(num == target){
                countB++;           //count of nums[i]s equal to target
            }
        }

        int sumCount = countA+countB;
        for(int i=countA; i<sumCount; i++){
            result.add(i);
        }
        return result;
    }
}

// class Solution {
//     public List<Integer> targetIndices(int[] nums, int target) {
//         int n = nums.length;
//         List<Integer> result = new ArrayList<>();
//         int count = 0;
//         for (int num : nums) {
//             if (target > num) {
//                 count++;
//             }
//         }

//         for (int num : nums) {
//             if (target == num) {
//                 result.add(count++);
//             }
//         }
//         return result;
//     }
// }