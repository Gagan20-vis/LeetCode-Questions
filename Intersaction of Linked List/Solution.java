public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        //Brute Force

        // ListNode temp1 = headA;
        // while(temp1 != null)
        // {
        //     ListNode temp2 = headB;
        //     while(temp2 != null)
        //     {
        //         if(temp1 == temp2)
        //             return temp1;
        //         else
        //             temp2 = temp2.next;
        //     }
        //     temp1 = temp1.next;
        // }
        // return null;

        //Optimal

        if(headA == null || headB == null) return null;
        ListNode a = headA;
        ListNode b = headB;

        while(a != b)
        {
            a = (a==null)? headB : a.next;
            b = (b==null)? headA : b.next;
        }
        return a;
    }
}