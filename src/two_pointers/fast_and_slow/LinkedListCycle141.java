package two_pointers.fast_and_slow;

import two_pointers.fast_and_slow.linked_list.LinkedList;
import two_pointers.fast_and_slow.linked_list.ListNode;

import java.util.HashSet;
import java.util.Set;

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
        if(!list.cycle(pos)) return false;

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
        linkedList.append(2);
//        linkedList.append(0);
//        linkedList.append(-4);
//        System.out.println(linkedList.printList());

        if(hasCycle1(linkedList, 0)){
            System.out.println(linkedList.get(0).val);
        }
//        System.out.println(hasCycle1(linkedList, 1));
    }
}
