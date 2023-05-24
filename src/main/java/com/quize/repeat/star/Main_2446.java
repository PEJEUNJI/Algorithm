package com.quize.repeat.star;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2446 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		br.close();
		StringBuilder sb = new StringBuilder();

		for (int i = num; i > 0; i--) {
			for (int j = 0; j < num - i; j++) {
				sb.append(' ');
			}
			for (int j = 0; j < 2 * i - 1; j++) {
				sb.append('*');
			}
			sb.append('\n');
		}
		for (int i = 2; i <= num; i++) {
			for (int j = 0; j < num - i; j++) {
				sb.append(' ');
			}
			for (int j = 0; j < 2 * i - 1; j++) {
				sb.append('*');
			}
			sb.append('\n');
		}
		System.out.println(sb);
	}

}
