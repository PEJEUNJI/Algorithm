package com.quiz.caculator.Q1193;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_1193_V2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int target = Integer.parseInt(br.readLine());
		br.close();

		
		// to find please of target
		if (target == 1) {
			System.out.print("1/1");
			return;
		}
		
		Fraction fraction = findFraction(target);
		System.out.print(fraction.toString());
	}
	private static Fraction findFraction(int target) {
		int startNo = 1;
		int endNo = 1;
		int loop = 1;
		int numerator = 1;
		int denominator = 1;
		// to find please of target
		if (target != 1) {
			while (!(startNo <= target && target <= endNo)) {
				loop++;
				startNo = endNo + 1;
				endNo = endNo + loop;
			}
		}
		// If odd , topNo start from loop
		if (loop % 2 != 0) {
			numerator = loop;
			while (startNo != target) {
				startNo++;
				numerator--;
				denominator++;
			}
			// If even , bottomNo start from loop
		} else {
			denominator = loop;
			while (startNo != target) {
				startNo++;
				numerator++;
				denominator--;
			}
		}
		return new Fraction(numerator,denominator);
	}

	private static class Fraction {
		private int numerator;
		private int denominator;

		public Fraction(int numerator, int denominator) {
			this.numerator = numerator;
			this.denominator = denominator;
		}

		public String toString() {
			return numerator + "/" + denominator;
		}
	}
}
