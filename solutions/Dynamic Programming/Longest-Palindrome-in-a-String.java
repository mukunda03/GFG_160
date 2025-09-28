/*
Time Complexity :  O(n) 
Space Complexity : O(n)

linkedIn : www.linkedin.com/in/mukundasv03
Github : https://github.com/mukunda03
*/


class Manacher{
    int[] p;
    String ms;
    
    public Manacher(String s){
        StringBuilder sb = new StringBuilder("@");
        for(char c : s.toCharArray()){
            sb.append("#").append(c);
        }
        sb.append("#$");
        ms = sb.toString();
        runManacher();
    }
    
    private void runManacher(){
        int n = ms.length();
        p = new int[n];
        int l=0, r=0;
        
        for(int i =1;i <n-1 ; ++i){
            int mirror = l+r-i;
            if(mirror >= 0 && mirror < n){
                p[i] = Math.max(0, Math.min(r-i, p[mirror]));
            }else{
                p[i] =0;
            }
            
            while((i+1+p[i]) < n && (i-1-p[i]) >= 0  && ms.charAt(i+1+p[i]) == ms.charAt(i-1-p[i])){
                ++p[i];
            }
           if(i+p[i] > r){
            l = i-p[i];
            r = i +p[i];
            }  
        }
        
    }
    
    public int getLongest(int cen, int odd){
        int pos  = 2 * cen + 2+ (odd == 0 ? 1 : 0);
        return p[pos];
    }
    
    public boolean check(int l, int r){
        int res = getLongest((r+l)/2,(r-l+1)%2);
        return(r-l+1) <= res;
    }
}

class Solution {
    static String longestPalindrome(String s) {
        // code here
        int n = s.length(), maxLen =1, start = 0;
        Manacher M = new Manacher(s);
        
        for(int i =0; i<n; ++i){
            int oddLen = M.getLongest(i,1);
            if(oddLen > maxLen){
                start = i-(oddLen-1) /2;
            }
            
            int evenLen = M.getLongest(i,0);
            if(evenLen > maxLen){
                start = i-(evenLen-1)/2;
            }
            maxLen = Math.max(maxLen, Math.max(oddLen,evenLen));
        }
        return s.substring(start, start+maxLen);
    }
}
