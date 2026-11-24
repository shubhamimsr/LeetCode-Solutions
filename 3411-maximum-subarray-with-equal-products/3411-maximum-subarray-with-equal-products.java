class Solution {
    public int maxLength(int[] nums) {
        int n = nums.length;
        int result = 0;
        
        for(int i=0; i<n; i++){
            long product = 1;
            long lcm = 1;
            long hcf = 0;

            for(int j=i; j<n; j++){
                product *= nums[j];
                hcf = hcf(hcf, nums[j]);
                lcm = lcm(lcm, nums[j]);

                if(product == lcm * hcf)
                    result = Math.max(result, j-i+1);
            } 
        }

        return result;
    }


    private long hcf(long a, long b){
        while(b != 0){
            long t = a % b;
            a = b;
            b = t;
        }
        return a;
    }

    private long lcm(long a, long b){
        return (a / hcf(a,b) * b);
    }
}