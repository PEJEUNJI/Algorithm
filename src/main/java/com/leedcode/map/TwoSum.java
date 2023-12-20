package com.leedcode.map;

import java.util.HashMap;
import java.util.Map;
/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.



Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
*/

public class TwoSum {

	private static int[] twoSum(int[] nums, int target) {

		Map<Integer, Integer> map = new HashMap();
		int len = nums.length;
		//return indices of the two numbers, so ouput array length is 2
		int[] output = new int[2];
		for (int i = 0; i < len; i++) {
			int gap = target - nums[i]; // get another target value
			// if map contain gap by key
			if (map.containsKey(gap) ) {
				// value is index
				output[0] = map.get(gap);
				output[1] = i;
				return output;
			}
			// it map doesn't contain gap, put it for next step.
			map.put(nums[i], i);
		}

		return output;
	}

	
	private static void printArray(int[] nums) {
		System.out.print("[" + nums[0] + "," + nums[1] + "]");
	}

	public static void main(String[] args) {
		printArray(twoSum(new int[] { 3, 3 }, 6));
		// TODO Auto-generated method stub

	}

}
