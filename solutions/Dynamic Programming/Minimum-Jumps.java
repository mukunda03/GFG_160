/*
Time Complexity :  O(n)
Space Complexity : O(1)

linkedIn : www.linkedin.com/in/mukundasv03
Github : https://github.com/mukunda03
*/

class Solution {
    public int minJumps(int[] arr) {
        // code here
        int n = arr.length;
        
        if(arr[0] == 0)
        return -1;
        
        int maxReach = 0;
        int currReach = 0;
        int jump = 0;
        for(int i =0; i <n;i++){
            maxReach = Math.max(maxReach, i+arr[i]);
            
            if(maxReach >= n-1){
                return jump+1;
            }
            
            if(i == currReach){
                
                if(i == maxReach){
                    return -1;
                }else{
                    jump++;
                    currReach = maxReach;
                }
            }
        }
        return -1;
    }
}
