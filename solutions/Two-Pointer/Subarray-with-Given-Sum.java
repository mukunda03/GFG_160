/*
Time Complexity : O(n)
Space Complexity : O(1)

linkedIn : www.linkedin.com/in/mukundasv03
Github : https://github.com/mukunda03
*/


import java.util.*;

class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        int s =0, e=0;
        ArrayList<Integer>  res = new ArrayList<>();
        
        int curr =0;
        
        for(int i =0;i<arr.length;i++){
            curr += arr[i];
            
            if(curr >= target){
                e=i;
                
                while(curr > target && s< e){
                    curr -= arr[s];
                    ++s;
                }
                
                if(curr == target){
                    res.add(s+1);
                    res.add(e+1);
                    return res;
                }
            }
        }
        res.add(-1);
        return res;
    }
}
