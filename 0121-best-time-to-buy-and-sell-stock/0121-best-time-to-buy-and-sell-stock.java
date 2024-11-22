// class Solution {
//     public int maxProfit(int[] prices) {
//         int len = prices.length;
//         int profit = 0;
//         for(int i=1; i < len; i++){
//             if(prices[i] > prices[i-1]){
//                 profit += prices[i] - prices[i-1];
//             }
//         }
//         return profit;
//     }
// }
class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int profit=0;
        int maxprofit=0;
        for(int i=0;i<prices.length;i++){
            profit=prices[i]-min;
            maxprofit=Math.max(maxprofit,profit);
            min=Math.min(min,prices[i]);
        }
        return maxprofit;
    }
}