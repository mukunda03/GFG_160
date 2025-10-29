/*
Time Complexity :  O(V+E)
Space Complexity : O(V)

linkedIn : www.linkedin.com/in/mukundasv03
Github : https://github.com/mukunda03
*/

class Solution {
    public ArrayList<Integer> topoSort(int V, int[][] edges) {
        // code here
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i =0; i<V;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] edge : edges){
            adj.get(edge[0]).add(edge[1]);
        }
        
        int[] indegree = new int[V];
        for(int i =0;i<V;i++){
            for(int neighbor : adj.get(i)){
                indegree[neighbor]++;
            }
        }
        
        Queue<Integer> q = new LinkedList<>();
        for(int i =0; i<V;i++){
            if(indegree[i] == 0){
                q.offer(i);
            }
        }
        
        ArrayList<Integer> topo = new ArrayList<>();
        
        while(!q.isEmpty()){
            int node = q.poll();
            topo.add(node);
            
            for(int neighbor : adj.get(node)){
                indegree[neighbor]--;
                if(indegree[neighbor] == 0){
                    q.offer(neighbor);
                }
            }
        }
        return topo;
    }
}
