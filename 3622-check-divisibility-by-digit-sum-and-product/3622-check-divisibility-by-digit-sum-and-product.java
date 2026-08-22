class Solution {
    public boolean checkDivisibility(int n) {
        int sum = getSum(n);
        int product = getProduct(n);

        if (n != 0) {
            int bothSum = sum + product;
            if (n % bothSum == 0) {
                return true;
            }
        }
        return false;
    }

    private static int getSum(int num) {
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            sum = sum + digit;
            num = num / 10;
        }

        return sum;
    }

    private static int getProduct(int num) {
        int product = 1;
        while (num != 0) {
            int digit = num % 10;
            product = product * digit;
            num /= 10;
        }
        return product;
    }
}