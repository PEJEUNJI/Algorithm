package com.quiz.leedcode.String;

/*
 Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

 

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
 

Constraints:

1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lowercase English letters.
 */
public class LongestCommonPrefix {
	public static String longestCommonPrefix(String[] strs) {
		if (strs == null || strs.length == 0)
			return "";

		// set first letter to prefixStr to compare others letters
		String prefixStr = strs[0];
		// it will compare with i+1 index, so length should -1
		for (int i = 0; i < strs.length - 1; i++) {
			//compare with value of next index
			while (strs[i + 1].indexOf(prefixStr) != 0) {
				//Compare backwards by one to find common prefixes
				prefixStr = strs[i].substring(0, prefixStr.length() - 1);
				//if there is not common prefix, finish this loop
				if (prefixStr.isEmpty())
					return "";
			}

		}
		return prefixStr;

	}

	public static void main(String[] args) {
		String[] example1 = { "flower", "flow", "flight" };
		String[] example2 = { "dog", "racecar", "car" };

		System.out.println(longestCommonPrefix(example1)); // Output: "fl"
		System.out.println(longestCommonPrefix(example2)); // Output: ""
	}

}
