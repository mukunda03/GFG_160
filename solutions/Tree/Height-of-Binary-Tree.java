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
    // Function to find the height of a binary tree.
    int height(Node node) {
        // code here
        if(node == null)
        return -1;
        
        int lHeight = height(node.left);
        int rHeight = height(node.right);
        
        return Math.max(lHeight, rHeight)+1;
    }
}
