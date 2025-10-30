/*
Time Complexity :  O(V+E)
Space Complexity : O(V)

linkedIn : www.linkedin.com/in/mukundasv03
Github : https://github.com/mukunda03
*/

class Solution {
    
    static void dfs(int u, int parent, boolean[] vis, int[] disc, int[] low, ArrayList<ArrayList<Integer>> adj, int[] timer, boolean[] isArticulation){
        vis[u] = true;
        disc[u] = low[u] = ++timer[0];
        int childCount =0;
        
        for(int v : adj.get(u)){
            if(v == parent) continue;
            
            if(!vis[v]){
                childCount++;
                dfs(v,u,vis,disc,low,adj,timer,isArticulation);
                
                low[u] = Math.min(low[u], low[v]);
                
                if(parent != -1 && low[v] >= disc[u]){
                    isArticulation[u] = true;
                }
            }else{
                low[u] = Math.min(low[u], disc[v]);
            }
        }
        if(parent == -1 && childCount > 1)
        isArticulation[u] = true;
    }
    
    static ArrayList<Integer> articulationPoints(int V, int[][] edges) {
        // code here
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        
        for(int i =0; i < V;i++) adj.add(new ArrayList<>());
        
        for(int[]e : edges){
            adj.get(e[0]).add(e[1]);
            adj.get(e[1]).add(e[0]);
        }
        
        int[] disc = new int[V];
        int[] low = new int[V];
        boolean[] vis =new boolean[V];
        boolean[] isArticulation = new boolean[V];
        int[] timer = {0};
        
        for(int i =0; i <V;i++){
            if(!vis[i]){
                dfs(i, -1, vis, disc, low, adj, timer, isArticulation);
            }
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i =0; i < V;i++){
            if(isArticulation[i]) ans.add(i);
        }
        
        if(ans.size() == 0) ans.add(-1);
        return ans;
    }
}
