package com.quiz.leedcode.Map;

import java.util.HashMap;
import java.util.Map;
/*
 Given a string s, find the length of the longest 
substring
 without repeating characters.

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 
 */

public class LongestSubstring {

	public static int lengthOfLongestSubstring(String s) {
	       Map<Character, Integer> map = new HashMap<>();
	        int startIndex = 0;
	        int currentLength = 0;
	        int maxLength = 0;
	        for(int i = 0; i < s.length(); i++){
	           char currentStr = s.charAt(i);
	          
	           if(map.containsKey(currentStr) &&  map.get(currentStr) >= startIndex){
	               // Starting next to the duplicate value, so plus 1
	        	   startIndex = map.get(currentStr)+1;
	                       
	           }
	            map.put(currentStr,i);
	            // index starts at 0, so plus 1
	            currentLength = i - startIndex+1;
	            maxLength = Math.max(currentLength, maxLength);    
	        }
	       
	        return maxLength;
	}

	public static void main(String[] args) {
		String s = "ddfgtfh";
		int result = lengthOfLongestSubstring(s);
		System.out.println(result);
	}
}
