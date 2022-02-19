package com.java.poc.dsa.linkedlist;

public class FindMiddleOfLinkedList {

    public static void main(String[] args) {

        ListNode list1 = new ListNode(1);
        ListNode list2 = new ListNode(2);
        ListNode list3 = new ListNode(3);
        list1.next = list2;
        list2.next = list3;

        System.out.println(list1.toString());
        System.out.println(middle(list1).val);

    }

    private static ListNode middle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        if (null != head) {
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
        }
        return slow;
    }
}
