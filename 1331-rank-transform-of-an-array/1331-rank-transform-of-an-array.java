class Solution {
    public int[] arrayRankTransform(int[] arr) {
        Set<Integer> set = new TreeSet<>();
        for(int n:arr){
            set.add(n);
        }
        Map<Integer,Integer> map = new HashMap<>();
        int k=1;
        for(int n: set){
            map.put(n,k++);
        }
        int[] resultArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            resultArray[i] = map.get(arr[i]);
        }
        return resultArray;
    }
}