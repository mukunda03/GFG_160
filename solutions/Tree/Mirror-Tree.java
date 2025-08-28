/*
Time Complexity :  O(n)
Space Complexity : O(h)

linkedIn : www.linkedin.com/in/mukundasv03
Github : https://github.com/mukunda03
*/


class Node
{
    int data;
    Node left, right;
   Node(int item)
   {
        data = item;
        left = right = null;
    }
} 

class Solution {
    void mirror(Node node) {
        // code here
        if(node == null)
        return ;
        
        mirror(node.left);
        mirror(node.right);
        
        
        Node temp = node.left;
        node.left = node.right;
        node.right = temp;
        
    }
}
