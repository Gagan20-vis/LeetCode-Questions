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

  public static ListNode solve(ListNode list1, ListNode list2) {
    if (list1.next == null) {
      list1.next = list2;
      return list1;
    }

    ListNode first = list1;
    ListNode f_next = list1.next;
    ListNode second = list2;
    ListNode s_next = list2.next;
    while (f_next != null && second != null) {
      if (first.val <= second.val && second.val <= f_next.val) {
        first.next = second;
        s_next = second.next;
        second.next = f_next;
        first = second;
        second = s_next;
      } else {
        first = f_next;
        f_next = f_next.next;

        if (f_next == null) {
          first.next = second;
          return list1;
        }
      }
    }
    return list1;
  }

  public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    if (list1 == null) return list2;
    if (list2 == null) return list1;
    if (list1.val <= list2.val) return solve(list1, list2);
    return solve(list2, list1);
  }
}
