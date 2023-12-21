package com.leedcode.twopointers;

import java.util.*;
/*
 15. 3Sum
Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.

Example 1:

Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Explanation: 
nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
The distinct triplets are [-1,0,1] and [-1,-1,2].
Notice that the order of the output and the order of the triplets does not matter.
Example 2:

Input: nums = [0,1,1]
Output: []
Explanation: The only possible triplet does not sum up to 0.
Example 3:

Input: nums = [0,0,0]
Output: [[0,0,0]]
Explanation: The only possible triplet sums up to 0.
 

Constraints:

3 <= nums.length <= 3000
-105 <= nums[i] <= 105
 */

public class ThreeSum {
	private static List<List<Integer>> threeSum(int[] nums) {

		List<List<Integer>> output = new ArrayList<List<Integer>>();

		// 1 step : sort
		Arrays.sort(nums);

		int len = nums.length;

		for (int i = 0; i < len - 2; i++) {

			// 2 step : create 2 point for left and right
			int left = i + 1;
			int right = len - 1;
			int target = -nums[i];

			while (left < right) {
				// before starting loop, check the previous value (because this value already
				// checked.)
				if (i > 0 && nums[i] == nums[i - 1]) {
					break;
				}
				int sum = nums[left] + nums[right];
				// sum is smaller than target, so left should be plus
				if (sum < target) {
					left++;
					// sum is bigger than target, so right should be minus
				} else if (sum > target) {
					right--;
				} else {
					
					output.add(Arrays.asList(nums[left], nums[right], nums[i]));
					// remove duplicate value
					while (left < right && nums[left] == nums[left + 1]) {
						left++;
					}
					while (right < left && nums[right] == nums[right - 1]) {
						right--;
					}
					right--;
					left++;
				}
			}

		}

		return output;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// -4 -1 -1 0 1 2
		System.out.println(threeSum(new int[] { -1, 0, 1, 2, -1, -4 }));

//		System.out.println(threeSum(new int[] { -2, 0, 0, 2, 2 }));
//		System.out.println(threeSum(new int[] { 0, 0, 0 }));
//		System.out.println(threeSum(new int[] { -1, 0, 1, 2, -1, -4, -2, -3, 3, 0, 4 }));

	}

}
