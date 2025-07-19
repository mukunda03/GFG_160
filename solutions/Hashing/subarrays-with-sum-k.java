/*
Time Complexity :O(n)
Space Complexity : O(n)

linkedIn : www.linkedin.com/in/mukundasv03 
Github : https://github.com/mukunda03
*/

import java.util.*;

class Solution {
    public int cntSubarrays(int[] arr, int k) {
        // code here
        Map<Integer, Integer> prefixSums = new HashMap<>();
        int res = 0;
        int currSum = 0;
        
        for(int i = 0;i< arr.length;i++){
            currSum += arr[i];
            
            if(currSum == k)
            res++;
            
            if(prefixSums.containsKey(currSum-k))
            res += prefixSums.get(currSum -k);
            
            prefixSums.put(currSum, prefixSums.getOrDefault(currSum,0) +1);
        }
        return res;
    }
}
