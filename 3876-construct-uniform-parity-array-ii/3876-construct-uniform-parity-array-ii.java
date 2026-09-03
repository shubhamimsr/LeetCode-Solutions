class Solution {
    public boolean uniformArray(int[] nums1) {
        int min = Integer.MAX_VALUE;
        for(int n:nums1){
            min=Math.min(min,n);
        }

        if(min%2!=0){
            return true;
        }

        for(int n:nums1){
            if(n%2==1){
                return false;
            }
        }
        return true;
    }
}
// class Solution {
//     public boolean uniformArray(int[] nums1) {
//         int n = nums1.length;

//         if (checkAllOdds(nums1) || checkAllEvens(nums1)) {
//             return true;
//         }

//         int small = getSmallest(nums1);
//         boolean isSmallEven = small % 2 == 0 ? true : false;

//         int[] nums2 = new int[n];
//         for (int i = 0; i < n; i++) {
//             if (isSmallEven && nums1[i] % 2 != 0) {
//                 nums2[i] = nums1[i] - small;
//             } else if (!isSmallEven && nums1[i] % 2 == 0) {
//                 nums2[i] = nums1[i] - small;
//             } else {
//                 nums2[i] = nums1[i];
//             }
//         }
//         if (checkAllOdds(nums2) || checkAllEvens(nums2)) {
//             return true;
//         }
//         return false;
//     }

//     private static int getSmallest(int arr[]) {
//         int small = arr[0];
//         for (int n : arr) {
//             small = Math.min(small, n);
//         }
//         return small;
//     }

//     private static boolean checkAllOdds(int arr[]) {
//         for (int n : arr) {
//             if (n % 2 == 0) {
//                 return false;
//             }
//         }
//         return true;
//     }

//     private static boolean checkAllEvens(int arr[]) {
//         for (int n : arr) {
//             if (n % 2 != 0) {
//                 return false;
//             }
//         }
//         return true;
//     }
// }