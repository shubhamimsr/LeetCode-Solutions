    class Solution {
        public int[] runningSum(int[] nums){
            int result[] = new int[nums.length];
            int sum = 0,
            c = 0;

            for(int i:nums){
                sum += i;
                result[c] = sum;
                c++;
            }
            return result;
        }
    }