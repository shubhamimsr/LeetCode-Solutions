// class Solution {

//     public int totalNumbers(int[] digits) {
//         boolean used[] = new boolean[digits.length];
//         int number = 0, count = 0;
//         Set<Integer> set = new HashSet<>();

//         solve(digits, used, number, count, set);
//         return set.size();
//     }

//     private void solve(int digits[], boolean[] used, int num, int count, Set<Integer> set) {
//         if (count == 3) {
//             if (num % 2 == 0) {
//                 set.add(num);
//             }
//         }

//         for (int i = 0; i < digits.length; i++) {

//             if (used[i])
//                 continue;

//             if (count == 0 && digits[i] == 0)
//                 continue;
//             if (count == 2 && digits[i] % 2 == 1)
//                 continue;

//             used[i] = true;

//             int nextNum = num * 10 + digits[i];
//             solve(digits, used, nextNum, count + 1, set);

//             used[i] = false;
//         }
//     }
// }

class Solution {

    public int totalNumbers(int[] digits) {
        int map[] = new int[10];
        Set<Integer> set = new HashSet<>();

        for (int d : digits) {
            map[d]++;
        }

        for (int i = 1; i < 10; i++) {
            if (map[i] == 0)
                continue;
            map[i]--;
            for (int j = 0; j < 10; j++) {
                if (map[j] == 0)
                    continue;
                map[j]--;
                for (int k = 0; k <= 8; k += 2) {
                    if (map[k] == 0)
                        continue;
                    map[k]--;
                    int num = i * 100 + j * 10 + k;
                    if (num % 2 == 0)
                        set.add(num);

                    map[k]++;
                }
                map[j]++;
            }
            map[i]++;
        }
        return set.size();
    }
}