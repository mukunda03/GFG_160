/*
Time Complexity : O(n)
Space Complexity : O(1)

linkedIn : www.linkedin.com/in/mukundasv03 
Github : https://github.com/mukunda03
*/


class Solution {
    int maxSubarraySum(int[] arr) {
        // Your code here
        int res = arr[0];
        int maxEnding = arr[0];
        
        for(int i =1;i<arr.length;i++){
            maxEnding = Math.max(maxEnding+arr[i],arr[i]);
        
            res = Math.max(res,maxEnding);
        }
        return res;
    }
}
