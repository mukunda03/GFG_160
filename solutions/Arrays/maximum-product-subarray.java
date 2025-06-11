/*

Time Complexity : O(n)
Space Complexity : O(1)

linkedIn : www.linkedin.com/in/mukundasv03 
Github : https://github.com/mukunda03

*/

class Solution {
    int maxProduct(int[] arr) {
        // code here
        int n = arr.length;
        
        int maxProd =   Integer.MIN_VALUE;
        
        int leftToright = 1;
        int rightToleft = 1;
        
        for(int i =0;i<n;i++){
            if(leftToright == 0)
            leftToright = 1;
            if(rightToleft == 0)
            rightToleft =1;
            
            leftToright *= arr[i];
            
            int j = n-i-1;
            rightToleft *= arr[j];
            maxProd = Math.max(leftToright,Math.max(rightToleft,maxProd));
        }
        return maxProd;
    }
}
