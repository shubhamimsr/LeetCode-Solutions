class Solution {
    public void reverseString(char[] s) {
        int l = 0;
        int r = s.length-1;
        
        while(l < r){
            char temp = s[l];
            s[l] = s[r];
            s[r] = temp;
            l++;
            r--;
        }
        // System.out.print("[");
        // for(int i=0; i<s.length; i++){
        //     System.out.print("\"" + s[i] + "\"");
        //     if(s[i] < s.length-1){
        //         System.out.print(",");
        //     }
        // }
        // System.out.print("]");
    }
}