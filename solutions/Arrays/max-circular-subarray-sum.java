/*
Time Complexity : O(n)
Space Complexity : O(1)

linkedIn : www.linkedin.com/in/mukundasv03 
Github : https://github.com/mukunda03
*/

class Solution {
    public int circularSubarraySum(int arr[]) {
        // code here
        int totalSum = 0;
        int curMaxSum = 0, curMinSum = 0;
        int maxSum = arr[0], minSum = arr[0];
        
        for(int i =0;i<arr.length;i++){
            curMaxSum = Math.max(curMaxSum+arr[i], arr[i]);
            maxSum = Math.max(maxSum, curMaxSum);
            
            curMinSum = Math.min(curMinSum+arr[i], arr[i]);
            minSum = Math.min(minSum, curMinSum);
            
            totalSum += arr[i];
        }
        int normalSum = maxSum;
        int cirSum = totalSum - minSum;
        
        if(minSum == totalSum)
        return normalSum;
        
        return Math.max(normalSum, cirSum);
        
    }
}
