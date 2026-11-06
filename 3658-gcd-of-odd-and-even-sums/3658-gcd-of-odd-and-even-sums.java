class Solution {
    public int gcdOfOddEvenSums(int n) {
        if(n<=1)
            return n;

        int evenCount = n * (n+1);
        int oddCount = n * n;
  
        while (oddCount != 0) {
            int temp = oddCount;
            oddCount = evenCount % oddCount;
            evenCount = temp;
        }
        return evenCount;
    }
}