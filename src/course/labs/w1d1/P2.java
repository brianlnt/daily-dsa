package course.labs.w1d1;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class P2 {
    /*
    206. Reverse Linked List (https://leetcode.com/problems/reverse-linked-list/description/)
     */

    //Solution1: Iterative Approach
    public ListNode reverseList(ListNode head) {
        ListNode currNode = head;
        ListNode prevNode = null;

        while(currNode != null){
            ListNode temp = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = temp;
        }
        return prevNode;
    }

    //Solution2: Recursive Approach
    public ListNode reverseList2(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode reverseHead = reverseList2(head.next);
        head.next.next = head;
        head.next = null;
        return reverseHead;
    }
}
