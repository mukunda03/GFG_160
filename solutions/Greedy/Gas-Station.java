/*
Time Complexity :  O(n)
Space Complexity : O(1)

linkedIn : www.linkedin.com/in/mukundasv03
Github : https://github.com/mukunda03
*/

class Solution {
    public int startStation(int[] gas, int[] cost) {
        // code here
        int n = gas.length;
        int startIdx = 0;
        
        int currGas = 0;
        
        for(int i =0; i < n;i++){
            currGas = currGas + gas[i] - cost[i];
            
            if(currGas < 0){
                startIdx = i+1;
                currGas = 0;
            }
        }
        
        currGas = 0;
        
        for(int i =0; i <n;i++){
            int idx = (i+ startIdx) % n;
            currGas = currGas + gas[idx] - cost[idx];
            if(currGas < 0)
            return -1;
        }
        return startIdx;
    }
}
