class Solution {
    public boolean sumGame(String num) {
        int size = num.length();

        int leftSum[] = getSums(num.substring(0, size / 2));
        int rightSum[] = getSums(num.substring(size / 2, size));

        int digitLeft = leftSum[0];
        int qLeft = leftSum[1];
        int digitRight = rightSum[0];
        int qRight = rightSum[1];
        return ((qLeft + qRight) % 2 == 1) || digitLeft - digitRight != ((qRight - qLeft) * 9) / 2;

    }

    private int[] getSums(String str) {
        char[] array = str.toCharArray();
        // [sumOfDigits, countOfQuestionMarks]
        int sum = 0;
        int quesSum = 0;

        for (char c : array) {
            if (c == '?') {
                quesSum++;
            } else {
                sum += c - '0';
            }
        }
        return new int[] { sum, quesSum };
    }
}