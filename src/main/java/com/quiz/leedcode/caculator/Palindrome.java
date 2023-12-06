package com.quiz.leedcode.caculator;
/*
 Given an integer x, return true if x is a 
palindrome
, and false otherwise.

 

Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 

Constraints:

-231 <= x <= 231 - 1
 

Follow up: Could you solve it without converting the integer to a string?
 */

public class Palindrome {
	private static boolean isPalindrome(int x) {
		if (x < 0) {
			return false;
		} else {
			double convertNum = 0.0;
			int inputTarget = x;
			int digit = 0;
			while (inputTarget > 0) {
				digit = inputTarget % 10;
				convertNum = convertNum * 10 + digit;
				inputTarget = inputTarget / 10;
			}
			return x == convertNum;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Palindrome.isPalindrome(121));
		System.out.println(Palindrome.isPalindrome(-121));

	}

}
