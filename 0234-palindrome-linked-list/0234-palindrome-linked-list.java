/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    
    public ListNode middle(ListNode head){
        ListNode slow=head, fast=head;
        
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        
        return slow;
    }
   
    public ListNode reverse(ListNode mid){
        ListNode cur=mid, prev=null;
        while(cur!=null){
            ListNode temp=cur.next;
            cur.next=prev;
            prev=cur;
            cur=temp;
        }
        return prev;
    }
    
    public boolean isPalindrome(ListNode head) {
        
        if(head==null || head.next==null) return true;
        
        ListNode mid=middle(head), last=reverse(mid.next), cur=head;
       
        while(last!=null){
            if(last.val!=cur.val) return false;
            last=last.next;
            cur=cur.next;
        }
        return true;
        
    }
}