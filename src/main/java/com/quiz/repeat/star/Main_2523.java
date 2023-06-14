package com.quiz.repeat.star;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * 
 * @author https://www.acmicpc.net/problem/2523
 *
 */
public class Main_2523 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		br.close();
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= num; i++) {
			sb.append("*".repeat(i)).append("\n");
		}
		for (int i = num - 1; i > 0; i--) {
			sb.append("*".repeat(i)).append("\n");
		}
		System.out.print(sb);
	}

}
