package com.quiz.leedcode.array;

public class TwoSum {

	private static int[] twoSum(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			int i_val = nums[i];
			for (int j = i + 1; j < nums.length; j++) {
				int j_val = nums[j];
				if (i_val + j_val == target) {

					return new int[] { i, j };
				}
			}
		}
		return null;
	}

	private static void printArray(int[] nums) {
		System.out.print("[" + nums[0] + "," + nums[1] + "]");
	}

	public static void main(String[] args) {
		printArray(TwoSum.twoSum(new int[] { 2, 7, 11, 15 }, 9));
		// TODO Auto-generated method stub

	}

}
