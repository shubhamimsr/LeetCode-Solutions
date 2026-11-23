class ProductOfNumbers {
    private final List<Integer> productOfNumbers;

    public ProductOfNumbers() {
        this.productOfNumbers = new ArrayList<>();
    }

    public void add(int num) {
        if (num == 0)
            productOfNumbers.clear();
        else {
            productOfNumbers.add(num * (productOfNumbers.isEmpty() ? 1 : productOfNumbers.get(productOfNumbers.size()-1)));
        }
    }

    public int getProduct(int k) {
        int n = productOfNumbers.size();
        if (n == 0 || k > n)
            return 0;
        if (k == n)
            return productOfNumbers.get(n - 1);
            
        return productOfNumbers.get(n - 1) / productOfNumbers.get(n - k - 1);
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */