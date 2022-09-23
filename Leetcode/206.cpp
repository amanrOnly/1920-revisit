class Solution {
public:
    ListNode* reverseList(ListNode* head) {
        ListNode* newNode=NULL;
        while(head!=NULL){
            ListNode* temp=head->next;
            head->next=newNode;
            newNode=head;
            head=temp;
        }
        return newNode;
    }
};
