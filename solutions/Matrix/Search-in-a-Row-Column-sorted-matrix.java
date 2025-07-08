/*
Time Complexity : O(n + m)
Space Complexity : O(1)

linkedIn : www.linkedin.com/in/mukundasv03 
Github : https://github.com/mukunda03
*/

class Solution {
    public static boolean matSearch(int mat[][], int x) {
        // your code here
        int n = mat.length, m=mat[0].length;
        int i =0, j= m-1;
        
        while(i<n && j >=0){
          if(x > mat[i][j]){
              i++;
          }else if(x < mat[i][j]){
              j--;
          }else{
              return true;
          }
        } 
        return false;
    }
}
