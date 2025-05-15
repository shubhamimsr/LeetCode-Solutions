// class Solution {
//     public List<String> getLongestSubsequence(String[] words, int[] groups) {

//         int left = groups[0];
//         List<String> result = new ArrayList<>();

//         if (groups.length == 1) {
//             result.add(words[0]);
//             return result;
//         }

//         result.add(words[0]);
//         for (int i = 1; i < groups.length; i++) {
//             if (groups[i] != left) {
//                 left = groups[i];
//                 result.add(words[i]);
//             }
//         }
//         return result;
//     }
// }


class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        List<String> res = new ArrayList<>();
        res.add(words[0]);
        for (int i = 1; i < groups.length; ++i) {
            if (groups[i] != groups[i - 1]) {
                res.add(words[i]);
            }
        }
        return res;
    }
}
