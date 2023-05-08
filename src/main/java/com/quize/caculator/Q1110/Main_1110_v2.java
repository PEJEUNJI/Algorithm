package com.quize.caculator.Q1110;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_1110_v2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int loop = 0;
		int n = Integer.parseInt(br.readLine());
		br.close();
		int result = n;
		do {
			result = (result%10)*10 + (result/10 + result%10)%10;
			loop++;
		}while(n != result);
		System.out.println(loop);
	}

}
