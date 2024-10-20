class Solution {
    public boolean sumOfNumberAndReverse(int num) {
        if(num == 0) return true;
        for(int i=0; i<num; i++){
            StringBuilder sb = new StringBuilder(i+"");
            String s = sb.reverse().toString();
            if(Integer.parseInt(s) + i == num)  return true;
        }
        return false;
    }
}