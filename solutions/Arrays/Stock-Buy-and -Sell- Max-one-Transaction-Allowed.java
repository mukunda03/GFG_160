/*
Time Complexity : O(n)
Space Complexity : O(1)

linkedIn : www.linkedin.com/in/mukundasv03 
Github : https://github.com/mukunda03
*/

class Solution {
    public int maximumProfit(int prices[]) {
        // Code here
        int n= prices.length;
        int res = 0;
        int min = prices[0];
        
        for(int i= 0;i<n;i++){
            min = Math.min(min, prices[i]);
            res = Math.max(res, prices[i] - min);
        }
        return res;
    }
}
