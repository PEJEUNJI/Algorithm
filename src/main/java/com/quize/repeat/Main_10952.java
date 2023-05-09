package com.quize.repeat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * 
 * @author https://www.acmicpc.net/problem/10952
 *
 */
public class Main_10952 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while (true) {
			String str = br.readLine();
			if ("0 0".equals(str))
				break;
			sb.append(str.charAt(0) - '0' + str.charAt(2) - '0').append("\n");
		}
		br.close();
		System.out.print(sb);
	}
}