package com.quize.repeat.star.Q10996;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_10996_v2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		br.close();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				sb.append("*");
			}else {
				sb.append(" ");	
			}
		}
		sb.append("\n");
		for (int j = 0; j < n; j++) {
			if (j % 2 == 0) {
				sb.append(" ");
			} else {
				sb.append("*");
			}
		}
		sb.append("\n");
		String str = sb.toString();
		for(int k = 0; k < n-1; k++) {
			sb.append(str);
		}
		System.out.print(sb);
	}

}
