package com.quiz.repeat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * 
 * @author https://www.acmicpc.net/problem/2742
 *
 */
public class Main_2742 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.valueOf(br.readLine());
		br.close();
		StringBuilder sb = new StringBuilder();
		for(int i = n; i >= 1; i--) {
			sb.append(i).append("\n");
		}
		System.out.print(sb);
	}
}
