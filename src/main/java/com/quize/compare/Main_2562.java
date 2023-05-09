package com.quize.compare;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * 
 * @author https://www.acmicpc.net/problem/2562
 *
 */
public class Main_2562 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int max = Integer.parseInt(br.readLine());
		int order = 1;
		for (int i = 1; i < 9; i++) {
			int target = Integer.parseInt(br.readLine());
			if(target > max) {
				max = target;
				order  = i+1;
			}
		}
		br.close();
		StringBuilder sb = new StringBuilder();
		sb.append(max).append("\n");
		sb.append(order).append("\n");
		System.out.print(sb);
	}

}
