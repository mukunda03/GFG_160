/*
Time Complexity : O(n) 
Space Complexity : O(1)

linkedIn : www.linkedin.com/in/mukundasv03 
Github : https://github.com/mukunda03
*/

class Solution {
    // Function to sort an array of 0s, 1s, and 2s
    public void sort012(int[] arr) {
        // code here
        int n = arr.length;
        int lo = 0;
        int hi = n-1;
        int mid = 0,temp = 0;
        
        while(mid <= hi){
            if(arr[mid] == 0){
                swap(arr, mid, lo);
                lo++;
                mid++;
            }else if(arr[mid] ==1){
                mid++;
            }else{
                swap(arr,mid,hi);
                hi--;
            }
        }
    }
    
    static void swap(int[] arr, int i , int j ){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] =temp;
    }
    
}
