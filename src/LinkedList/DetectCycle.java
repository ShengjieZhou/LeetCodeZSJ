package LinkedList;

public class DetectCycle {

    public static void main(String[] args) {
        int[] values = {1,2,3,4,5,6,7,8};
        ListNode head = new ListNode(values[0]);
        ListNode node = head;
        for ( int i=1 ; i< values.length ; i++){
            node.next = new ListNode(values[i]);
            node = node.next;
        }
        ListNode node1 = head.next.next;
        node.next = node1;
        //System.out.println(head.toString());
        System.out.println(cycle(head));
    }

    public static ListNode cycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                ListNode node1 = head;
                ListNode node2 = slow;
                while ( node1 != node2 ){
                    node1 = node1.next;
                    node2 = node2.next;
                }
                return node1;
            }
        }
        return null;
    }

}
