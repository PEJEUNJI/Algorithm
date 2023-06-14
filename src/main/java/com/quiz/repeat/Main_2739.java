package com.quiz.repeat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * 
 * @author https://st-lab.tistory.com/26, https://www.acmicpc.net/problem/2739
 *
 */
public class Main_2739 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		br.close();
	
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i < 10; i++) {
			sb.append(n).append(" * ").append(i).append(" = ").append(i*n).append("\n");
		}
		System.out.println(sb);
	}
}
