package two_pointers.fast_and_slow;

import java.util.HashSet;
import java.util.Set;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

class LinkedList {
    int length;
    ListNode head;
    ListNode tail;
    LinkedList(int x) {
        ListNode newNode = new ListNode(x);
        this.head = newNode;
        this.tail = newNode;
        this.length += 1;
    }

    void append(int data) {
        ListNode newNode = new ListNode(data);
        if(this.head == null){
            this.head = newNode;
            this.tail = newNode;
        } else {
            this.tail.next = newNode;
            this.tail = newNode;
        }
        this.length += 1;
    }

    ListNode get(int index){
        if(index < 0 || index >= this.length) return null;
        ListNode node = this.head;
        for(int i = 0; i < index; i++){
            node = node.next;
        }
        return node;
    }

    void cycle(int pos){
        ListNode node = get(pos);
        this.tail.next = node;
    }

    String printList(){
        String str = "";
        ListNode node = this.head;
        while(node != null){
            str += node.val + " ";
            node = node.next;
        }
        return str;
    }
}

public class LinkedListCycle141 {
    public static boolean hasCycle(LinkedList list, int pos){
        /*
        Time: O(n)
        Space: O(n)
         */
        list.cycle(pos);
        Set<ListNode> set = new HashSet<>();
        ListNode head = list.head;

        while(head != null){
            if(set.contains(head)) return true;
            set.add(head);
            head = head.next;
        }
        return false;
    }

    public static boolean hasCycle1(LinkedList list, int pos){
        /*
        Time: O(n)
        Space: O(1)
         */
        list.cycle(pos);

        ListNode fast = list.head;
        ListNode slow = list.head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(3);
//        linkedList.append(2);
//        linkedList.append(0);
//        linkedList.append(-4);
//        System.out.println(linkedList.printList());
        System.out.println(hasCycle1(linkedList, -1));
    }
}
