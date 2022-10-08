//          EXPLANATION
// Well I'm assuming you have done Linked List cycle 1 question. Now let distance from start node to loop starting node( lest's call it result node) be L1 and distance from result node to the node at which slow and fast pointer meets be L2.
// slow dist= L1+L2;
// fast dist= L1+L2+nC;
// Since fast is moving 2x dist than slow it should have covered some extra distance. Here 'C' is the length of the loop and 'n' is a multiplier.

// Also, fast=2(slow) therefore on equating 
// 2(L1+ L2)=L1+L2+nC;
// L1=nC-L2;

// Hence if you move from start to result node and move (nC-L2) distance from node where slow and fast met, you should meet at the result node.

public class Solution {
    
	public ListNode detectCycle(ListNode head) {
        
        if(head==null || head.next==null) return null;
        
        ListNode fast=head;
        ListNode slow=head;
        ListNode entry=head;
        
        while(fast.next!=null && fast.next.next!=null){

        slow=slow.next;
        fast=fast.next.next;
            if(slow==fast){

				while(slow!=entry){

					slow=slow.next;
					entry=entry.next;
				}
					return entry;
            }            
        }        
        return null;
    }
}
