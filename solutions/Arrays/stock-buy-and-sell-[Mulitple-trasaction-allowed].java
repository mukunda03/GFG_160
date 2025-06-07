// Accumulate Profit Approach
/*
Time Complexity : O(n)
Space Complexity : O(1)

linkedIn : www.linkedin.com/in/mukundasv03 
Github : https://github.com/mukunda03
*/

class Solution2 {
    public int maximumProfit(int prices[]) {
        // code here
        int res =0;
         
        int n = prices.length;
        
        for(int i =0;i<n-1;i++){
            if(prices[i] < prices[i+1]){
                res += (prices[i+1] - prices[i]);
            }
        }
        return res;
    }
}

// Local Maxima and Local Minma Approach
/*
Time Complexity : O(n)
Space Complexity : O(1)
*/

class Solution {
    public int maximumProfit(int prices[]) {
        // code here
        int res =0;
        
        int lmax = prices[0];
        int lmin = prices[0];
        
        int n = prices.length;
        
        int i =0;
        
        while(i<n-1){
            while(i<n-1 && prices[i] >= prices[i+1]){i++;}
            lmin = prices[i];
            
            while(i<n-1 && prices[i]<= prices[i+1]){i++;}
            lmax = prices[i];
            
            
            res += (lmax-lmin);
        }
        return res;
    }
}

