class Solution {
    public boolean isValid(String str) {
        Stack<Character> s=new Stack<>();
        int n=str.length();
        for(int i=0; i<n; i++){
            char c=str.charAt(i);
            if(c=='(' || c=='[' || c=='{'){ s.push(c); }
            
            else{
                if(s.empty()) return false;
                char d=s.peek();
                if(c==')'){
                    if(d=='(') s.pop();
                    else return false;
                }
                else if(c=='}'){
                    if(d=='{') s.pop();
                    else return false;
                }
                else if(c==']'){
                    if(d=='[') s.pop();
                    else return false;
                }
                }
            }
        
        return s.isEmpty();
    }
}

// else{
//             if(!stack.isEmpty()){
//             switch(s.charAt(i)){
                    
//                 case  ')': 
                    
//                     if(stack.peek() == '(')
//                         stack.pop();
//                        else
//                        stack.push(s.charAt(i));
//                     break;
//                 case '}' : 
                      
//                     if(stack.peek() == '{')
//                         stack.pop();
//                        else
//                        stack.push(s.charAt(i));
//                     break;
//                 case ']' : 
                      
//                     if(stack.peek() == '[')
//                         stack.pop();
//                     else
//                        stack.push(s.charAt(i));
//                     break;
                    
//             }