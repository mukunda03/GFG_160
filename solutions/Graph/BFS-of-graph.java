/*
Time Complexity :  O(V + E)
Space Complexity : O(V)

linkedIn : www.linkedin.com/in/mukundasv03
Github : https://github.com/mukunda03
*/
class Solution {
    // Function to return Breadth First Search Traversal of given graph.
    
    static void bfsConnected(ArrayList<ArrayList<Integer>> adj, int src, boolean[] visited, ArrayList<Integer> res){
        Queue<Integer> q = new LinkedList<>();
        visited[src] = true;
        q.add(src);
        
        while(!q.isEmpty()){
            int curr = q.poll();
            res.add(curr);
            for(int x : adj.get(curr)){
                if(!visited[x]){
                    visited[x] = true;
                    q.add(x);
                }
            }
        }
    }
    
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        int V = adj.size();
        boolean[] visited = new boolean[V];
        ArrayList<Integer> res = new ArrayList<>();
        
        for(int i = 0;i < V; i++){
            if(!visited[i])
            bfsConnected(adj, i, visited, res);
        }
        return res;
    }
}
