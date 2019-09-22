package dev.anthonybruno.leetcode;

/**
 * https://leetcode.com/problems/add-two-numbers/
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order and each of their nodes contain a single digit.
 * Add the two numbers and return it as a linked list.
 *
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 *
 * Example:
 *
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 */
public class AddTwoNumbers {


    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l1Pointer = l1;
        ListNode l2Pointer = l2;
        int carryOver = 0;
        ListNode out = new ListNode(0);
        ListNode currentNode = out;
        while (l1Pointer != null || l2Pointer != null) {
            int total = -1;
            if (l1Pointer != null && l2Pointer != null) {
                total = l1Pointer.val + l2Pointer.val + carryOver;

                l1Pointer = l1Pointer.next;
                l2Pointer = l2Pointer.next;
            } else if (l1Pointer != null ) {
                total = l1Pointer.val + carryOver;
                l1Pointer = l1Pointer.next;
            } else if (l2Pointer != null) {
                total = l2Pointer.val + carryOver;
                l2Pointer = l2Pointer.next;
            }

            if (total >= 10) {
                currentNode.val = total % 10;
                carryOver = 1;
            } else {
                currentNode.val = total;
                carryOver = 0;
            }

            if (l1Pointer == null && l2Pointer == null) {
                break;
            }

            ListNode next = new ListNode(0);
            currentNode.next = next;
            currentNode = next;
        }

        if (carryOver > 0) {
            currentNode.next = new ListNode(carryOver);
        }


        return out;
    }

    public static class ListNode {

        public int val;
        public ListNode next;

        public ListNode(int x) {
            this.val = x;
        }
    }


    public static ListNode createListNode(int... values) {
        ListNode out = new ListNode(values[0]);
        ListNode current = out;
        for (int i = 1; i < values.length; i++) {
            ListNode newNode = new ListNode(values[i]);
            current.next = newNode;
            current = newNode;
        }
        return out;
    }


    public static void main(String[] args) {
        ListNode l1 = createListNode(2, 4, 3);
        ListNode l2 = createListNode(5, 6, 4);
        ListNode result = addTwoNumbers(l1, l2);
        while (result != null) {
            System.out.print(result.val);
            result = result.next;
        }

    }
}
