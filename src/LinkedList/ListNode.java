package LinkedList;

public class ListNode {
    // 结点的值
    int val;

    // 下一个结点
    ListNode next;

    // 节点的构造函数(无参)
    public ListNode() {
    }

    // 节点的构造函数(有一个参数)
    public ListNode(int val) {
        this.val = val;
    }

    // 节点的构造函数(有两个参数)
    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public String toString() {
        StringBuilder value = new StringBuilder("ListNode [");
        ListNode node = this;
        while (node != null) {
            value.append(node.val);
            if (node.next != null) {
                value.append(", ");
            }
            node = node.next;
        }
        value.append("]");
        return value.toString();

    }
}