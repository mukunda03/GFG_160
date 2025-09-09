/*
Time Complexity :  O(n * log k)
Space Complexity : O(k)

linkedIn : www.linkedin.com/in/mukundasv03
Github : https://github.com/mukunda03
*/

class Solution {
    public ArrayList<Integer> kLargest(int[] arr, int k) {
        // Your code here
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(k);
        
        for(int i =0; i<k; i++){
            minHeap.add(arr[i]);
        }
        
        for(int i = k;i<arr.length;i++){
            if(arr[i] > minHeap.peek()){
                minHeap.poll();
                minHeap.add(arr[i]);
            }
        }
        
        ArrayList<Integer> res = new ArrayList<>();
        while(!minHeap.isEmpty()){
            res.add(minHeap.poll());
        }
        
        Collections.reverse(res);
        return res;
    }
}
