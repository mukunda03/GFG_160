/*
Time Complexity :  O(n * W) 
Space Complexity : O(W)

linkedIn : www.linkedin.com/in/mukundasv03
Github : https://github.com/mukunda03
*/

class Solution {
    static int knapsack(int W, int val[], int wt[]) {
        // code here
        int[] dp = new int[W+1];
        
        for(int i =1; i <= wt.length;i++){
            for(int j = W; j >= wt[i-1]; j--){
                dp[j] = Math.max(dp[j],dp[j- wt[i-1]] + val[i-1]);
            }
        }
        return dp[W];
    }
}
