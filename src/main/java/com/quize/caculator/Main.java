package com.quize.caculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
 
	public static void main(String[] args) throws NumberFormatException, IOException {
		int  max = 70;
		double score =  50;
		double result = score/max*100;
		System.out.print(result);
	}
}