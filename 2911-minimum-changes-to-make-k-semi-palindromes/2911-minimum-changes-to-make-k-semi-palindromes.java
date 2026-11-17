class Solution {
    //  int memoCost[][]=null;
    public int minimumChanges(String s, int k) {
        int n = s.length();
        int memo[][] = new int[n+1][k+1];
        int memoCost[][] = new int[n+1][n+1];

        for(int []row: memo){
            Arrays.fill(row, -1);
        }
        for(int []row:memoCost){
            Arrays.fill(row, -1);
        }

        return solve(0, s, k, n, memo, memoCost);
    }

    private int solve(int start, String s, int k, int n, int memo[][], int memoCost[][]){
        if(k == 0){
            if(start == n)
                return 0;
            return Integer.MAX_VALUE;
        }

        int minCost = Integer.MAX_VALUE;
        if(start+2*k > n)
            return Integer.MAX_VALUE;
        
        if(memo[start][k] != -1)
            return memo[start][k];
            
        for(int end=start+1; end<n; end++){
            int remainingCost = solve((end+1), s, (k-1), n, memo, memoCost);
            if(remainingCost == Integer.MAX_VALUE)
                continue;

            minCost = Math.min(minCost, (getCost(s, start, end, memoCost) + remainingCost));
        }
        return memo[start][k] = minCost;

    }

    private int getCost(String s, int i, int j, int memoCost[][]){
        int len = j-i+1;
        int minCost = Integer.MAX_VALUE;

        if(memoCost[i][j] != -1)
            return memoCost[i][j];

        for(int d=1; d<len; d++){
            if(len % d != 0)
                continue;

            int cost = 0;
            for(int group=0; group<d; group++){
                int l= i+group;
                int r = l + (len/d - 1)*d;

                while(l<r){
                    if(s.charAt(l) != s.charAt(r))
                        cost++;
                    
                    l += d;
                    r -= d;
                }
            }
            minCost = Math.min(minCost, cost);
            // return minCost;
        }
        return memoCost[i][j] = minCost;
    }
}