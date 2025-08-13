/*
Time Complexity : O(n)
Space Complexity : O(1)

linkedIn : www.linkedin.com/in/mukundasv03
Github : https://github.com/mukunda03
*/

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

class Solution {
    public static Node reverseKGroup(Node head, int k) {
        // code here
        if(head == null || k<= 1) return head;
        
        Node dummy = new Node(0);
        dummy.next = head;
        
        Node groupPrev = dummy;
        Node curr = head;
        
        while( curr != null){
            Node last = curr;
            Node prev = null;
            int cnt =0;
            
            while(cnt < k && curr != null){
                Node next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
                cnt++;
            }
            groupPrev.next = prev;
            last.next = curr;
            groupPrev = last;
        }
        return dummy.next;
    }
}
