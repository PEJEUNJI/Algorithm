package com.quize.repeat.star.Q10996;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author https://www.acmicpc.net/problem/10996
 *
 */
public class Main_10996 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		br.close();
		StringBuilder sb = new StringBuilder();
		int loop = 0;
		int count = (n / 2) + (n % 2);
		for (int i = 0; i < n; i++) {
			while (loop < n) {
				for (int k = 0; k < count; k++) {
					sb.append("*").append(" ");
					loop++;
				}
				count = n - ((n / 2) + (n % 2));
				if (loop != n) {
					sb.append("\n ");
				}
			}
			sb.append("\n");
			count = (n / 2) + (n % 2);
			loop = 0;
		}
		System.out.print(sb);
	}

}
