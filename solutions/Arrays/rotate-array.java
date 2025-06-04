/*
Reversal Algorithm  

Time Complexity : O(n)
Space Complexity : O(1)

linkedIn : www.linkedin.com/in/mukundasv03 
Github : https://github.com/mukunda03

*/

class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {
        // add your code here\
      int n = arr.length;
       d %= n; 
       reverse(arr, 0 , d-1);
       reverse(arr, d, n-1);
       reverse(arr,0,n-1);
    }
    
    static void reverse(int [] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
