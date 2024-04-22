package LinkedList;

public class RemoveElement {

    public static void main(String[] args) {
        int[] values = {1,2,6,3,4,5,6};
        ListNode head = new ListNode(values[0]);
        ListNode node = head;
        for ( int i=1 ; i< values.length ; i++){
            node.next = new ListNode(values[i]);
            node = node.next;
        }
        //System.out.println(head.toString());
        System.out.println(removeElements(head,6));
    }

    public static ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val) {
            head = head.next;
        }
        if (head == null) {
            return null;
        }
        ListNode prev = head;
        ListNode curr = head.next;
        while (curr != null) {
            if (curr.val == val) {
                prev.next = curr.next;
            } else {
                prev = curr;
            }
            curr = curr.next;
        }
        return head;
    }
}
