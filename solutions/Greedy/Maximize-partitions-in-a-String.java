/*
Time Complexity :  O(n)
Space Complexity : O(1)

linkedIn : www.linkedin.com/in/mukundasv03
Github : https://github.com/mukunda03
*/

class Solution {
    public int maxPartitions(String s) {
        // code here
        int[] last = new int[26];
        
        for(int i =0; i< last.length;i++){
            last[i] = -1;
        }
        
        for(int i =0; i< s.length() ; i++){
            last[s.charAt(i) - 'a'] = i;
        }
        
        int cnt = 0;
        int a = -1;
        
        for(int i =0; i< s.length(); i++){
            a = Math.max(last[s.charAt(i) -'a'], a);
            
            if(a == i)
            cnt++;
        }
        return cnt;
    }
}
