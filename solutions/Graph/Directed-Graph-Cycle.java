/*
Time Complexity :  O(V+E)
Space Complexity : O(V)

linkedIn : www.linkedin.com/in/mukundasv03
Github : https://github.com/mukunda03
*/

class Solution {
    public boolean isCyclic(int V, int[][] edges) {
        // code here
        @SuppressWarnings("unchecked")
        List<Integer>[] adj = (List<Integer>[]) new ArrayList[V];
        for(int i =0; i< V;i++) adj[i] = new ArrayList<>();
        for(int[] edge : edges) adj[edge[0]].add(edge[1]);
        
        int[] inDegree = new int[V];
        for(int u = 0; u <V; u++){
            for(int v : adj[u]){
                inDegree[v]++;
            }
        }
        
        Queue<Integer> q = new LinkedList<>();
        
        for(int i =0; i <V; i++){
            if(inDegree[i] == 0) q.offer(i);
        }
        
        int count = 0;
        while(!q.isEmpty()){
            int node = q.poll();
            count++;
            for(int nbr : adj[node]){
                inDegree[nbr]--;
                if(inDegree[nbr] == 0) q.offer(nbr);
            }
        }
        return count != V;
    }
}
