/*
Time Complexity : O(m*n)
Space Complexity : O(1)   O(m)

linkedIn : www.linkedin.com/in/mukundasv03 
Github : https://github.com/mukunda03
*/


class Solution {
    // Function to merge the arrays.
    public void mergeArrays(int a[], int b[]) {
        // code here
        for(int i = b.length-1;i>=0;i--){
            if(a[a.length -1] > b[i]){
                int last = a[a.length-1];
                int j = a.length -2;
                while(j>=0 && a[j] > b[i]){
                    a[j+1] = a[j];
                    j--;
                }
                a[j+1] = b[i];
                b[i] = last;
            }
        }
    }
}
