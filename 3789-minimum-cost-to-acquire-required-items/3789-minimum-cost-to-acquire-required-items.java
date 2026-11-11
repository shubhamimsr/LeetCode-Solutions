
class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        long result = 0L;
        long bothNeeds = Math.min(need1, need2);
        
        result += bothNeeds * Math.min((long)costBoth, (long)(cost1+cost2));

        long rem1 = need1 - bothNeeds;
        long rem2 = need2 - bothNeeds;

        result += rem1 * Math.min(cost1, costBoth);
        result += rem2 * Math.min(cost2, costBoth);

        return result;
    }
}

// class Solution {
//     public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
//         long totalCost = 1L * (cost1 + cost2);
//         long result = 0;

//         if (totalCost <= costBoth) 
//             return result += (1L*cost1*need1) + (1L*cost2*need2);

//         else if (totalCost > costBoth) {
//             // result += costBoth * need1 + costBoth*need2;
//             int minNeedForBoth = Math.min(need1, need2);
//             result += 1L * minNeedForBoth * costBoth;

//             need1 -= minNeedForBoth;
//             need2 -= minNeedForBoth;
//             if (need1 > 0) {
//                 int takeMinCost = Math.min(cost1, costBoth);
//                 result += 1L * (takeMinCost * need1);
//             }else if(need2 > 0){
//                 int takeMinCost = Math.min(cost2, costBoth);
//                 result += 1L * (takeMinCost * need2);
//             }
//         }
//         return (long)result;
//     }
// }
// /*
// TC - O(1)
// SP - O
//  */