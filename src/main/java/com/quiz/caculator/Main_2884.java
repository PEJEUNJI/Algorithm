package com.quiz.caculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/**
 * 
 * @author https://www.acmicpc.net/problem/2884, https://st-lab.tistory.com/24
 *
 */

public class Main_2884 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		br.close();
		int inputHour = Integer.parseInt(st.nextToken());
		int inputMinute = Integer.parseInt(st.nextToken());
		int outputHour, outputMinute;
		
		if(inputMinute >= 45) {
			outputMinute = inputMinute - 45; outputHour = inputHour;
		} else { 
			outputMinute = inputMinute + 60 - 45; 
			outputHour = inputHour > 0 ?  inputHour - 1 : inputHour + 24-1;
		}
		System.out.print(outputHour +" "+ outputMinute);
	}
}
