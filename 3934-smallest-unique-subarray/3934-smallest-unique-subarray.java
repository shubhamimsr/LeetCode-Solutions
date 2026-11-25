class Solution {
    private final long MOD = 1_000_000_007L;

    public int smallestUniqueSubarray(int[] nums) {
        int n = nums.length;
        long base = Arrays.stream(nums)
                        .max()
                        .orElse(10) + 2L;
        int result = 0;
        // System.out.println(base);

        int l = 1, r = n;
        while(l<=r){
            int mid = l + (r-l) / 2;

            if(solve(mid, base, nums)){
                result = mid;
                r = mid - 1;
            }else
                l = mid + 1;
        }

        return result;
    }


    private boolean solve(int size, long base, int nums[]){
        int n = nums.length;
        
        long b = 1;
        for (int k = 0; k < size - 1; k++) {
            b = (b * base) % MOD;
        }        

        long hash = 0;
        Map<Long, Integer> map = new HashMap<>();
        int i=0, j=0;

        while(j<n){
            hash = (hash * base + nums[j]) % MOD;

            if(j-i+1 < size){
                j++;
            }else{
                map.put(hash, map.getOrDefault(hash, 0) + 1);
                
                //shrinking the window size
                hash = (hash - (b * nums[i]) % MOD + MOD)%MOD;

                i++;
                j++;
            }
        }

        // Map.Entry<Integer, Integer> en: entrySet().values();
        for(int s: map.values()){
            if(s == 1)
                return true;
        }
        return false;
    }
}