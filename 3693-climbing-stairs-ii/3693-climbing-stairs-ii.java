class Solution {
    public int climbStairs(int n, int[] costs) {
        int memo[] = new int [n+1];
        Arrays.fill(memo, -1);

        return solve(0, costs, n, memo);
    }

    private int solve(int i, int costs[], int n, int memo[]) {
        if (i == n) {
            return 0;
        }
        if(memo[i] != -1){
            return memo[i];
        }

        int cost = Integer.MAX_VALUE;
        for(int j=1; j<=3; j++){
            int k = i+j;        // can take steps i+1, i+2 or i+3
            if(k <= n){
                cost = Math.min(cost, (costs[k-1] + (k-i)*(k-i)) + solve(k, costs,n, memo));
                // cost = Math.min(cost, (costs[k-1] + (j*j) + solve(k, costs,n, memo));
            }
        }
       
        return memo[i] = cost;
    }
}