package com.quiz.inputStream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 
 * @author https://st-lab.tistory.com/18, https://www.acmicpc.net/problem/10869
 *
 */
public class Main_10869 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		br.close();
		StringTokenizer st = new StringTokenizer(str," ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		StringBuilder sb = new StringBuilder();
		sb.append(a+b).append("\n");
		sb.append(a-b).append("\n");
		sb.append(a*b).append("\n");
		sb.append(a/b).append("\n");
		sb.append(a%b);
		System.out.print(sb);
	}
}
