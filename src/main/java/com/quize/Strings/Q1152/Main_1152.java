package com.quize.Strings.Q1152;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_1152 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		br.close();
		
		int cnt = 0;
		for(String value : str) {
			cnt += !value.trim().isEmpty() ? 1 : 0;
		}
		System.out.print(cnt);
	}

}
