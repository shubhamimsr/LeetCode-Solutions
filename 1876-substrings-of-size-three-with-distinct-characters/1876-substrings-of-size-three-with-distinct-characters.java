class Solution {
    public int countGoodSubstrings(String s) {
        int i = 0, j = 0;
        int n = s.length();
        int count = 0;
        Map<Character, Integer> map = new HashMap<>();

        while(j < n){
            char ch = s.charAt(j);
            map.put(ch, map.getOrDefault(ch,0)+1);

            if(j-i+1 < 3){
                j++;
            }else if(j-i+1 == 3){
                if(map.size() == 3){
                    count++;
                }

                char left = s.charAt(i);
                map.put(left, map.get(left)-1);

                if(map.get(left) == 0){
                    map.remove(left);
                }
                
                i++;
                j++;
            }
        }
        return count;
    }
}