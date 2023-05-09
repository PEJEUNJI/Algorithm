package com.quize.inputStream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 
 * @author https://st-lab.tistory.com/19, https://www.acmicpc.net/problem/10430
 *
 */
public class Main_10430 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		br.close();
		StringTokenizer st = new StringTokenizer(str," ");
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		
		StringBuilder sb = new StringBuilder();
		sb.append((A+B)%C).append("\n");
		sb.append(((A%C) + (B%C))%C).append("\n");
		sb.append((A*B)%C).append("\n");
		sb.append(((A%C) * (B%C))%C);
		System.out.print(sb);
	}
}