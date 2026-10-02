class Solution {

    public List<List<Integer>> combine(int n, int k) {
        int i = 1;
        List<List<Integer>> result = new ArrayList<>();

        solve(i, n, k, new ArrayList<>(), result);
        return result;
    }

    private void solve(int i, int n, int k, List<Integer> list, List<List<Integer>> result) {
        if (list.size() == k) {
            result.add(new ArrayList<>(list));
            System.out.println(list);
            return;
        }
        if (i > n) {
            return;
        }

        list.add(i);
        solve(i + 1, n, k, list, result);

        list.remove(list.size() - 1);
        solve(i + 1, n, k, list, result);
    }
}