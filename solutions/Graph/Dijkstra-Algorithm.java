/*
Time Complexity :  O(E*logV)
Space Complexity : O(V)

linkedIn : www.linkedin.com/in/mukundasv03
Github : https://github.com/mukunda03
*/

class Solution {
    
    static ArrayList<ArrayList<ArrayList<Integer>>> constructAdj(int[][] edges, int V){
        ArrayList<ArrayList<ArrayList<Integer>>> adj = new ArrayList<>();
        
        for(int i =0; i < V;i++){
            adj.add(new ArrayList<>());
        }
        
        for(int [] edge : edges){
            int u = edge[0];
            int v = edge[1];
            int wt = edge[2];
            
            ArrayList<Integer> e1 = new ArrayList<>();
            e1.add(v);
            e1.add(wt);
            adj.get(u).add(e1);
            
            ArrayList<Integer> e2 = new ArrayList<>();
            e2.add(u);
            e2.add(wt);
            adj.get(v).add(e2);
        }
        return adj;
    }
    
    public int[] dijkstra(int V, int[][] edges, int src) {
        // code here
        ArrayList<ArrayList<ArrayList<Integer>>> adj = constructAdj(edges, V);
        
        PriorityQueue<ArrayList<Integer>> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a.get(0)));
        
        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        
        dist[src] = 0;
        ArrayList<Integer> start = new ArrayList<>();
        
        start.add(0);
        start.add(src);
        pq.offer(start);
        
        while(!pq.isEmpty()){
            ArrayList<Integer> curr = pq.poll();
            int d = curr.get(0);
            int u = curr.get(1);
            
            for(ArrayList<Integer> neighbor : adj.get(u)){
                int v = neighbor.get(0);
                int weight = neighbor.get(1);
                
                if(dist[v] > dist[u] + weight){
                    dist[v] = dist[u] + weight;
                    
                    ArrayList<Integer> temp  = new ArrayList<>();
                    temp.add(dist[v]);
                    temp.add(v);
                    pq.offer(temp);
                }
            }
        }
        return dist;
    }
}
