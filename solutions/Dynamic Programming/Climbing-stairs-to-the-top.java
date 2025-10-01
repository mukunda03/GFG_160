/*
Time Complexity :  O(n) 
Space Complexity : O(1)

linkedIn : www.linkedin.com/in/mukundasv03
Github : https://github.com/mukunda03
*/

class Solution {
    int countWays(int n) {
        // your code here
        int prev1 = 1;
        int prev2 = 1;
        
        for(int i =2; i<=n;i++){
            int curr = prev1 + prev2;
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }
}
