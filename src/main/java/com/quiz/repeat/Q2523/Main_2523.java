package com.quiz.repeat.Q2523;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2523 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		br.close();
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= num; i++) {
			int loop = i;
			while (loop > 0) {
				sb.append("*");
				loop--;
			}
			sb.append("\n");
		}
		for (int i = num - 1; i > 0; i--) {
			int loop = i;
			while (loop > 0) {
				sb.append("*");
				loop--;
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}

}
