package com.leedcode.caculator;
/*
 67. Add Binary
Given two binary strings a and b, return their sum as a binary string.

Example 1:

Input: a = "11", b = "1"
Output: "100"
Example 2:

Input: a = "1010", b = "1011"
Output: "10101"
 

Constraints:

1 <= a.length, b.length <= 104
a and b consist only of '0' or '1' characters.
Each string does not contain leading zeros except for the zero itself.
 */
public class AddBinary {

	private static String addBinary(String a, String b) {
		
		int aLen = a.length();
		int bLen = b.length();
		int carry = 0;
		StringBuilder result = new StringBuilder();
		
		while(aLen > 0 || bLen > 0) {
			// Input the carry from the previous operation into sum
			int sum = carry;
			if(aLen > 0) {
				sum += a.charAt(--aLen) - '0';
			}
			if(bLen > 0) {
				sum += b.charAt(--bLen) - '0';
			}
			//input the value to ahead
			result.insert(0,sum%2);
			carry = sum/2;
			
		}
		if(carry != 0) {
			result.insert(0,carry);
		}
		
		return result.toString();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(addBinary("11","1"));

	}

}
