package com.quize.Strings.Q11654;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * @author https://www.acmicpc.net/problem/11654
 */
public class Main_11654_v2 {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		int sum = 0;
		for (byte num : br.readLine().getBytes()) {
			sum += num - '0';
		}
		System.out.print(sum);
	}

}
