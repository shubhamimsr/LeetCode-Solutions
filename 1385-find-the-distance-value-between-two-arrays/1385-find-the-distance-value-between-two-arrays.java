class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        long result = Arrays.stream(arr1)
                            .filter(n->Arrays.stream(arr2)
                                                .allMatch(m-> (Math.abs(m-n)) > d))
                            .count();
        return (int)result;
    }
}