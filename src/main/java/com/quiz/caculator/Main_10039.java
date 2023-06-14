package com.quiz.caculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_10039 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int total = 0;
		for(int i = 0; i < 5; i++) {
			int oriScore = Integer.parseInt(br.readLine());
			total += oriScore < 40 ? 40 : oriScore;
		}
		br.close();
		System.out.print(total/5);
	}

}
