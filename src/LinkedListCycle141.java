class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class LinkedListCycle141 {
    public static boolean hasCycle(ListNode head){
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                return true;
            }
        }

        return false;      
    }

    public static void main(String[] args) {
        System.out.println(hasCycle(new ListNode(3)));
    }
}
