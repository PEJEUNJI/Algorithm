package com.quize.repeat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * 
 * @author https://st-lab.tistory.com/40
 *
 */
public class Main_10951 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str;
		while ((str = br.readLine()) != null) {
			sb.append(str.charAt(0) - '0' + str.charAt(2) - '0').append("\n");
		}
		System.out.print(sb);
	}
}
