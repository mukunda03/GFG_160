/*
Time Complexity :  O(n * log m)
Space Complexity : O(n * log m)

linkedIn : www.linkedin.com/in/mukundasv03
Github : https://github.com/mukunda03
*/

// User function Template for Java

class Solution {
    public int maxXor(int[] arr) {
        // code here
        int res = 0, mask = 0;
        
        HashSet<Integer> s = new HashSet<>();
        
        for(int i = 30; i >= 0; i--){
            mask |= (1 << i);
            for(int value : arr){
                s.add(value & mask);
            }
            int cur = res | (1 << i);
            
            for(int prefix : s){
                if(s.contains(cur^prefix)){
                    res = cur;
                    break;
                }
            }
            s.clear();
        }
        return res;
    }
}
