/*
Time Complexity :  O(n^2*log(n))
Space Complexity : O(n^2)

linkedIn : www.linkedin.com/in/mukundasv03
Github : https://github.com/mukunda03
*/



class Solution {
    
    static int manhattanDistance(int[] a, int[] b){
        return Math.abs(a[0] - b[0]) + Math.abs(a[1] - b[1]); 
    }
    
    public int minCost(int[][] houses) {
        // code here
        int n = houses.length;
        
        PriorityQueue<int[]> minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        
        boolean[] visited = new boolean[n];
        
        minHeap.offer(new int[]{0,0});
        
        int totalcost = 0;
        
        while(!minHeap.isEmpty()){
            int[] curr = minHeap.poll();
            int cost = curr[0];
            int u = curr[1];
            
            if(visited[u]) continue;
            
            visited[u] = true;
            totalcost += cost;
            
            for(int v = 0 ; v < n; v++){
                if(!visited[v]){
                    int dist = manhattanDistance(houses[u], houses[v]);
                    minHeap.offer(new int[]{dist,v});
                }
            }
        }
        return totalcost;
    }
}
