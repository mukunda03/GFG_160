/*
Time Complexity :  O(k)
Space Complexity : O(h)

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
  
    static int kthSmallestRecur(Node root, int[] cnt, int k){
        if(root == null) return -1;
        
        int left = kthSmallestRecur(root.left, cnt, k);
        
        if(left != -1) return left;
        
        cnt[0]++;
        
        
        if(cnt[0] == k) return root.data;
        
        int right = kthSmallestRecur(root.right, cnt, k);
        return right;
    }
    
    public int kthSmallest(Node root, int k) {
        // Write your code here
        int[] cnt ={0};
        return kthSmallestRecur(root, cnt, k);
    }
}
