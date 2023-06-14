package com.quiz.caculator;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 
 * @author https://www.acmicpc.net/problem/2869
 *
 */
public class Main_2869 {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());

		int rest = (V - B) % (A - B);
		int b = rest == 0 ? (V - B) / (A - B) : (V - B) / (A - B) + 1;
		System.out.print(b);
	}

}
