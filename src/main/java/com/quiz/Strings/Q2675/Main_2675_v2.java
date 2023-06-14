package com.quiz.Strings.Q2675;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2675_v2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		String arr[] = new String[count];
		StringBuilder sb = new StringBuilder();

		int repeat = 0;
		String inputStr = "";
		for (int i = 0; i < count; i++) {
			arr = br.readLine().split(" ");
			repeat = Integer.parseInt(arr[0]);
			inputStr = arr[1];
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