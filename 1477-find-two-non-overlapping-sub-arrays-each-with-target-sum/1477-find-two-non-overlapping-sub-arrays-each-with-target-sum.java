class Solution {
    public int minSumOfLengths(int[] arr, int target) {
        final int INFY = Integer.MAX_VALUE;
        int n = arr.length;

        int i = 0, j = 0;
        int currSum = 0;
        int result = INFY,
            bestMinLen = INFY;
        

        int suffixMinLen[] = new int[n];
        Arrays.fill(suffixMinLen, INFY);

        while (j < n) {
            currSum += arr[j];

            if (currSum > target) {
                while (currSum > target && i < j) {
                    currSum -= arr[i++];
                }
            }

            if (currSum == target) {
                int currLen = j - i + 1;

                if (i > 0 && suffixMinLen[i - 1] != INFY) {
                    result = Math.min(result, suffixMinLen[i - 1] + currLen);
                    // System.out.println(result);
                }
                bestMinLen = Math.min(bestMinLen, currLen);
            }
            suffixMinLen[j] = bestMinLen;
            j++;
        }

        return result != INFY ? result : -1;
    }
}