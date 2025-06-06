
/*
Boyer-Moore’s Voting Algorithm
Time Complexity : O(n)
Space Complexity : O(1)

linkedIn : www.linkedin.com/in/mukundasv03 
Github : https://github.com/mukunda03

*/

class Solution2 {
    // Function to find the majority elements in the array
    public List<Integer> findMajority(int[] nums) {
        // Your code goes here.
        int n = nums.length;
        int cand1 =-1;
        int cand2 = -1;
        
        int cnt1=0;
        int cnt2 = 0;
        
        for(int cand:nums){
            if(cand1 == cand){
                cnt1++;
            }else if(cand2 == cand){
                cnt2++;
            }else if(cnt1 == 0){
                cand1 = cand;
                cnt1++;
            }else if(cnt2 == 0){
                cand2 = cand;
                cnt2++;
            }else{
                cnt1--;
                cnt2--;
            }
        }
        
        List<Integer> res = new ArrayList<>();
        cnt1=0;
        cnt2=0;
        
        for(int cand:nums){
            if(cand1 == cand){
                cnt1++;
            }
            if(cand2 == cand){
                cnt2++;
            }
        }
        if(cnt1 > n/3){
            res.add(cand1);
        }
        if(cnt2 > n/3 && cand1 != cand2){
            res.add(cand2);
        }
        if(res.size() == 2 && res.get(0) > res.get(1)){
            int temp = res.get(0);
            res.set(0,res.get(1));
            res.set(1,temp);
        }
        return res;
    }
}



/*
Brute Force  approch
Time Complicity = O(n^2)
Space Complicity = O(1)
*/
class Solution {
    // Function to find the majority elements in the array
    public List<Integer> findMajority(int[] arr) {
        // Your code goes here.
        int n = arr.length;
        List<Integer> arr1 = new ArrayList<>();
        for(int i =0;i<n-1;i++){
            int count = 0;
            for(int j =0;j<n-1;j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count > n/3 && !arr1.contains(arr[i])){
             arr1.add(arr[i]);
            }
        }
        
        
        if(arr1.size() == 2 && arr1.get(0) > arr1.get(1)){
            int temp = arr1.get(0);
            arr1.set(0,arr1.get(1));
            arr1.set(1,temp);
        }
        return arr1;
    }
}
