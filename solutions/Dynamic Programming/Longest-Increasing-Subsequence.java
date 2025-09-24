/*
Time Complexity :  O(n Log n) 
Space Complexity : O(n)

linkedIn : www.linkedin.com/in/mukundasv03
Github : https://github.com/mukunda03
*/
class Solution {
    static int lis(int arr[]) {
        // code here
        ArrayList<Integer> temp = new ArrayList<>();
        
        for(int num : arr){
            int idx = Collections.binarySearch(temp,num);
            
            if(idx<0) idx = -(idx+1);
            
            if(idx == temp.size()){
                temp.add(num);
            }else{
                temp.set(idx, num);
            }
        }
        return temp.size();
    }
}
