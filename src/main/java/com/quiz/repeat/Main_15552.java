package com.quiz.repeat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 
 * @author https://st-lab.tistory.com/30,https://www.acmicpc.net/problem/15552
 *
 */
public class Main_15552 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int line = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		/*
		for(int i = 0; i < line; i ++) {
			 st = new StringTokenizer(br.readLine(), " ");
			 sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())).append("\n");
		}
		br.close();
		System.out.print(sb);
		*/
		for(int i = 0; i < line; i ++) {
			String str = br.readLine();
			int target = str.indexOf(" ");
			sb.append(Integer.parseInt(str.substring(0,target)) + Integer.parseInt(str.substring(target+1))).append("\n");
		}
		br.close();
		System.out.print(sb);
	}

}
