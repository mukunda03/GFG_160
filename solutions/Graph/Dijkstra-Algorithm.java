/*
Time Complexity :  O((V+E) log V)
Space Complexity : O(V+E)

linkedIn : www.linkedin.com/in/mukundasv03
Github : https://github.com/mukunda03
*/

class Solution {
    public int[] dijkstra(int V, int[][] edges, int src) {
        // code here
        List<List<int[]>> adj = new ArrayList<>();
        for(int i =0; i < V; i++){
            adj.add(new ArrayList<>());
        }
        
        for(int[] e : edges){
            int u = e[0], v = e[1], w = e[2];
            adj.get(u).add(new int[]{v,w});
        }
        
        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;
        
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[0] - b[0]);
        pq.offer(new int[]{0,src});
        
        while(!pq.isEmpty()){
            int[] curr = pq.poll();
            int d = curr[0];
            int u = curr[1];
            
            if(d > dist[u]) continue;
            
            for(int[] edge : adj.get(u)){
                int v = edge[0];
                int w = edge[1];
                
                if(dist[v] > dist[u] + w){
                    dist[v] = dist[u] + w;
                    pq.offer(new int[]{dist[v],v});
                }
            }
        }
        return dist;
    }
}
