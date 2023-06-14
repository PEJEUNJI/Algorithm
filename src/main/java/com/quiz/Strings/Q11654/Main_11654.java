package com.quiz.Strings.Q11654;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author https://www.acmicpc.net/problem/11654
 *
 */
public class Main_11654 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String numberList = br.readLine();
		br.close();
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += numberList.charAt(i)-'0';
		}
		System.out.print(sum);
	}
}
