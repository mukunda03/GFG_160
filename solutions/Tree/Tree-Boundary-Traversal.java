/*
Time Complexity :  O(n)
Space Complexity : O(1)

linkedIn : www.linkedin.com/in/mukundasv03
Github : https://github.com/mukunda03
*/

class Node
{
    int data;
    Node left, right;

    public Node(int d)
    {
        data = d;
        left = right = null;
    }
}

class Solution {
    
    static void collectLeaves(Node node, ArrayList<Integer> res){
        Node current = node;
        
        while(current != null){
            
            if(current.left == null){
                
                if(current.right == null)
                res.add(current.data);
                
                current = current.right;
                
            }else{
                Node predecessor = current.left;
                
                while(predecessor.right != null && predecessor.right != current){
                    predecessor = predecessor.right;
                }
                
                if(predecessor.right == null){
                    predecessor.right = current;
                    current = current.left;
                }else{
                    if(predecessor.left == null)
                    res.add(predecessor.data);
                    
                    predecessor.right = null;
                    current = current.right;
                }
            }
        }
    }
    
    static boolean isLeaf(Node node){
        return node.left == null && node.right == null;
    }
    
    static void collectBoundaryLeft(Node node, ArrayList<Integer> res){
        if(node == null)
        return;
        
        Node curr = node;
        while(!isLeaf(curr)){
            res.add(curr.data);
            
            if(curr.left != null)
            curr = curr.left;
            else
            curr =curr.right;
        }
    }
    
    static void collectBoundaryRight(Node node, ArrayList<Integer> res){
        if(node == null)
        return;
        
        Node curr = node;
        ArrayList<Integer> temp = new ArrayList<>();
        
        while(!isLeaf(curr)){
            temp.add(curr.data);
            
            if(curr.right != null)
            curr = curr.right;
            else
            curr = curr.left;
        }
        
        for(int i = temp.size()-1;i>=0;--i)
        res.add(temp.get(i));
    }
    
    ArrayList<Integer> boundaryTraversal(Node node) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        
        if(node == null)
        return res;
        
        if(!isLeaf(node))
        res.add(node.data);
        
        collectBoundaryLeft(node.left, res);
        
        collectLeaves(node, res);
        
        collectBoundaryRight(node.right, res);
        
        return res;
    }
}
