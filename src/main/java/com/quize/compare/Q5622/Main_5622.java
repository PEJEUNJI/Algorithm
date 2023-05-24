package com.quize.compare.Q5622;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * 
 * @author https://www.acmicpc.net/problem/5622
 *
 */
public class Main_5622 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] phoneStr = br.readLine().toCharArray();
		int result = 0;
		for (char num : phoneStr) {
			int number = num - 'A';
			number = number > 21 ? 9 : number > 18 ? 8 : number > 14 ? 7 : (number / 3) + 2;
			result += number+1;
		}
		System.out.print(result);
	}
}