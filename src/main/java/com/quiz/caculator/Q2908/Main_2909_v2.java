package com.quiz.caculator.Q2908;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2909_v2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] inputArr = br.readLine().split(" ");
		br.close();
		int reversNum1 = Integer.parseInt(new StringBuilder().append(inputArr[0]).reverse().toString());
		int reversNum2 = Integer.parseInt(new StringBuilder().append(inputArr[1]).reverse().toString());
		
		System.out.print(Math.max(reversNum1, reversNum2));

	}

}
