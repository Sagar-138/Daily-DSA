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
    public int len(ListNode head){
        int sz=0;
        while(head!=null){
            sz++;
            head=head.next;
        }
        return sz;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        int n = len(head); 
        int groups = n/k;
        ListNode prevHead = null;
        ListNode currHead = head ;
        ListNode ansNode = null;
        for(int i=0;i<groups;i++){
            ListNode prev = null;
            ListNode cur = currHead;
            ListNode nextNode=null;
            for(int j=0;j<k;j++){
                nextNode=cur.next;
                cur.next=prev;
                prev=cur;
                cur=nextNode;
            }
            if(prevHead == null){
                ansNode=prev;
            }else{
                prevHead.next=prev;
            }
            prevHead=currHead;
            currHead=cur;
        }
        prevHead.next=currHead;
        return ansNode;
    }
}
