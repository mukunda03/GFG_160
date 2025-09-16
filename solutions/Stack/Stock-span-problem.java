/*
Time Complexity :  O(n) 
Space Complexity : O(n)

linkedIn : www.linkedin.com/in/mukundasv03
Github : https://github.com/mukunda03
*/

class Solution {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        // code here
        int n = arr.length;
        ArrayList<Integer> span = new ArrayList<>(Collections.nCopies(n,0));
        Stack<Integer> st = new Stack<>();
        
        for(int i =0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()] <= arr[i]){
                st.pop();
            }
            
            if(st.isEmpty()){
                span.set(i,(i+1));
            }else{
                span.set(i,(i-st.peek()));
            }
            st.push(i);
        }
        return span;
    }
}
