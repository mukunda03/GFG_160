/* 
Time compilcity : O(n)
space complicity : O(1)

 LinkedIn : www.linkedin.com/in/mukundasv03
 Github : https://github.com/mukunda03
  */

class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int flar=-1;
        int slar = -1;
        for(int i =0;i<arr.length;i++){
            if(arr[i] > slar && arr[i] <flar ){
               slar = arr[i];
            }else if(arr[i]>flar){
                slar = flar;
                flar = arr[i];
            }
        }
        return slar;
        
    }
}
