package com.quize.repeat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * 
 * @author https://www.acmicpc.net/problem/2439
 *
 */

public class Main_2439 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		StringBuilder star = new StringBuilder();
		for (int i = n - 1; i >= 0; i--) {
			star.append("*");
			for (int j = 0; j < i; j++) {
				sb.append(" ");
			}
			sb.append(star);
			sb.append("\n");
		}
		System.out.print(sb);
	}
}