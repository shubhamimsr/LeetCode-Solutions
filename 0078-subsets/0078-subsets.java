class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        List<List<Integer>> result = new ArrayList<>();
        // result.add(new ArrayList<>());
        solve(0, nums, new ArrayList<>(), result);
        return result;
    }

    private void solve(int i, int[] nums, List<Integer> list, List<List<Integer>> result) {
        if (i == nums.length) {
            result.add(new ArrayList<>(list));
            return;
        }

        list.add(nums[i]);
        // System.out.println(list);
        solve(i + 1, nums, list, result);

        list.remove(list.size() - 1);
        // System.out.println(list);
        solve(i + 1, nums, list, result);

    }
}