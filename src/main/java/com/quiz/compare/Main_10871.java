package com.quiz.compare;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/**
 * 
 * @author https://www.acmicpc.net/problem/10871
 *
 */

public class Main_10871 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int cnt = Integer.parseInt(st.nextToken());
		int target = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine(), " ");
		br.close();

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < cnt; i++) {
			int n = Integer.parseInt(st.nextToken());
			if (n < target) {
				sb.append(n).append(" ");
			}
		}
		System.out.print(sb);
	}

}
