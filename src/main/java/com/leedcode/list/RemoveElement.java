package com.leedcode.list;

import java.util.ArrayList;
import java.util.List;

public class RemoveElement {
	public static int removeElement(int[] nums, int val) {
		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != val) {
				list.add(nums[i]);
			}
		}

		int i = 0;
		for (int value : list) {
			nums[i++] = value;
		}
		return list.size();
	}
	
	private static void printArray(int[] nums, int length) {
        System.out.print("[");
        for (int i = 0; i < length; i++) {
            System.out.print(nums[i]);
            if (i < length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = {3, 2, 2, 3};
        int val1 = 3;
       
        int k1 = removeElement(nums1, val1);
       
        printArray(nums1, k1);
	}

}
