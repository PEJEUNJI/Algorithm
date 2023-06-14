package com.quiz.caculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author https://www.acmicpc.net/problem/2839
 *
 */
public class Main_2839 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int target = Integer.parseInt(br.readLine());
		// case 0:n ==7 or 4 -> -1
		if (target == 7 || target == 4) {
			System.out.print(-1);
		} // case 1: n%5 == 0
		else if (target % 5 == 0) {
			System.out.print(target / 5);
			// case 2: n%5 ==3 or 1 -> n/5 +1
		} else if (target % 5 == 3 || target % 5 == 1) {
			System.out.print(target / 5 + 1);
			// case 3: n%5 ==4 or 2 -> n/5 + 2
		} else if (target % 5 == 4 || target % 5 == 2) {
			System.out.print(target / 5 + 2);
		}
	}
}
