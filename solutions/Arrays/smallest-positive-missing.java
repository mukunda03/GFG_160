/*
Time Complexity : O(n)
Space Complexity : O(1)

linkedIn : www.linkedin.com/in/mukundasv03 
Github : https://github.com/mukunda03
*/
class Solution {
    // Function to find the smallest positive number missing from the array.
    public int missingNumber(int[] arr) {
        // Your code here
        int n = arr.length;
        for(int i =0;i<n;i++){
            while(arr[i] >= 1 && arr[i] <=n && arr[i] != arr[arr[i] -1]){
                int temp = arr[i];
                arr[i] = arr[arr[i] -1];
                arr[temp-1] = temp;
            }
        }
        for(int i =1;i<=n;i++){
            if(i != arr[i-1]){
                return i;
            }
        }
        return n+1;
    }
}
