/*
Time Complexity :  O(n log(n))
Space Complexity : O(1)

linkedIn : www.linkedin.com/in/mukundasv03
Github : https://github.com/mukunda03
*/

class Solution {
    public int minPlatform(int arr[], int dep[]) {
        //  code here
        int n = arr.length;
        int res = 0;
        
        Arrays.sort(arr);
        Arrays.sort(dep);
        
        int j = 0;
        int cnt = 0;
        
        for(int i =0; i<n;i++){
            while(j < n && dep[j] < arr[i]){
                cnt--;
                j++;
            }
            cnt++;
            res = Math.max(res, cnt);
        }
        return res;
    }
}
