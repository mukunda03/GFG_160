/*
Time Complexity :  O(n)
Space Complexity : O(1)

linkedIn : www.linkedin.com/in/mukundasv03
Github : https://github.com/mukunda03
*/
class Solution {
    public int findMaxSum(int arr[]) {
        // code here
        int n = arr.length;
        
        if(n==0)
        return 0;
        if(n==1)
        return arr[0];
        
        int secondLast = 0, last = arr[0];
        
        int res = 0;
        for(int i = 1; i<n;i++){
            res = Math.max(arr[i] + secondLast, last);
            secondLast = last;
            last = res;
        }
        return res;
    }
}
