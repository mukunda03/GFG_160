/*
Time Complexity :  O(n)
Space Complexity : O(n)

linkedIn : www.linkedin.com/in/mukundasv03
Github : https://github.com/mukunda03
*/

class Node {
    int data;
    Node left, right;

    public Node(int d) {
        data = d;
        left = right = null;
    }
}

class Solution {
    
    static boolean dfs(Node root, HashSet<Integer> set, int target){
        if(root == null) return false;
        
        if(set.contains(target - root.data)) return true;
        
        set.add(root.data);
        
        return dfs(root.left, set, target) || dfs(root.right,set,target);
    }
    
    boolean findTarget(Node root, int target) {
        // Write your code here
        HashSet<Integer> set = new HashSet<>();
        
        return dfs(root, set, target);
        
    }
}
