/*
Time Complexity :  O(n)
Space Complexity : O(h)

linkedIn : www.linkedin.com/in/mukundasv03
Github : https://github.com/mukunda03
*/

class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}

class Solution {
    // Function to return maximum path sum from any node in a tree.
    
    static int maxPathSumUtil(Node node, int[] res){
        if(node == null) return 0;
        
        int l = Math.max(0, maxPathSumUtil(node.left, res));
        int r = Math.max(0, maxPathSumUtil(node.right, res));
        
        res[0] = Math.max(res[0],l+r+node.data);
        
        return node.data + Math.max(l,r);
    }
    
    int findMaxSum(Node node) {
        // your code goes here
        int[] res = {node.data};
        
        maxPathSumUtil(node, res);
        
        return res[0];
    }
}
