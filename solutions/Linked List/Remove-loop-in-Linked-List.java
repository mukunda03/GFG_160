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
}

class Solution {
    public static void removeLoop(Node head) {
        // code here
        if(head == null || head.next == null)
        return;
        
        Node slow = head, fast = head;
        
        slow = slow.next;
        fast = fast.next.next;
        
        while(fast != null && fast.next != null){
            if(slow == fast)
            break;
            
            slow = slow.next;
            fast = fast.next.next;
            
            
            if(slow == fast){
                slow = head;
                
                if(slow != fast){
                    while(slow.next != fast.next){
                        slow =slow.next;
                        fast = fast.next;
                    }
                    fast.next = null;
                }else{
                    while(fast.next != slow){
                        fast = fast.next;
                    }
                    fast.next = null;
                }
            }
        }
    }
}
