/*
Time Complexity : O(n)
Space Complexity : O(1)

linkedIn : www.linkedin.com/in/mukundasv03
Github : https://github.com/mukunda03
*/

class Solution {
    // Function to find equilibrium point in the array.
    public static int findEquilibrium(int arr[]) {
        // code here
        int prefSum =0, total = 0;
        
        for(int ele : arr){
            total += ele;
        }
        
        for(int pivot =0; pivot < arr.length; pivot++){
            int suffSum = total - prefSum - arr[pivot];
            if(prefSum == suffSum){
                return pivot;
            }
            prefSum += arr[pivot];
        }
        return -1;
    }
}
