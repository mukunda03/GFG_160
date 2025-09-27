/*
Time Complexity :  O(n^2) 
Space Complexity : O(n)

linkedIn : www.linkedin.com/in/mukundasv03
Github : https://github.com/mukunda03
*/

class Solution {
    public int longestPalinSubseq(String s) {
        // code here
        int n = s.length();
        int[] curr = new int[n];
        int[] prev = new int[n];
        
        for(int i =n-1;i>=0; --i){
            curr[i] =1;
            for(int j =i+1;j<n; ++j){
                if(s.charAt(i) == s.charAt(j)){
                    curr[j] = prev[j-1] +2;
                }else{
                    curr[j] = Math.max(prev[j], curr[j-1]);
                }
            }
            prev = curr.clone();
        }
        return curr[n-1];
    }
}
