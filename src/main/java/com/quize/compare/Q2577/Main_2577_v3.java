package com.quize.compare.Q2577;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * 
 * @author https://st-lab.tistory.com/45
 *
 */
public class Main_2577_v3 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		br.close();
		int result = a*b*c;
		int arr[] = new int[10];
		while(result != 0) {
			arr[result%10]++;
			result = result/10;
		}
		StringBuilder sb = new StringBuilder();
		for(int j : arr) {
			sb.append(j).append("\n");
		}
		System.out.print(sb);
	}

}
