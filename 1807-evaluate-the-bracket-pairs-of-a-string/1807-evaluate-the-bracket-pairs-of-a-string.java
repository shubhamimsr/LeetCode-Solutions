class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        int n = s.length();
        Map<String, String> map = knowledge.stream()
                                            .collect(Collectors.toMap(
                                                    k -> k.get(0),
                                                    k -> k.get(1)
                                                ));

        StringBuilder result = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        int i = 0;
        boolean isBracketOpened = false;
        while (i < n) {
            char ch = s.charAt(i);

            if (ch == '(') {
                isBracketOpened = true;
                temp.setLength(0);
            } else if (ch == ')') {
                isBracketOpened = false;
                if (map.containsKey(temp.toString())) {
                    String s1 = map.getOrDefault(temp.toString(), "?");
                    result.append(s1);
                    temp.setLength(0);
                } else {
                    result.append("?");
                }
            }

            if (Character.isAlphabetic(ch) && isBracketOpened) {
                temp.append(ch);
            } else if (Character.isAlphabetic(ch) && !isBracketOpened) {
                result.append(ch);
            }

            i++;
        }

        return result.toString();
    }
}