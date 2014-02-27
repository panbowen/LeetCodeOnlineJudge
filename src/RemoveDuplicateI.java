// Notify that if use while(temp.next !=null), it may cause NullPointerException
public class RemoveDuplicateI {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null)   return head;
         
        ListNode curr = head;
        
        while(curr != null) {
            ListNode tmp = curr.next;
            while(tmp != null && curr.val == tmp.val) {
                tmp = tmp.next;
            }
            curr.next = tmp;
            curr = curr.next;
        }
        return head;
    }
}