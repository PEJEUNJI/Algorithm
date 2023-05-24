package com.quize.caculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * 
 * @author https://www.acmicpc.net/problem/2941
 *
 */
public class Main_2941 {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inputStr = br.readLine();
		String[] special = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };
		int result = 0;
		int length = inputStr.length();
		for (int index = 0; index < length;) {
			boolean match = false;
			//Checking if any characters belong to the special
			//The length of the special character is 2 or 3
			for (String value : special) {
				if ((index + 2 <= length) && inputStr.substring(index, index + 2).equals(value)) {
					index = index + 2;
					match = true;
					break;
				} else if ((index + 3 <= length) && inputStr.substring(index, index + 3).equals(value)) {
					index = index + 3;
					match = true;
					break;
				}
			}
			if (!match) {
				index++;
			}
			result++;
		}
		System.out.print(result);
	}
}