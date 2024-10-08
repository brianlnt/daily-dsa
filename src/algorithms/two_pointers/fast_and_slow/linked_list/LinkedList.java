package algorithms.two_pointers.fast_and_slow.linked_list;

public class LinkedList {
    int length;
    public ListNode head;
    ListNode tail;

    public LinkedList(int x) {
        ListNode newNode = new ListNode(x);
        this.head = newNode;
        this.tail = newNode;
        this.length += 1;
    }

    public void append(int data) {
        ListNode newNode = new ListNode(data);
        if (this.head == null) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            this.tail.next = newNode;
            this.tail = newNode;
        }
        this.length += 1;
    }

    public ListNode get(int index) {
        if (index < 0 || index >= this.length) return null;
        ListNode node = this.head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public boolean cycle(int pos) {
        if (pos == this.length - 1) return false;
        ListNode node = get(pos);
        this.tail.next = node;
        return true;
    }

    String printList() {
        String str = "";
        ListNode node = this.head;
        while (node != null) {
            str += node.val + " ";
            node = node.next;
        }
        return str;
    }
}
