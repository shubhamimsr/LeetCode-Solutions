class Solution {
    public long countCommas(long n) {
        long start = 1000;
        long result = 0;

        while (start <= n) {
            result += n - start + 1;
            start *= 1000;
        }
        return result;
    }
}

// class Solution {
//     public long countCommas(long n) {
//         long lower = 1000;
//         long commas = 1;
//         long result = 0;

//         while(lower <=n){
//             long upper = lower*1000 -1;
//             if(upper>n)
//                 upper=n;

//             long countOfNos = upper-lower+1;
//             result += countOfNos * commas;

//             lower *= 1000;
//             commas++;
//         }
//         return result;
//     }
// }