package com.leedcode.array.sort;

/*
 88. Merge Sorted Array
Companies
You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.

The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

 

Example 1:

Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
Example 2:

Input: nums1 = [1], m = 1, nums2 = [], n = 0
Output: [1]
Explanation: The arrays we are merging are [1] and [].
The result of the merge is [1].
Example 3:

Input: nums1 = [0], m = 0, nums2 = [1], n = 1
Output: [1]
Explanation: The arrays we are merging are [] and [1].
The result of the merge is [1].
Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in nums1.
 

Constraints:

nums1.length == m + n
nums2.length == n
0 <= m, n <= 200
1 <= m + n <= 200
-109 <= nums1[i], nums2[j] <= 109
 

Follow up: Can you come up with an algorithm that runs in O(m + n) time?
 */
public class MergeSortedArray {
	private static void printArr(int[] nums1) {
		for (int i : nums1) {
			System.out.print(i);
		}
		System.out.println();
	}

	private static void merge(int[] nums1, int m, int[] nums2, int n) {
		// point for nums1 array
		int num1Index = m - 1;
		// point for nums2 array
		int num2Index = n - 1;
		// point for sorted array
		int total = m + n - 1;

		while (num1Index >= 0 && num2Index >= 0) {
			// if first element is bigger than last element, it should move last element
			// after then num1Index, total reduce one by one
			if (nums1[num1Index] > nums2[num2Index]) {
				nums1[total--] = nums1[num1Index--];
				// if last element is bigger than first element, it should move last element
				// after then num2Index, total reduce one by one
			} else {
				nums1[total--] = nums2[num2Index--];
			}
		}

		// if nums2 left unchecked value, index of current total is place for nums2's unchecked value.
		while (num2Index >= 0) {
			nums1[total--] = nums2[num2Index--];
		}
		printArr(nums1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		merge(new int[] { 1, 2, 3, 4, 0, 0, 0, 0 }, 4, new int[] { 5, 6, 7, 8 }, 4);

	}

}
