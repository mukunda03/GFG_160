/*
Time Complexity :  O(1) 
Space Complexity : O(n)

linkedIn : www.linkedin.com/in/mukundasv03
Github : https://github.com/mukunda03
*/

class SpecialStack {
  Stack<Integer> st = new Stack<>();
  Stack<Integer> minSt = new Stack<>();
  
  public void push(int x){
      st.push(x);
      
      if(minSt.isEmpty() || x <= minSt.peek()){
          minSt.push(x);
      }else{
          minSt.push(minSt.peek());
      }
  }
  
  public void pop(){
      if(st.isEmpty()){
          return;
      }
      
      st.pop();
      minSt.pop();
  }
  
  public int peek(){
      if(st.isEmpty()){
          return -1;
      }
      return st.peek();
  }
  
  public int getMin(){
      if(minSt.isEmpty()){
          return -1;
      }
      return minSt.peek();
  }
  
  public boolean isEmpty(){
      return st.isEmpty();
  }
  
}
