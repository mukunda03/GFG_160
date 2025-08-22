/*
Time Complexity :  O(n!)
Space Complexity : O(n)

linkedIn : www.linkedin.com/in/mukundasv03
Github : https://github.com/mukunda03
*/

// User function Template for Java

class Solution {
    
            static void nQueenUtil(int j, int n , ArrayList<Integer> board, boolean[] rows, boolean[] diag1, boolean[] diag2, ArrayList<ArrayList<Integer>> res){
            if(j>n){
                res.add(new ArrayList<>(board));
                return;
            }    
            
            for(int i =1; i<=n; ++i){
                if(!rows[i] && !diag1[i+j] && !diag2[i-j+n]){
                    rows[i] = diag1[i+j] = diag2[i-j+n] = true;
                    board.add(i);
                    
                    nQueenUtil(j+1,n, board, rows, diag1, diag2, res);
                    
                    board.remove(board.size() -1);
                    rows[i] = diag1[i+j] = diag2[i-j+n] = false;
                }
            }
        }
  
    
    public ArrayList<ArrayList<Integer>> nQueen(int n) {
        // code here
        
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        ArrayList<Integer> board = new  ArrayList<>();
        
        boolean[] rows = new boolean[n+1];
        
        boolean[] diag1 = new boolean[2*n+1];
        boolean[] diag2 = new boolean[2*n+1];
        
        nQueenUtil(1,n, board, rows, diag1, diag2, res);
        return res;
    }
}
