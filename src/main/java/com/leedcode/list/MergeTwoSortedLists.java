package com.leedcode.list;
/*
 21. Merge Two Sorted Lists
You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.
 

Example 1:


Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]
Example 2:

Input: list1 = [], list2 = []
Output: []
Example 3:

Input: list1 = [], list2 = [0]
Output: [0]
 

Constraints:

The number of nodes in both lists is in the range [0, 50].
-100 <= Node.val <= 100
Both list1 and list2 are sorted in non-decreasing order.
 */
import java.util.*;

class ListNode {
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
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		ListNode current = this;

		while (current != null) {
			result.append(current.val);
			if(current.next != null) {
				result.append(",");
			}
			current = current.next;
		}

		return result.toString().trim();
	}
	
}

public class MergeTwoSortedLists {

	private static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		// for header
		ListNode result = new ListNode(0);
		// to point current position
		ListNode current = result;
		while (list1 != null && list2 != null) {
			if (list1.val < list2.val) {
				// if list1.val is smaller list2.val, current has to point list1
				// after then, next time value of list1.next has to compared with list2
				current.next = list1;
				list1 = list1.next;
			} else {
				current.next = list2;
				list2 = list2.next;
			}
			// current has to point current position, so current.next for next step
			current = current.next;
		}
		
		// if list1 or list2 is not null, has to point it.
		if(list1 != null) {
			current.next = list1;
		}else {
			current.next = list2;
		}
		return result.next;

	}

	private static ListNode createLinkedList(int[] values) {
		ListNode result = new ListNode(0);
		ListNode current = result;

		for (int i = 0; i < values.length; i++) {
			current.next = new ListNode(values[i]);
			current = current.next;
		}
		return result.next;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode list1 = createLinkedList(new int[] { 1, 2, 4 });
		ListNode list2 = createLinkedList(new int[] { 1, 4 });
		System.out.println(list1.toString());
		System.out.println("mergeTwoLists" + mergeTwoLists(list1, list2).toString());
		
		if("33".contains("3")) {
			
		}

	}

}
