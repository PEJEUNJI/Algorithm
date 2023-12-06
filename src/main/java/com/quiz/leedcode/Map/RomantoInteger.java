package com.quiz.leedcode.Map;

import java.util.HashMap;
import java.util.Map;
/*
 Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9. 
X can be placed before L (50) and C (100) to make 40 and 90. 
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer.

 

Example 1:

Input: s = "III"
Output: 3
Explanation: III = 3.
Example 2:

Input: s = "LVIII"
Output: 58
Explanation: L = 50, V= 5, III = 3.
Example 3:

Input: s = "MCMXCIV"
Output: 1994
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 

Constraints:

1 <= s.length <= 15
s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
It is guaranteed that s is a valid roman numeral in the range [1, 3999].
 */
public class RomantoInteger {

	public static int romanToInt(String s) {
		Map<String, Integer> romanNum = new HashMap<>();
		//put roma numbee and minus rule
		romanNum.put("I", 1);
		romanNum.put("V", 5);
		romanNum.put("X", 10);
		romanNum.put("L", 50);
		romanNum.put("C", 100);
		romanNum.put("D", 500);
		romanNum.put("M", 1000);
		romanNum.put("IV", 4);
		romanNum.put("IX", 9);
		romanNum.put("XL", 40);
		romanNum.put("XC", 90);
		romanNum.put("CD", 400);
		romanNum.put("CM", 900);

		int resultNum = 0;

		for (int i = 0; i < s.length(); i++) {
			// to get just one digit  ex) "III" -> I
			String one_digit = s.substring(i,i+1);
			// to get two digit when i is more smaller than total length -1 to avoid outofexception
			String two_digit = i < s.length()-1 ? s.substring(i,i+2) : "";
            // if the two_digit is included in a map, it is for minus and i was changed to next value
			if (romanNum.containsKey(two_digit)) {
				resultNum = resultNum + romanNum.get(two_digit);
				i++;
			} else {
				resultNum = resultNum + romanNum.get(one_digit);
			}

		}
		return resultNum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(romanToInt("III"));
		System.out.println(romanToInt("LVIII"));
		System.out.println(romanToInt("MCMXCIV"));

	}

}
