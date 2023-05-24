package com.quize.caculator.Q2908;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2908 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] inputArr = br.readLine().split(" ");
		int num1 = Integer.parseInt(inputArr[0]);
		int num2 = Integer.parseInt(inputArr[1]);

		int reversNum1 = (num1 % 10) * 100 + (num1 % 100 / 10) * 10 + (num1 / 100);
		int reversNum2 = (num2 % 10) * 100 + (num2 % 100 / 10) * 10 + (num2 / 100);
		
		System.out.print(Math.max(reversNum1, reversNum2));

	}

}
