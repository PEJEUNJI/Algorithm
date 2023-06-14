package com.quiz.caculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 
 * @author https://www.acmicpc.net/problem/1712
 *
 */
public class Main_1712 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int fixedCost = Integer.parseInt(st.nextToken());
		int variableCost = Integer.parseInt(st.nextToken());
		int sellingPrice = Integer.parseInt(st.nextToken());

		if(variableCost < sellingPrice) {
			//Need to find a point time for profit, so +1
			System.out.println(fixedCost / (sellingPrice - variableCost) +1);
		}else {
			System.out.println(-1);
		}
	}
}
