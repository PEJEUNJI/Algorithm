package com.quize.Strings.Q1316;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author https://www.acmicpc.net/problem/1316
 *
 */
public class Main_1316 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int line = Integer.parseInt(br.readLine());
		int result = 0;
		for (int i = 0; i < line; i++) {
			char[] inputValue = br.readLine().toCharArray();
			result += lenthWithoutDup(inputValue) == inputValue.length ? 1 : 0;
		}
		br.close();
		System.out.print(result);
	}

	public static int lenthWithoutDup(char[] inputValue) {
		int length = inputValue.length;
		// compare char in order
		for (int j = 0; j < inputValue.length; j++) {
			// compare the others chars in order
			int index = j;
			for (int k = j + 1; k < inputValue.length; k++) {
				if (inputValue[j] == inputValue[k] && k - index == 1) {
					index = k;
				} else if (inputValue[j] == inputValue[k] && k - index != 1) {
					length--;
				}
			}
		}
		return length;
	}

}
