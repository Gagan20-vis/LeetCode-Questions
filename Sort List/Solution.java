class Solution {
    private ListNode Merge(ListNode h1, ListNode h2){
        if(h1 == null) return h2;
        if(h2 == null) return h1;
        ListNode ans = new ListNode(-1);
        ListNode temp = ans;
        ListNode first = h1;
        ListNode second = h2;

        while(first != null && second != null){
            if(first.val<= second.val)
            {
                temp.next = first;
                temp = first;
                first = first.next;
            }
            else{
                temp.next = second;
                temp = second;
                second = second.next;
            }
        }
        while(first != null){
            temp.next = first;
            temp = first;
            first = first.next;
        }
        while(second != null){
            temp.next = second;
            temp = second;
            second = second.next;
        }
        return ans.next;
    }
    private ListNode FindMid(ListNode head){
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null)
            return head;

        ListNode mid = FindMid(head);
        ListNode left = head;
        ListNode right = mid.next;
        mid.next = null;

        left = sortList(left);
        right = sortList(right);

        if(left.val<right.val)
            return Merge(left,right);
        else return Merge(right,left);
    }
}