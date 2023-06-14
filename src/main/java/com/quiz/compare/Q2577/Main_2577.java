package com.quiz.compare.Q2577;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2577 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		br.close();
		StringBuilder sb = new StringBuilder();
		char arr[] = Integer.toString(a*b*c).toCharArray();
		for(int i = 0; i < 10; i++) {
			int cnt = 0;
			for(int j = 0; j < arr.length; j++) {
				if(arr[j]-'0' == i) cnt++;
			}
			sb.append(cnt).append("\n");
		}
		System.out.print(sb);
	}

}
