package leetcodeproblems;
// #2130 leetcode
public class MaxTwinSumInLinkedlist {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    class Solution {
        public int pairSum(ListNode head) {
            ListNode cur = head;
            ListNode firstHalfEnd = findFirstHalf(cur);
            ListNode secondHalf = reverse(firstHalfEnd.next);

            int maxSum = Integer.MIN_VALUE;
            ListNode pointer1 = head;
            ListNode pointer2 = secondHalf;

            while (pointer2 != null) {
                int sum = pointer1.val + pointer2.val;
                maxSum = Math.max(sum, maxSum);
                pointer1 = pointer1.next;
                pointer2 = pointer2.next;
            }
            return maxSum;
        }

        private ListNode reverse(ListNode head) {
            ListNode prev = null;
            ListNode cur = head;
            while (cur != null) {
                ListNode next = cur.next;
                cur.next = prev;
                prev = cur;
                cur = next;
            }
            return prev;
        }

        private ListNode findFirstHalf(ListNode head) {
            ListNode fast = head;
            ListNode slow = head;
            while (fast.next != null && fast.next.next != null) {
                fast = fast.next.next;
                slow = slow.next;
            }
            return slow;
        }
    }
}
