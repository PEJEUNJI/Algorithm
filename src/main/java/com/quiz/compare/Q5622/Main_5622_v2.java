package com.quiz.compare.Q5622;

import java.io.IOException;

public class Main_5622_v2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int result = 0;
		while (true) {
			int number = System.in.read();
			if(number == '\n') {
				break;
			}
			number = number - 'A' > 21 ? 9 : number - 'A' > 18 ? 8 : number - 'A' > 14 ? 7 : ((number - 'A') / 3) + 2;
			result += number + 1;
		}
		System.out.print(result);
	}
}