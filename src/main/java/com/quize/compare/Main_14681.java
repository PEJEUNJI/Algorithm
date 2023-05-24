package com.quize.compare;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * 
 * @author https://www.acmicpc.net/problem/14681
 *
 */
public class Main_14681 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int first = Integer.parseInt(br.readLine());
		int second = Integer.parseInt(br.readLine());
		br.close();
		int position = 0;
		if(first > 0) {
			position = second > 0 ? 1 : 4;
		} else {
			position = second > 0 ? 2 : 3;
		}
		System.out.print(position);
	}
}