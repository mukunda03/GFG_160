/*
Time Complexity :  O(n)
Space Complexity : O(h)

linkedIn : www.linkedin.com/in/mukundasv03
Github : https://github.com/mukunda03
*/

class Node {
    int data;
    Node left, right;

    Node(int key) {
        data = key;
        left = right = null;
    }
}

class Solution {
    
    static Node buildTreeRecur(Map<Integer, Integer> mp, int[] preorder, int[] preIndex, int left, int right){
        
        if(left > right)
        return null;
        
        int rootVal = preorder[preIndex[0]];
        preIndex[0]++;
        
        Node root = new Node(rootVal);
        
        int index = mp.get(rootVal);
        
        root.left = buildTreeRecur(mp, preorder, preIndex, left, index-1);
        root.right = buildTreeRecur(mp, preorder, preIndex, index+1, right);
        return root;
    }
    
    public static Node buildTree(int inorder[], int preorder[]) {
        // code here
        Map<Integer, Integer> mp = new HashMap<>();
        
        for(int i =0;i<inorder.length;i++)
        mp.put(inorder[i],i);
        
        int[] preIndex ={0};
        return buildTreeRecur(mp,preorder,preIndex,0,inorder.length-1);
    }
}
