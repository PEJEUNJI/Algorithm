package com.quize.Strings.Q1316;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

/**
 * 
 * @author https://www.acmicpc.net/problem/1316
 *
 */
public class Main_1316_v3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int line = Integer.parseInt(br.readLine());
		int result = 0;
		for (int i = 0; i < line; i++) {
			String str = br.readLine();
			result += lenthWithoutDup(str) ? 1 : 0;
		}
		br.close();
		System.out.print(result);
	}

	public static boolean lenthWithoutDup(String str) {
		HashSet<Character> target = new HashSet<Character>();
		char preCh = 0;
		for(char c : str.toCharArray()) {
			if(target.contains(c) && c!= preCh) {
				return false;
			}
			preCh = c;
			target.add(c);
		}
		return true;
	}
}