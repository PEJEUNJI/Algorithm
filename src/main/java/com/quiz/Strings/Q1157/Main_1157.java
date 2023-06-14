package com.quiz.Strings.Q1157;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_1157 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] word = br.readLine().toUpperCase().toCharArray();
		br.close();
		int compare[] = new int[26];

		for (int i : word) {
			compare[i - 'A']++;
		}

		int max = 0;
		int cnt = 0;
		int index = 0;
		for (int i = 0; i < compare.length; i++) {
			if (compare[i] > max) {
				max = compare[i];
				index = i;
				cnt = 1;
			} else if (compare[i] > 0 && compare[i] == max){
				cnt++;
			}
		}

		if (cnt > 1) {
			System.out.print("?");
		} else {
			System.out.print((char)(index + 'A'));
		}
	}

}
