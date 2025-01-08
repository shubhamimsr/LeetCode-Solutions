class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        int maxNoOfCandy = Arrays.stream(candies).max().orElse(0);
        List<Boolean> resultList = new ArrayList<>();
        for(int c : candies){
            if(c + extraCandies >= maxNoOfCandy){
                resultList.add(true);
                continue;
            }
            resultList.add(false);
            
        }
        return resultList;
    }
}