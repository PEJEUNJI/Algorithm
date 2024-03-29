package com.leedcode.string;
/*
28. Find the Index of the First Occurrence in a String
Companies
Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.


Example 1:

Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.
Example 2:

Input: haystack = "leetcode", needle = "leeto"
Output: -1
Explanation: "leeto" did not occur in "leetcode", so we return -1.
 

Constraints:

1 <= haystack.length, needle.length <= 104
haystack and needle consist of only lowercase English characters.
 */

public class FindIndexFirstOccurrence {
	private static int strStr(String haystack, String needle) {
		if (haystack.isEmpty() || needle.isEmpty())
			return -1;

		if (haystack.length() < needle.length() || !haystack.contains(needle))
			return -1;

		for (int i = 0; i < haystack.length(); i++) {
			if (haystack.charAt(i) == needle.charAt(0) && haystack.substring(i, i + needle.length()).equals(needle)) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(strStr("sadbutsad", "sad"));
		System.out.println(strStr("leetcode", "leeto"));
	}

}
