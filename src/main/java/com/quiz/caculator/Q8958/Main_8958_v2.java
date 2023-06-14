package com.quiz.caculator.Q8958;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author https://www.acmicpc.net/problem/8958
 *
 */
public class Main_8958_v2 {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < count; i++) {
			int sum = 0;
			int targetNo = 1;
			for (byte target : br.readLine().getBytes()) {
				if (target == 'O') {
					sum = targetNo + sum;
					targetNo++;
				} else {
					targetNo = 1;
				}
			}
			sb.append(sum).append("\n");
		}
		br.close();
		System.out.print(sb);
	}
}
