/*
Time Complexity : O(n)
Space Complexity : O(n)

linkedIn : www.linkedin.com/in/mukundasv03
Github : https://github.com/mukunda03
*/

class Solution {
    public int maxLen(int[] arr) {
        // Your code here
        HashMap<Integer, Integer> mp = new HashMap<>();
        
        int preSum = 0;
        int res = 0;
        
        for(int i =0;i<arr.length;i++){
            preSum +=  (arr[i] == 0)?-1 : 1;
            
            if(preSum == 0)
            res = i+1;
            
            if(mp.containsKey(preSum))
            res = Math.max(res,i-mp.get(preSum));
            
            else
            mp.put(preSum,i);
        }
        return res;
    }
}
