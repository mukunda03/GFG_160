/*
Time Complexity : O(n)
Space Complexity : O(n)

linkedIn : www.linkedin.com/in/mukundasv03 
Github : https://github.com/mukunda03
*/

import java.util.HashSet;

class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
        HashSet<Integer> set = new HashSet<>();
        
        for(int i =0;i<arr.length;i++){
            int complement = target - arr[i];
            
            if(set.contains(complement)){
                return true;
            }
            set.add(arr[i]);
        }
        return false;
        
    }
}
