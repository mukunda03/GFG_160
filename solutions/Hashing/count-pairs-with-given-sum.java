/*

Time Complexity : O(n)
Space Complexity : O(n)

linkedIn : www.linkedin.com/in/mukundasv03 
Github : https://github.com/mukunda03
*/


import java.util.Map;
import java.util.HashMap;

class Solution {

    int countPairs(int arr[], int target) {
        // Your code here
        Map<Integer, Integer> freq = new HashMap<>();
        int cnt = 0;
        
        for(int i =0;i< arr.length;i++){
            if(freq.containsKey(target - arr[i])){
                cnt += freq.get(target - arr[i]);
            }
            
            freq.put(arr[i], freq.getOrDefault(arr[i],0)+1);
        }
        return cnt;
    }
}
