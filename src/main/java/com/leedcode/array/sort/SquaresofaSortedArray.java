package com.leedcode.array.sort;

/*
977. Squares of a Sorted Array
Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

 

Example 1:

Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].
Example 2:

Input: nums = [-7,-3,2,3,11]
Output: [4,9,9,49,121]
 

Constraints:

1 <= nums.length <= 104
-104 <= nums[i] <= 104
nums is sorted in non-decreasing order.
 

Follow up: Squaring each element and sorting the new array is very trivial, could you find an O(n) solution using a different approach?
 */
public class SquaresofaSortedArray {
	private static void printArr(int[] nums) {
		for (int i : nums) {
			System.out.print(i);
		}
		System.out.println();
	}

	private static int[] sortedSquares(int[] nums) {
		
		// point for end element
		int end = nums.length - 1;
		// point for start element
		int start = 0;
		// array for sorted array
		int[] output = new int[end + 1];
		// point for ouput array
		int index = end;

		while (start >= 0 && end >= 0 && index >= 0) {
			// compared first element to last element, after then point will move, one by one
			if (nums[start] * nums[start] > nums[end] * nums[end]) {
				output[index--] = nums[start] * nums[start++];
			} else {
				output[index--] = nums[end] * nums[end--];
			}
		}
		
		return output;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printArr(sortedSquares(new int[] {-7,-5,0,3,8,5,7}));
	}

}
