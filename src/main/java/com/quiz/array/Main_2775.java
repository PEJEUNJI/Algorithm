package com.quiz.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_2775 {
	/**
	 * @param https://www.acmicpc.net/problem/2775
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int line = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();

		int[][] apt = new int[15][15];
		initApt(apt);

		for (int i = 0; i < line; i++) {
			int floor = Integer.parseInt(br.readLine());
			int roomNo = Integer.parseInt(br.readLine());
			sb.append(apt[floor][roomNo]).append("\n");
		}
		br.close();
		System.out.print(sb);
	}
	private static void initApt(int[][] apt) {
		for (int i = 1; i <= 14; i++) {
			apt[0][i] = i;
			apt[i][1] = 1;
		}
		for (int i = 1; i <= 14; i++) {
			for (int j = 2; j <= 14; j++) {
				apt[i][j] = apt[i][j - 1] + apt[i - 1][j];
			}
		}

	}

}
