class Solution {
    public List<String> removeInvalidParentheses(String s) {
        
        Set<String> resultSet=new HashSet<>();
        int depth=0;
        int [] maxLength={0};

        solve(0, s,depth, maxLength,new StringBuilder(),resultSet);
        return resultSet.stream()
                        .collect(Collectors.toCollection(ArrayList::new)); 
      
    }

    private void solve(int i, String s,  int count,int[] maxLength, StringBuilder sb, Set<String>set){
        if(count<0)return;

        if(i==s.length()){
            if(count==0){
                if(sb.length() > maxLength[0]){
                    maxLength[0] = sb.length();
                    set.clear();
                }

                if(sb.length() == maxLength[0]){
                    set.add(sb.toString());
                }
            }
            return;
        }

        char ch = s.charAt(i);
        if(i<s.length() && Character.isAlphabetic(ch)){
            sb.append(ch);
            solve(i+1, s,count, maxLength, sb,set);

            sb.deleteCharAt(sb.length()-1);
            
            return;
        }else if(i<s.length()){//for brackets '(' & ')'

            sb.append(ch);
            int updatedCount = count+ (ch == '('? 1:-1);
            solve(i+1, s,updatedCount, maxLength, sb,set);
            


            sb.deleteCharAt(sb.length()-1);
            // count+= ch == '('? 1:-1;

            solve(i+1, s,count, maxLength, sb,set);
        }
    }
}