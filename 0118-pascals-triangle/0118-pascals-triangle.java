class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> resultList = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            // First and last element of each row is always 1
            row.add(1);

            // Fill in the middle values using the previous row
            for (int j = 1; j < i; j++) {
                int val = resultList.get(i - 1).get(j - 1) + resultList.get(i - 1).get(j);
                row.add(val);
            }

            if (i > 0) {
                row.add(1); // Last element is always 1
            }

            resultList.add(row);
        }

        return resultList;
    }
}
// class Solution {
//     public List<List<Integer>> generate(int numRows) {
//         List<List<Integer>> resultList = new ArrayList<>();
//         Integer num = 1;
//         for (int i = 1; i <= numRows; i++) {
//             List<Integer> list = new ArrayList<>();
//             if (num == 1) {
//                 list.add(num);
//             } else {
//                 int temp = num;
//                 while (temp != 0) {
//                     int digit = temp % 10;
//                     list.add(digit);
//                     temp = temp / 10;
//                 }
//             }
//             num = num * 11;
//             resultList.add(list);
//         }
//         return resultList;
//     }
// }