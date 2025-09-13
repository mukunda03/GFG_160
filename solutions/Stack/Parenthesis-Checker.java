/*
Time Complexity :  O(n) 
Space Complexity : O(n)

linkedIn : www.linkedin.com/in/mukundasv03
Github : https://github.com/mukunda03
*/


import java.util.Stack;
import java.util.Vector;

class Solution {
    public boolean isBalanced(String s) {
        // code here
        Stack<Character> st = new Stack<>();
        
        for(char ch : s.toCharArray()){
            
            if(ch == '(' || ch == '{' || ch == '['){
                st.push(ch);
            }
            else if(ch == ')' || ch == '}' || ch == ']'){
                if(st.isEmpty()) return false;
                char top = st.peek();
                
                if((ch == ')' && top != '(') ||
                (ch == '}' && top != '{') || 
                (ch == ']' && top != '[')){
                    return false;
                }
                st.pop();
            }
        }
        return st.isEmpty();
    }
}
