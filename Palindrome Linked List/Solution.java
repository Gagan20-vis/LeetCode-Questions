/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    private static ListNode getmiddle(ListNode node)
    {
        ListNode slow = node;
        ListNode fast = node.next;
        while(fast!= null &&fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private static ListNode reverse(ListNode node)
    {
        ListNode prev = null;
        ListNode next = null;
        ListNode curr = node;
        while(curr != null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        if(head.next == null)
            return true;
        ListNode middle = getmiddle(head);
        ListNode temp = middle.next;
        middle.next = reverse(temp);
        ListNode head1 = head;
        ListNode head2 = middle.next;
        while(head2 != null)
        {
            if(head2.val != head1.val)
                return false;
            head1 = head1.next;
            head2 = head2.next;
        }
        return true;
    }
}