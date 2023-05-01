package com.quize.inputStream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] st = str.split(" ");
		int a  = Integer.parseInt(st[0]);
		int b  = Integer.parseInt(st[1]);
		System.out.print(a-b);
	}
}
