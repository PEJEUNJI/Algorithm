package com.quize.sequence;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * 
 * @author https://www.acmicpc.net/problem/1065
 *
 */
public class Main_1065 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int num = Integer.parseInt(str);
		int result = 0;
		if (num < 100) {
			result = num;
		} else {
			result = 99;
			for (int i = 100; i <= num; i++) {
				int n_100 = i / 100;
				int n_10 = i % 100 / 10;
				int n_1 = i % 10 % 10 % 10;

				if (n_100 - n_10 == n_10 - n_1)
					result++;
			}
		}
		System.out.print(result);
	}

}
