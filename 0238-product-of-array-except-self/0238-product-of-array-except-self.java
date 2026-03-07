class Solution {
    public int[] productExceptSelf(int[] nums) {
       int n = nums.length;
       int prefixProduct = 1;
       int suffixProduct = 1;
       int [] result = new int[n];

       for(int i=0; i<n; i++){
        result[i] = prefixProduct;
        prefixProduct*= nums[i];
       }

       for(int i=n-1; i>=0; i--){
        result[i] *= suffixProduct;
        suffixProduct *= nums[i];
       }

       return result;
    }
}
// class Solution {
//     public int[] productExceptSelf(int[] nums) {
//         int[] pf= prefix(nums);
//         int n = nums.length;
//         int suffix = 1;
//         for(int i = n-1; i>0;i--){
//             pf[i] = pf[i-1]*suffix;
//             suffix = suffix*nums[i];
//         }
//         pf[0]=suffix;
//         return pf;

//     }
//     public int[] prefix(int[] nums){
//         int n = nums.length;
//         int[] pf = new int[n];
//         pf[0] = nums[0];
//         for(int i = 1 ; i<n ;i++){
//             pf[i] = pf[i-1]*nums[i];
//         }
//         return pf;
//     }
// }