package com.quiz.leedcode.Map;

import java.util.HashMap;
import java.util.Map;



public class TwoSum {

	private static int[] twoSum(int[] nums, int target) {
		
		Map<Integer, Integer> map = new HashMap();
		
		for (int i =0; i < nums.length; i++) {
			map.put(nums[i],i);
			
		}
		for (int i =0; i < nums.length; i++) {
			int complement = target - nums[i];
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
