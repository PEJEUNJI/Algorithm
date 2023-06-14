package com.quiz.compare;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_5543 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int BugerMin = Integer.parseInt(br.readLine());
		for (int i = 0; i < 2; i++) {
			BugerMin = Math.min(BugerMin,Integer.parseInt(br.readLine()));
		}
		System.out.print(Math.min(Integer.parseInt(br.readLine()), Integer.parseInt(br.readLine())) + BugerMin - 50);
		br.close();
	}

}
