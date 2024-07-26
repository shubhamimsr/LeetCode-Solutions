class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> lst = new ArrayList<>();
        int i = num.length-1;
        while(i >= 0 || k>0){
            if(i>=0){
                k = k + num[i];
                i--;
            }
            lst.addFirst(k%10);
            k = k/10;
}
        return lst;
    }
}