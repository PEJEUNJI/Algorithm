package com.quiz.leedcode.Map;

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
		
		for (int i =0; i < nums.length; i++) {
			map.put(nums[i],i);
		}
		for (int i =0; i < nums.length; i++) {
			int complement = target - nums[i]; //get another target value
			if(map.containsKey(complement) && map.get(complement) != i) {
				return new int[] {i, map.get(complement)};
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
