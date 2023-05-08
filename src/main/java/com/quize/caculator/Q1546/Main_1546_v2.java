package com.quize.caculator.Q1546;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1546_v2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		br.close();
		int max = Integer.parseInt(st.nextToken());
		double score = max;
		for (int i = 0; i < cnt-1; i++) {
			int target = Integer.parseInt(st.nextToken());
			score += target;
			max = target > max ? target : max;
		}
		System.out.print((score/max)*100 / cnt);

	}

}
