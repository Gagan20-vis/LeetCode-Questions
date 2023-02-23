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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode first = l1;
        ListNode second = l2;
        ListNode res = new ListNode(0);
        ListNode curr = res;
        while(first != null || second != null || carry != 0)
        {
            int val1 = 0;
            if(first != null)
                val1 = first.val;

            int val2 = 0;
            if(second != null)
                val2 = second.val;

            int sum = carry + val1 + val2;

            int digit = sum%10;
            ListNode temp = new ListNode(digit);
            curr.next = temp;
            curr = curr.next;

            carry = sum/10;
            if(first != null)
                first = first.next;

            if(second != null)
                second = second.next;
        }
        return res.next;
    }
}