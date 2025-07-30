/*
Time Complexity : O(n^2)
Space Complexity : O(1)

linkedIn : www.linkedin.com/in/mukundasv03
Github : https://github.com/mukunda03
*/

class Solution {
    public int countTriangles(int arr[]) {
        // code here
        int res =0;
        Arrays.sort(arr);
        
        for(int i =2;i<arr.length; ++i){
            int left =0, right = i-1;
            
            while(left <right) {
                if(arr[left]+arr[right] > arr[i]){
                    res+= right -left;
                    right--;
                }else{
                    left++;
                }
            }
        }
        return res;
    }
}
