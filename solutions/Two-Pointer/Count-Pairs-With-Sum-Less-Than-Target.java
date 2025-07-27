/*
Time Complexity :O(n*logn+n)
Space Complexity : O(1)

linkedIn : www.linkedin.com/in/mukundasv03
Github : https://github.com/mukunda03
*/

// User function Template for Java
import java.util.*;

class Solution {
    int countPairs(int arr[], int target) {
        // Your code here
        Arrays.sort(arr);
        int left =0, right=arr.length-1;
        int cnt = 0;
        
        while(left <right){
            int sum = arr[left] + arr[right];
            
            if(sum < target){
                cnt += right -left;
                left++;
            }else{
                right--;
            }
        }
        return cnt;
    }
}
