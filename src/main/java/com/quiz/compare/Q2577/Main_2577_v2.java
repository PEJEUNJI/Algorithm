package com.quiz.compare.Q2577;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2577_v2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		br.close();
		char chArr[] = Integer.toString(a*b*c).toCharArray();
		int arr[] = new int[10];
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i <chArr.length; i ++) {
			arr[chArr[i]-'0']++;
		}
		for(int j : arr) {
			sb.append(j).append("\n");
		}
		System.out.print(sb);
	}

}
