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

import java.util.*;

class Solution {

  public class ListNode {

    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
      this.val = val;
    }

    ListNode(int val, ListNode next) {
      this.val = val;
      this.next = next;
    }
  }

  public ListNode creator(int[] nums) {
    ListNode listNode;
    ListNode finList;
    if (nums.length > 1) {
      listNode = new ListNode(nums[0]);
      finList = listNode;
      for (int i = 1; i < nums.length; i++) {
        listNode.next = new ListNode(nums[i]);
        listNode = listNode.next;
      }
    } else {
      listNode = new ListNode();
      finList = listNode;
    }
    return finList;
  }

  public void printer(ListNode listNode) {
    while (listNode.next != null) {
      System.out.print(listNode.val + " - ");
      listNode = listNode.next;
    }
    System.out.println(listNode.val);
  }

  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode total;
    ListNode finList;
    int sum = l1.val + l2.val;
    total = new ListNode(sum % 10);
    l1 = l1.next;
    l2 = l2.next;
    finList = total;
    while (l1 != null || l2 != null) {
      if (l1 != null && l2 != null) {
        sum = (sum / 10) + l1.val + l2.val;
        total.next = new ListNode(sum % 10);
      }
      l1 = l1.next;
      l2 = l2.next;
      System.out.println("While");
    }

    return finList;
  }

  public static void main(String[] args) {
    Solution s = new Solution();
    int[] arr1 = { 2, 4, 3 };
    int[] arr2 = { 5, 6, 4 };
    int[] arr3 = { 0 };
    int[] arr4 = { 0 };
    int[] arr5 = { 9, 9, 9, 9, 9, 9, 9 };
    int[] arr6 = { 9, 9, 9, 9 };

    ListNode l1 = s.creator(arr1);
    ListNode l2 = s.creator(arr2);
    ListNode l3 = s.creator(arr3);
    ListNode l4 = s.creator(arr4);
    ListNode l5 = s.creator(arr5);
    ListNode l6 = s.creator(arr6);

    ListNode s1 = s.addTwoNumbers(l1, l2);
    ListNode s2 = s.addTwoNumbers(l3, l4);
    ListNode s3 = s.addTwoNumbers(l5, l6);

    s.printer(l1);
    s.printer(l2);
    s.printer(s1);
    System.out.println("--------------------");

    s.printer(l3);
    s.printer(l4);
    s.printer(s2);
    System.out.println("--------------------");
    // s.printer(l5);
    // s.printer(l6);
    // s.printer(s3);
    // System.out.println("--------------------");
  }
}
/*
 * Previous Attempts for addTwoNumbers
 * 
 * Attempt 1: Only add 2 integers. Not sure what it is adding either
 * 
 * ListNode sum;
    boolean l1N = false;
    boolean l2N = false;
    if (l1.val == 0 && l2.val == 0) {
      sum = new ListNode(0);
    } else if (l1.val == 0 && l2.val > 0) {
      sum = new ListNode(l2.val);
    } else {
      sum = new ListNode(l1.val);
    }
    while (!l1N || !l2N) {
      if ((!l1N && !l2N) && (l1.val > 0 || l2.val > 0)) {
        sum.next = new ListNode((l1.val + l2.val));
      } else if ((!l1N && l2N) && (l1.val > 0)) {
        sum.next = new ListNode((l1.val));
      } else if ((!l2N && l1N) && (l2.val > 0)) {
        sum.next = new ListNode(l2.val);
      }

      if ((l1.next == null) && (l2.next == null)) {
        l1N = true;
        l2N = true;
      } else if ((l1.next != null) && (l2.next == null)) {
        l1 = l1.next;
        l2N = true;
      } else if ((l1.next == null) && (l2.next != null)) {
        l2 = l2.next;
        l1N = true;
      } else {
        l1 = l1.next;
        l2 = l2.next;
      }
    }
    return sum;
 * 
 */
