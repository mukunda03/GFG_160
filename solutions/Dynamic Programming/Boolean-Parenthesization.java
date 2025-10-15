/*
Time Complexity :  O(n^3)
Space Complexity : O(n^2)

linkedIn : www.linkedin.com/in/mukundasv03
Github : https://github.com/mukunda03
*/

class Solution {
    
    static boolean evaluate(int b1, int b2, char op){
        if(op == '&'){
            return (b1 & b2) == 1;
        }
        else if(op == '|'){
            return (b1 | b2) == 1;
        }
        return (b1 ^ b2) == 1;
    }
    
    static int countRecur(int i,int j, int req, String s, int[][][] memo){
        if(i == j){
            return(req == (s.charAt(i) == 'T' ? 1 : 0))
            ? 1
            : 0;
        }
        
        if(memo[i][j][req] != -1){
            return memo[i][j][req];
        }
        int ans = 0;
        for(int k =i +1; k <j; k+=2){
            int leftTrue = countRecur(i,k-1,1,s,memo);
            int leftFalse = countRecur(i,k-1,0,s, memo);
            
            int rightTrue = countRecur(k+1,j,1,s,memo);
            int rightFalse = countRecur(k+1, j,0,s,memo);
            
            if(evaluate(1,1,s.charAt(k)) == (req ==1)){
                ans += leftTrue * rightTrue;
            }
            
            if(evaluate(1,0,s.charAt(k)) == (req ==1)){
                ans +=leftTrue*rightFalse;
            }
            
            if(evaluate(0,1,s.charAt(k)) == (req ==1)){
                ans += leftFalse* rightTrue;
            }
            
            if(evaluate(0,0,s.charAt(k)) == (req ==1)){
                ans += leftFalse*rightFalse;
            }
        }
        return memo[i][j][req] = ans;
    }
    
    static int countWays(String s) {
        // code here
        int n = s.length();
        int[][][] memo = new int[n][n][2];
        for(int[][] mat : memo){
            for(int[] row : mat){
                Arrays.fill(row, -1);
            }
        }
        return countRecur(0, n-1,1,s,memo);
    }
}
