package com.quiz.repeat.Q2523;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2523_v2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		br.close();
		StringBuilder sb = new StringBuilder();
		String star ="";
		for (int i = 1; i < num*2; i++) {
			star = i <= num ? star += "*" : star.substring(0, num*2 - i);
			sb.append(star).append("\n");
		}
		System.out.print(sb);
	}
}