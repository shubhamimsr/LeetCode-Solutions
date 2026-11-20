class Solution {
    public int maxSelectedElements(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int memo[][] = new int[n+1][2];
        for(int row[] : memo){
            Arrays.fill(row, -1);
        }

        int result = 1;
        for(int i=0; i<n; i++){
            // inc nums[i] either by 0 or 1
            result = Math.max(result, solve(i, 0, nums, memo));
            result = Math.max(result, solve(i, 1, nums, memo));
        }
        // System.out.println(Arrays.deepToString(memo));
        return result;
    }

    private int solve(int i, int inc, int nums[], int memo[][]){
        if(memo[i][inc] != -1)
            return memo[i][inc];

        int currVal = nums[i] + inc;
        int len = 1;

        //CASE I: Find (currVal+1), directly
        int j = searchNextGreater(i+1, currVal+1, nums);
        if(j != -1)
            len = Math.max(len, 1 + solve(j, 0, nums, memo));

        //CASE II: Find (currVal) & add (+1) to it.
        j = searchNextGreater(i+1, currVal, nums);
        if(j != -1)
            len = Math.max(len, 1 + solve(j, 1, nums, memo));
        

        return memo[i][inc] = len;
    }

    private int searchNextGreater(int low, int k, int nums[]){
        int high = nums.length-1;
        int ans = -1;

        while(low <= high){
            int mid = low+(high-low)/2;
            if(nums[mid] == k){
                ans = mid;
                high = mid-1;
            }else if(nums[mid] > k){
                high = mid-1;
            }else{
                low=mid+1;
            }

        }
        return ans;
    }
}