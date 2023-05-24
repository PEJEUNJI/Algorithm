package com.quize.caculator.Q2908;

import java.io.IOException;

public class Main_2909_v3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int num1 = System.in.read() - 48 + ((System.in.read() - 48) * 10) + ((System.in.read() - 48) * 100);
		System.in.read();
		int num2 = System.in.read() - 48 + ((System.in.read() - 48) * 10) + ((System.in.read() - 48) * 100);
		System.out.print(Math.max(num1, num2));
	}

}
