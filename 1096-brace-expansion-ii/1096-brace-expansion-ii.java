class Solution {
    int n, idx;
    String s;

    public List<String> braceExpansionII(String expression) {
        n = expression.length();
        idx = 0;
        s = expression;

        Set<String> set = getUnion();

        return set.stream()
                .filter(s->!s.isEmpty())
                .collect(Collectors.toCollection(ArrayList::new));

    }

    private Set<String> getUnit() {
        Set<String> unitResult = new TreeSet<>();

        if (s.charAt(idx) == '{') {
            idx++;
            Set<String> temp = getUnion();
            unitResult.addAll(temp);
        } else {
            unitResult.add(String.valueOf(s.charAt(idx)));
        }
        idx++;
        return unitResult;
    }

    private Set<String> getConcat() {
        Set<String> concatResult = new TreeSet<>();

        concatResult.add("");

        while (idx < n && (s.charAt(idx) == '{' || Character.isAlphabetic(s.charAt(idx)))) {
            Set<String> temp = getUnit();

            //trying to concat each string of result with temp (say, PRODUCT of numeric values)
            Set<String> concatCartesian = new TreeSet<>();
            for (String i : concatResult) {
                for (String j : temp) {
                    concatCartesian.add(i + j);
                }
            }
            // concatResult.addAll(concatCartesian);
            concatResult=concatCartesian;

            // System.out.println("Cartesian:"+concatCartesian);
            // System.out.println("\t\t\t\t\t\tResult: "+concatResult);
        }
        return concatResult;
    }

    private Set<String> getUnion() {
        Set<String> unionResult = new TreeSet<>();

        while (true) {
            Set<String> temp = getConcat();
            unionResult.addAll(temp);

            if (idx < n && s.charAt(idx) == ',') {
                idx++;
            } else {
                break;
            }
        }

        return unionResult;
    }
}