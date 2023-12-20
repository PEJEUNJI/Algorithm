package com.leedcode.array;

public class MergeSortedArray {
	private static void printArr(int[] nums1) {
		for (int i : nums1) {
			System.out.print(i);
		}
		System.out.println();
	}

	private static void merge(int[] nums1, int m, int[] nums2, int n) {
		int num1Index = m - 1;
		int num2Index = n - 1;
		int total = m + n - 1;

		while (num1Index >= 0 && num2Index >= 0) {
			if (nums1[num1Index] > nums2[num2Index]) {
//				System.out.println("nums1[" + num1Index + "] :" + nums1[num1Index] + "nums2[" + num2Index + "] :"
//						+ nums2[num2Index]);
				nums1[total--] = nums1[num1Index--];
			} else {
//				System.out.println("nums1[" + num1Index + "] :" + nums1[num1Index] + "nums2[" + num2Index + "] :"
//						+ nums2[num2Index]);

				nums1[total--] = nums2[num2Index--];
			}
//			printArr(nums1);
		}

		while (num2Index >= 0) {
			nums1[total--] = nums2[num2Index--];
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		merge(new int[] {1,2,3,4,0,0,0,0},4,new int[] {5,6,7,8},4);

	}

}
