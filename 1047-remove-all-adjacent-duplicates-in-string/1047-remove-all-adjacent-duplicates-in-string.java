class Solution {
    public String removeDuplicates(String s) {
     
        int n=s.length();
        Stack<Character> stack = new Stack<Character>();
        stack.push(s.charAt(0));
        for(int i=1; i<n; i++){
            char element=s.charAt(i);
            
                if(stack.empty()){stack.push(element);}
                else if(element==stack.peek()){
                    stack.pop();
                }else{

                    stack.push(element);
                }
            
        }
        String ans="";
        for(int i=0; i<stack.size(); i++){
            char temp = stack.get(i);
            ans+=temp;
        }
        return ans;
    }
}