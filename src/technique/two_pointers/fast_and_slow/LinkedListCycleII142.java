package technique.two_pointers.fast_and_slow;

import technique.two_pointers.fast_and_slow.linked_list.LinkedList;
import technique.two_pointers.fast_and_slow.linked_list.ListNode;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycleII142 {
    public static ListNode detectCycle(ListNode head) {
        /*
        Time: O(n)
        Space: O(n)
        */
        Set<ListNode> set = new HashSet<ListNode>();

        while(head != null){
            if(set.contains(head)) return head;
            set.add(head);
            head = head.next;
        }
        return null;
    }

    public static ListNode detectCycle1(ListNode head) {
        /*
        Time: O(n)
        Space: O(1)
        */
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow) {
                break;
            }
        }

        if(fast == null || fast.next == null) return null;

        fast = head;

        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }


    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(3);
        linkedList.append(2);
        linkedList.append(0);
        linkedList.append(-4);
        linkedList.cycle(1);

        System.out.println(detectCycle(linkedList.head).val);
        System.out.println(detectCycle1(linkedList.head).val);
    }
}
