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
// class Solution {
//     public int getDecimalValue(ListNode head) {
//         ListNode temp=head;
//         while(temp!=null){
//             if(temp.next!=null) temp=temp.next;
//         }
        
//     }
// }

class Solution {
    public int getDecimalValue(ListNode head) {
        int length = 0;
        ListNode current = head;
        while(current!=null){
            length++;
            current = current.next;
        }
        int decimalValue = 0;
        current = head;
        while(current!=null){
            decimalValue+= current.val*Math.pow(2, length-1);
            current = current.next;
            length--;
        }
        return decimalValue;
    }
}