package com.quiz.inputStream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 
 * @author https://st-lab.tistory.com/17, https://www.acmicpc.net/problem/1008
 *
 */
public class Main_1008 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		br.close();
		StringTokenizer st = new StringTokenizer(str, " ");
		double a = Double.parseDouble(st.nextToken());
		double b = Double.parseDouble(st.nextToken());
		System.out.print(a/b);
	}
}