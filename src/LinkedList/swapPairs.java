package LinkedList;

public class swapPairs {
    public static void main(String[] args) {
        int[] values = {1,2,3,4,5,6,7};
        ListNode head = new ListNode(values[0]);
        ListNode node = head;
        for ( int i=1 ; i< values.length ; i++){
            node.next = new ListNode(values[i]);
            node = node.next;
        }
        //System.out.println(head.toString());
        System.out.println(swap(head));
    }

    public static ListNode swap(ListNode head) {

        if (head == null || head.next == null){
            return head;
        }

        ListNode dummyHead = new ListNode(-1,head);
        ListNode node = dummyHead;
        ListNode first = head;
        ListNode second = head.next;
        ListNode temp = head.next.next;

        while ( node != null && first != null && second != null){
            node.next = second;
            second.next = first;
            first.next = temp;
            node = first;
            first = first.next;
            second = (first == null) ? null : first.next;
            temp = (second == null) ? null : second.next;
        }
        return dummyHead.next;

    }
}
