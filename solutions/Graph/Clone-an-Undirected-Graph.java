/*
Time Complexity :  O(V+E)
Space Complexity : O(V)

linkedIn : www.linkedin.com/in/mukundasv03
Github : https://github.com/mukunda03
*/

class Solution {
    Node cloneGraph(Node node) {
        // code here
        if(node == null) return null;
        
        Map<Node, Node> mp = new HashMap<>();
        Queue<Node> q = new LinkedList<>();
        
        Node clone = new Node(node.val);
        mp.put(node, clone);
        q.offer(node);
        
        while(!q.isEmpty()){
            Node current = q.poll();
            
            for(Node neighbor : current.neighbors){
                if(!mp.containsKey(neighbor)){
                    mp.put(neighbor, new Node(neighbor.val));
                    q.offer(neighbor);
                }
                mp.get(current).neighbors.add(mp.get(neighbor));
            }
        }
        return mp.get(node);
    }
}
