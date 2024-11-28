class Solution {
    public int mySqrt(int x) {
        // return (int)Math.sqrt(x);   
        long r = x;
        while (r*r > x)
            r = (r + x/r) / 2;
        return (int) r;
    }
}