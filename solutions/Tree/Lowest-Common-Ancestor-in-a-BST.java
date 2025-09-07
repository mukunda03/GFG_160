/*
Time Complexity :  O(h)
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
    Node LCA(Node root, Node n1, Node n2) {
        // your code here.
        while(root != null){
            if(root.data > n1.data && root.data > n2.data)
            root = root.left;
            
            else if(root.data < n1.data && root.data < n2.data)
            root =root.right;
            
            else
            break;
        }
        return root;
    }
}
