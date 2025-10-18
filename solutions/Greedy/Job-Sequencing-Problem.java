/*
Time Complexity :  O(n * log(n))
Space Complexity : O(n)

linkedIn : www.linkedin.com/in/mukundasv03
Github : https://github.com/mukunda03
*/

class Solution {
    public ArrayList<Integer> jobSequencing(int[] deadline, int[] profit) {
        // code here
        int n = deadline.length;
        
        ArrayList<Integer> ans = new ArrayList<>(Arrays.asList(0,0));
        List<int[]> jobs = new ArrayList<>();
        
        for(int i=0;i<n;i++){
            jobs.add(new int[]{deadline[i], profit[i]});
        }
        
        jobs.sort(Comparator.comparingInt(a->a[0]));
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int i =0;i< jobs.size();i++){
            int[] job = jobs.get(i);
            
            if(job[0] > pq.size()){
                pq.add(job[1]);
            }
            else if(!pq.isEmpty() && pq.peek() < job[1]){
                pq.poll();
                pq.add(job[1]);
            }
        }
        while(!pq.isEmpty()){
            ans.set(1, ans.get(1) + pq.poll());
            ans.set(0,ans.get(0) + 1);
        }
        return ans;
    }
}
