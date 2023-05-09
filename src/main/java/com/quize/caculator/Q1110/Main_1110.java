package com.quize.caculator.Q1110;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_1110 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int loop = 0;
		int n = Integer.parseInt(br.readLine());
		br.close();
		int N_10 = (n / 10);
		int N_1 = (n % 10);
		int sum = N_10 + N_1;
		do{
			loop++;
			N_10 = N_1;
			N_1 = sum >= 10 ? (sum % 10) : sum;
			sum = N_10 + N_1;
		}while(n != (N_10 * 10) + N_1);
		System.out.print(loop); 
	}
}
