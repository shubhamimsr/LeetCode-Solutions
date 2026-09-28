class Solution {
    public boolean isSubsequence(String s, String t) {
        return solve(0, 0, s, t);
    }

    private boolean solve(int i, int j, String s, String t) {

        if (i == s.length()) {
            return true;
        }
        if (j == t.length()) {
            return false;
        }

        if (s.charAt(i) == t.charAt(j)) {
            return solve(i + 1, j + 1, s, t);
        }

        return solve(i, j + 1, s, t);
    }
}

/*Will give TLE
    Coz, T.C.= 2^n => t.legnth()=10,000
                    => 2^(10,000)
*/
// class Solution {
//     public boolean isSubsequence(String s, String t) {
//         int n = s.length();
//         StringBuilder sb = new StringBuilder();

//         return solve(0, s, n, t, sb);
//     }

//     private boolean solve(int i, String s, int n, String t, StringBuilder currString) {
//         if (currString.length() == s.length()) {
//             System.out.println(currString.toString());
//             return s.equals(currString.toString());
//         }

//         if (i == t.length()) {
//             return false;
//         }

//         currString.append(t.charAt(i));
//         if (solve(i + 1, s, n, t, currString))
//             return true;

//         currString.deleteCharAt(currString.length() - 1);
//         if (solve(i + 1, s, n, t, currString))
//             return true;

//         return false;
//     }
// }