class Solution {
    public String gcdOfStrings(String str1, String str2) {
        StringBuilder sb1 = new StringBuilder(str1).append(str2);
        StringBuilder sb2 = new StringBuilder(str2).append(str1);

        if(!sb1.toString().equals(sb2.toString())){
            return "";
        }
        int gcdLength = gcdLength(str1.length(), str2.length());
        StringBuilder resultSb = new StringBuilder(str1.substring(0, gcdLength));
        return resultSb.toString();
    }

    private static int gcdLength(int len1, int len2){
        while(len2 != 0){
            int temp = len2;
            len2 = len1 % len2;
            len1 = temp;
        }
        return len1;
    }
}