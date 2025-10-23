/*
Time Complexity :  O(V + E)
Space Complexity : O(V + E)

linkedIn : www.linkedin.com/in/mukundasv03
Github : https://github.com/mukunda03
*/

class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    
    private static void dfsRec(ArrayList<ArrayList<Integer>> adj, boolean[] visited, int s, ArrayList<Integer> res){
        visited[s] = true;
        res.add(s);
        
        for(int i : adj.get(s)){
            if(!visited[i]){
                dfsRec(adj, visited, i, res);
            }
        }
    }
    
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // Code here
        boolean[] visited = new boolean[adj.size()];
        ArrayList<Integer> res =  new ArrayList<>();
        
        for(int i =0;i<adj.size(); i++){
            if(!visited[i]){
                dfsRec(adj, visited, i, res);
            }
        }
        return res;
    }
}
