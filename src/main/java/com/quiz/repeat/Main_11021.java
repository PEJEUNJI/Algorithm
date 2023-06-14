package com.quiz.repeat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * 
 * @author https://st-lab.tistory.com/33, https://www.acmicpc.net/problem/11021
 *
 */

public class Main_11021 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int line = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		/*
		String str;
		int target;
		for (int i = 1; i < line + 1; i++) {
			str = br.readLine();
			target = str.indexOf(" ");
			sb.append("Case #").append(i).append(": ")
					.append(Integer.valueOf(str.substring(0, target)) + Integer.valueOf(str.substring(target + 1)))
					.append("\n");
		}
		br.close();
		System.out.print(sb);\
		*/
		String str;
		for (int i = 1; i < line + 1; i++) {
			str = br.readLine();
			sb.append("Case #").append(i).append(": ").append(str.charAt(0) - '0' + str.charAt(2) - '0').append("\n");
		}
		br.close();
		System.out.print(sb);
	}
}