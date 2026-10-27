class Solution {
    public String[] createGrid(int m, int n) {
        String result[] = new String[m];

        String hash = "#";
        String dot = ".";

        //will consider walls till (n-2)th positions with "." in (n-1) col
        Arrays.fill(result, hash.repeat(n-1) + dot);

        //will replace the 1st row by "." 
        result[0] = dot.repeat(n);
        
        // for(String  c : result){
        //     System.out.print(c);
        // }
        
        return result;
    }
}