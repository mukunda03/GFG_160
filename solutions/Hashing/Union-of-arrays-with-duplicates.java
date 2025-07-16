/*
Time Complexity :O(n+m)
Space Complexity : O(n+m)

linkedIn : www.linkedin.com/in/mukundasv03 
Github : https://github.com/mukunda03
*/

import java.util.*;

class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        // code here
        HashSet<Integer> st = new HashSet<>();
        
        for(int num : a)
        st.add(num);
        
        for(int num : b)
        st.add(num);
        
        ArrayList<Integer> res = new ArrayList<>();
        
        for(int it :st)
        res.add(it);
        
        return res;
    }
}
