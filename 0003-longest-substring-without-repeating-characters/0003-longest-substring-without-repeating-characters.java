class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0,j=0,maxLen=0;
        char c[] = s.toCharArray();
        int n = c.length;

        Map<Character, Integer> map = new HashMap<>();

        while(j < n){
            map.put(c[j], map.getOrDefault(c[j],0)+1);

            if(map.size() < j-i+1){
                while(map.size() < j-i+1){
                    map.put(c[i], map.get(c[i])-1);

                    if(map.get(c[i]) == 0){
                        map.remove(c[i]);
                    }
                    i++;
                }
            }else if(map.size() == j-i+1){
                maxLen = Math.max(maxLen, j-i+1);
            }
            j++;
        }

        return maxLen;
    }
}