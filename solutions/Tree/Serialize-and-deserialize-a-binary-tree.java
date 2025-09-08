/*
Time Complexity :  O(n)
Space Complexity : O(n)

linkedIn : www.linkedin.com/in/mukundasv03
Github : https://github.com/mukunda03
*/

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class Solution {
    public ArrayList<Integer> serialize(Node root) {
        // code here
        ArrayList<Integer> arr = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty()){
            Node curr = q.poll();
            
            if(curr == null){
                arr.add(-1);
                continue;
            }
            arr.add(curr.data);
            q.add(curr.left);
            q.add(curr.right);
        }
        return arr;
    }

    public Node deSerialize(ArrayList<Integer> arr) {
        // code here
        if(arr.get(0) == -1) return null;
        
        Node root = new Node(arr.get(0));
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        
        int i =1;
        while(!q.isEmpty()){
            Node curr = q.poll();
            
            if(arr.get(i) != -1){
                Node left = new Node(arr.get(i));
                curr.left = left;
                q.add(left);
            }
            i++;
            
            if(arr.get(i) != -1){
                Node right = new Node(arr.get(i));
                curr.right = right;
                q.add(right);
            }
            i++;
        }
        return root;
    }
}
