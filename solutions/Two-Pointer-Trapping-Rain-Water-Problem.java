/*
Time Complexity : O(n)
Space Complexity : O(1)

linkedIn : www.linkedin.com/in/mukundasv03
Github : https://github.com/mukunda03
*/

class Solution {
    public int maxWater(int arr[]) {
        // code here
        int left =1;
        int right = arr.length-2;
        
        int lmax = arr[left-1];
        int rmax = arr[right +1];
        
        int res = 0;
        
        while(left <= right){
            
            if(rmax <= lmax){
                res += Math.max(0,rmax-arr[right]);
                rmax = Math.max(rmax,arr[right]);
                right -= 1;
            }else{
                res += Math.max(0,lmax - arr[left]);
                lmax = Math.max(lmax, arr[left]);
                left += 1;
            }
        }
        return res;
    }
}

