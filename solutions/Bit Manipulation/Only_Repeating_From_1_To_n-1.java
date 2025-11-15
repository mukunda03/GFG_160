/*
Time Complexity :  O(n)
Space Complexity : O(1)

linkedIn : www.linkedin.com/in/mukundasv03
Github : https://github.com/mukunda03
*/

// User function Template for Java
class Solution {
    public int findDuplicate(int[] arr) {
        // code here
        int n = arr.length;
        
        long sum = 0;
        for(int num : arr){
            sum += num;
        }
        long expectedSum = (long)(n-1)*(n-1+1)/2;
        
        return (int)(sum - expectedSum);
    }
}
