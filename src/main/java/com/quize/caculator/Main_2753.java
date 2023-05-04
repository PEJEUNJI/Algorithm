package com.quize.caculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * 
 * @author https://www.acmicpc.net/problem/2753, https://st-lab.tistory.com/23
 *
 */

public class Main_2753 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		int year = Integer.parseInt(br.readLine());
		br.close();
		int result = year%4 == 0 && (year%100 != 0 || year%400 == 0) ? 1 : 0;
		System.out.print(result);
	}
}
