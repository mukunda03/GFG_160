/*
Time Complexity : O(nlogn)
Space Complexity : O(1)  

linkedIn : www.linkedin.com/in/mukundasv03 
Github : https://github.com/mukunda03
*/

// User function Template for Java

class Solution {
    int search(int[] arr, int key) {
        // Complete this function
        int lo =0,hi = arr.length-1;
        
        while(lo <= hi){
            int mid = lo+(hi -lo)/2;
            if(arr[mid] == key)
            return mid;
            
            if(arr[mid] >= arr[lo]){
                if(key >= arr[lo] && key < arr[mid])
                hi = mid -1;
                else 
                lo = mid +1;
            }else{
                if(key > arr[mid] && key <= arr[hi])
                lo = mid +1;
                else
                hi = mid -1;
            }
        }
        return -1;
    }
}
