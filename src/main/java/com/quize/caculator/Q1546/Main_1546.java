package com.quize.caculator.Q1546;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_1546 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		double score[] = new double[cnt];
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		br.close();
		for (int i = 0; i < cnt; i++) {
			score[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(score);
		double result = 0;
		for (int i = 0; i < cnt; i++) {
			result += score[i]/score[cnt-1]*100;
		}
		System.out.print(result/cnt);
	}

}
