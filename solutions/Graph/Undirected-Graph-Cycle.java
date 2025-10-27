/*
Time Complexity :  O(V+E)
Space Complexity : O(V)

linkedIn : www.linkedin.com/in/mukundasv03
Github : https://github.com/mukunda03
*/

class Solution {
    
    static boolean bfs(int start, List<List<Integer>> adj, boolean[] visited){
        
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[] {start, -1});
        visited[start] = true;
        
        while(!q.isEmpty()){
            int[] front = q.poll();
            int node = front[0];
            int parent = front[1];
            
            for(int neighbor : adj.get(node)){
                if(!visited[neighbor]){
                    visited[neighbor] = true;
                    q.offer(new int[] {neighbor, node});
                }
                else if(neighbor != parent){
                    return true;
                }
            }
        }
        return false;
    }
    
    static List<List<Integer>> constructadj(int V, int[][] edges){
        List<List<Integer>> adj = new ArrayList<>();
        
        for(int i = 0; i<V;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] edge : edges){
            int u = edge[0], v = edge[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        return adj;
    }
    
    public boolean isCycle(int V, int[][] edges) {
        // Code here
        List<List<Integer>> adj = constructadj(V,edges);
        boolean[] visited = new boolean[V];
        
        for(int i = 0;i < V;i++){
            if(!visited[i]){
                if(bfs(i,adj,visited)){
                    return true;
                }
            }
        }
        return false;
    }
}
