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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dum = new ListNode(0);
        int c = 0;
        ListNode cur = dum;
        while(l1!=null||l2!=null||c!=0){
            int s = (l1==null?0:l1.val) + (l2==null?0:l2.val)+c;
            c=s/10;
            cur.next=new ListNode(s%10);
            cur=cur.next;
            l1= l1==null?null:l1.next;
            l2= l2==null?null:l2.next;
        } 
        return dum.next;
    }
}