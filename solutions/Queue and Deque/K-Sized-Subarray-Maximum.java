/*
Time Complexity :  O(n) 
Space Complexity : O(k)

linkedIn : www.linkedin.com/in/mukundasv03
Github : https://github.com/mukunda03
*/

import java.util.*;

class Solution {
    public ArrayList<Integer> maxOfSubarrays(int[] arr, int k) {
        // code here
        int n = arr.length;
        
        ArrayList<Integer> res = new ArrayList<Integer>();
        
        Deque<Integer> dq = new ArrayDeque<Integer>();
        
        for(int i =0; i<k; ++i){
            while(!dq.isEmpty() && arr[i] >= arr[dq.peekLast()]){
                dq.pollLast();
            }
            dq.addLast(i);
        }
        
        for(int i =k; i < arr.length;++i){
            res.add(arr[dq.peekFirst()]);
            
            while(!dq.isEmpty() && dq.peekFirst() <= i-k){
                dq.pollFirst();
            }
            
            while(!dq.isEmpty() && arr[i] >= arr[dq.peekLast()]){
                dq.pollLast();
            }
            dq.addLast(i);
        }
        res.add(arr[dq.peekFirst()]);
        return res;
    }
}
