package com.leedcode.binary;
/*
 69. Sqrt(x)
Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.

You must not use any built-in exponent function or operator.

For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.
 

Example 1:

Input: x = 4
Output: 2
Explanation: The square root of 4 is 2, so we return 2.
Example 2:

Input: x = 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.
 

Constraints:

0 <= x <= 231 - 1

 */
public class Sqrt {
	private static int mySqrt(int x) {
		int sqrt = 0;
		
		int right = x;
		int left = 1;
		
		while(left <= right) {
			int mid = left + (right-left)/2;
			// mid is small, expand scope for left
			if((long)mid*mid < x) {
				left = mid + 1;
				sqrt = mid;
			// mid is too big, reduce scope for right
			}else if((long)mid*mid >x){
				right = mid-1;
			}else {
				return mid;
			}
			
		}
		
		return sqrt;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(mySqrt(8));
		System.out.println(mySqrt(2147395599));

	}

}
