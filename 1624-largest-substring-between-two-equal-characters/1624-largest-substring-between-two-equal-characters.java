class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        Map<Character, Integer> hashMap = new HashMap<>();
        int maxLength = -1;
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(hashMap.containsKey(c)){
                int length = i - hashMap.get(c)-1;
                maxLength = Math.max(maxLength, length);
            }else{
                hashMap.put(c, i);
            }
        }
        return maxLength;
    }
}