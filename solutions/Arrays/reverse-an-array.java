/*
Time Complexity : O(n)
Space Complexity : O(1)

linkedIn : www.linkedin.com/in/mukundasv03 
Github : https://github.com/mukunda03
*/


class Solution {
    public void reverseArray(int arr[]) {
        // code here
       for(int i =0;i<arr.length/2;i++){
           int temp = arr[i];
           arr[i] = arr[arr.length-1-i];
           arr[arr.length-1-i] = temp;
       }
    }
}
