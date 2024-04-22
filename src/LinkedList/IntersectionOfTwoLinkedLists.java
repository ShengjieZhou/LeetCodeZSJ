package LinkedList;

public class IntersectionOfTwoLinkedLists {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lengthA = getLength(headA);
        int lengthB = getLength(headB);
        ListNode longHead = (lengthA>=lengthB) ? headA : headB;
        ListNode shortHead = (lengthA<lengthB) ? headA : headB;
        for(int i =0; i<Math.abs(lengthA-lengthB); i++){
            longHead = longHead.next;
        }
        while ( longHead != shortHead ){
            longHead = longHead.next;
            shortHead = shortHead.next;
            if(longHead == null){
                break;
            }
        }
        return longHead;
    }

    public int getLength(ListNode node){
        int length = 0;
        while (node != null){
            length +=1;
            node = node.next;
        }
        return length;
    }

}
