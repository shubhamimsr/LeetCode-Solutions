class Solution {
    public int[] countServers(int n, int[][] logs, int x, int[] queries) {

        int logLen = logs.length;
        int queryLen = queries.length;
        int result[] = new int[queryLen];

        Arrays.sort(logs, (a, b) -> Integer.compare(a[1], b[1]));

        int sortedQueries[][] = new int[queryLen][2];
        for (int i = 0; i < queryLen; i++) {
            sortedQueries[i][0] = queries[i];
            sortedQueries[i][1] = i;
        }
        Arrays.sort(sortedQueries, (a, b) -> Integer.compare(a[0], b[0]));

        HashMap<Integer, Integer> map = new HashMap<>();
        int i = 0; // window start
        int j = 0; // window end

        for (int k = 0; k < queryLen; k++) {

            int startServeSpan = sortedQueries[k][0] - x;
            int endServeSpan = sortedQueries[k][0];

            // window expansion
            while (j < logLen && logs[j][1] <= endServeSpan) {
                map.put(logs[j][0], map.getOrDefault(logs[j][0], 0) +1);
                j++;
            }

            // window compression
            while (i < logLen && logs[i][1] < startServeSpan) {
                map.put(logs[i][0], map.get(logs[i][0]) - 1);
                if (map.get(logs[i][0]) == 0) 
                    map.remove(logs[i][0]);
                i++;
            }

            int idx = sortedQueries[k][1];
            result[idx] = n - map.size();
        }

        return result;
    }
}