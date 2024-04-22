package LinkedList;

public class RemoveNthFromEnd {

    public static void main(String[] args) {
        int[] values = {1,2,3,4,5,6,7,8};
        ListNode head = new ListNode(values[0]);
        ListNode node = head;
        for ( int i=1 ; i< values.length ; i++){
            node.next = new ListNode(values[i]);
            node = node.next;
        }
        //System.out.println(head.toString());
        System.out.println(remove(head,8));
    }

    public static ListNode remove(ListNode head, int n) {
        if (head == null || head.next == null){
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        for (int i = 0 ; i < n ; i++){
            fast = fast.next;
        }
        if ( fast == null ){
            head = head.next;
            return head;
        }
        while ( fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }

}
