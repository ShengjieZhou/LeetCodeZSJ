package LinkedList;

public class ReverseList {
    public static void main(String[] args) {
        int[] values = {1,2,3,4,5,6};
        ListNode head = new ListNode(values[0]);
        ListNode node = head;
        for ( int i=1 ; i< values.length ; i++){
            node.next = new ListNode(values[i]);
            node = node.next;
        }
        //System.out.println(head.toString());
        System.out.println(reverse(head).toString());
    }

    public static ListNode reverse(ListNode head) {
        if ( head == null){
            return null;
        }
        ListNode curr = head;
        ListNode prev = null;
        ListNode next;
        while ( curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
