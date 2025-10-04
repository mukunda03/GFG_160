/*
Time Complexity :  O(sum*n)
Space Complexity : O(sum)

linkedIn : www.linkedin.com/in/mukundasv03
Github : https://github.com/mukunda03
*/

class Solution {
    public int count(int coins[], int sum) {
        // code here.
        int n = coins.length;
        
        int[] dp = new int[sum +1];
        
        dp[0] = 1;
        
        for(int i =0;i<n;i++)
            for(int j = coins[i]; j <= sum; j++)
                dp[j] += dp[j - coins[i]];
        
        return dp[sum];
    }
    
}
