/*
Time Complexity :  O(n)
Space Complexity : O(1)

linkedIn : www.linkedin.com/in/mukundasv03
Github : https://github.com/mukunda03
*/

class Solution {
    int maxValueTab(int x, int y, int[] arr) {
        // code here
        int n = arr.length;
        int prev2 = arr[x];
        
        int prev1 = Math.max(arr[x], arr[x+1]);
        
        for(int j=x+2; j <= y; j++){
            int take = arr[j] + prev2;
            int noTake = prev1;
            
            int curr = Math.max(take, noTake);
            
            prev2 =prev1;
            prev1 = curr;
        }
        return prev1;
    }
    
    int maxValue(int[] arr){
        int n = arr.length;
        
        if(n ==0) return 0;
        if(n==1) return arr[0];
        
        int ans =0;
        
        ans = Math.max(ans, maxValueTab(0, n-2, arr));
        
        ans = Math.max(ans, maxValueTab(1, n-1, arr));
        
        return ans;
        
    }
    
}
