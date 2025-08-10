/*
Time Complexity : O(n)
Space Complexity : O(1)

linkedIn : www.linkedin.com/in/mukundasv03
Github : https://github.com/mukunda03
*/


class Node {
    int data;
    Node next;
    Node(int value) {
        this.value = value;
    }
}


class Solution {
    Node reverseList(Node head) {
        // code here
        Node curr = head, prev = null, next;
        
        while(curr != null){
            next = curr.next;
            
            curr.next = prev;
            
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
