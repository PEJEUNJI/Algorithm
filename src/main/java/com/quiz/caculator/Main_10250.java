package com.quiz.caculator;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author https://www.acmicpc.net/problem/10250
 */
public class Main_10250 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int line = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < line; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int height = Integer.parseInt(st.nextToken());
			st.nextToken();
			int target = Integer.parseInt(st.nextToken());
			sb.append(getHotelRoomNO(height, target)).append("\n");
		}
		System.out.print(sb);
	}

	private static int getHotelRoomNO(int height, int target) {
		int roomNo;
		// from *01
		int minLoop = target / height;
		int restLoop = target % height;
		if (restLoop == 0) {
			roomNo = minLoop + 100 * height;
		} else {
			roomNo = 101 + minLoop + (100 * (restLoop - 1));
		}
		return roomNo;
	}
}
