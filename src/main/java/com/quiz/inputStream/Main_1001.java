package com.quiz.inputStream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * 
 * @author https://st-lab.tistory.com/14, https://www.acmicpc.net/problem/1001
 *
 */
public class Main_1001 {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		Scanner in = new Scanner(System.in);
//		int a = in.nextInt();
//		int b = in.nextInt();
//		System.out.print(a-b);
//		in.close();
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String str = br.readLine();
//		StringTokenizer st = new StringTokenizer(str," ");
//		int a = Integer.parseInt(st.nextToken());
//		int b = Integer.parseInt(st.nextToken());
//		System.out.print(a-b);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		br.close();
		String[] st = str.split(" ");
		int a  = Integer.parseInt(st[0]);
		int b  = Integer.parseInt(st[1]);
		System.out.print(a-b);
	}
}