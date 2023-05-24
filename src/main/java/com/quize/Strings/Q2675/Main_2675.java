package com.quize.Strings.Q2675;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2675 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		int repeat = 0;
		String inputStr = "";
		for (int i = 0; i < count; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			repeat = Integer.parseInt(st.nextToken());
			inputStr = st.nextToken();
			for (int k = 0; k < inputStr.length(); k++) {
				for (int j = 0; j < repeat; j++) {
					sb.append(inputStr.charAt(k));
				}
			}
			sb.append("\n");
		}
		br.close();
		System.out.print(sb);
	}
}