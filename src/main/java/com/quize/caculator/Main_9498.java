package com.quize.caculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author https://st-lab.tistory.com/22
 *
 */
public class Main_9498 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int score = Integer.parseInt(br.readLine());
		//시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
		String result = score >= 90 ? "A" : (80 <= score ? "B": (70 <= score ? "C" : (60 <= score ? "D" : "F"))); 
		System.out.print(result);
	}
}