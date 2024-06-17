class Solution {
    public boolean isValid(String s) {
        
       Stack<Character> stack_element = new Stack<Character>();
          
        for(Character c: s.toCharArray())
        {
             if(s.length()%2 != 0)
        	{
        		return false;
        	}
        	else if(c == '(' ||c == '{' ||c == '[' )
        	{
        		stack_element.push(c);
                
        	}
        	else if(c == ')' && !stack_element.empty() && stack_element.peek() == '(')
        	{
        		stack_element.pop();
                // return false;
        	}
        	else if(c == '}' && !stack_element.empty() && stack_element.peek() == '{')
        	{
        		stack_element.pop();
                // return false;
        	}
        	else if(c == ']' && !stack_element.empty() && stack_element.peek() == '[')
        	{
        		stack_element.pop();
                // return false;
        	}
            else
            {
                return false;
            }
        }
        
        return stack_element.isEmpty();

    }
}