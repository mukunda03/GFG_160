/*
Time Complexity : O(n)
Space Complexity : O(n)

linkedIn : www.linkedin.com/in/mukundasv03 
Github : https://github.com/mukunda03
*/

// User function Template for Java
class Solution {
    // Function to find hIndex
    public int hIndex(int[] citations) {
        // code here
        int n = citations.length;
        int [] freq = new int[n+1];
        
        for(int i =0;i<n;i++){
            if(citations[i] >= n)
            freq[n] += 1;
            else
            freq[citations[i]] += 1;
        }
        int ind =n;
        int s= freq[n];
        while(s < ind){
            ind--;
            s += freq[ind];
        }
        return ind;
    }
}
