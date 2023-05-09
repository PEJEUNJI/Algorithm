package com.quize.inputStream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * 
 * @author https://st-lab.tistory.com/20, https://www.acmicpc.net/problem/2588
 *
 */
public class Main_2588 {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//CASE 1 : USING charAt
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String str2 = br.readLine();
		br.close();
		int a  = Integer.parseInt(str);
		
		StringBuilder sb = new StringBuilder();
		sb.append(a * (str2.charAt(2)-'0')).append("\n");
		sb.append(a * (str2.charAt(1)-'0')).append("\n");
		sb.append(a * (str2.charAt(0)-'0')).append("\n");
		sb.append(a * Integer.parseInt(str2)).append("\n");
		
		System.out.println(sb);
		
		//CASE 2
		int b  = Integer.parseInt(str2);
		StringBuilder sb2 = new StringBuilder();
		sb2.append(a * (b%10)).append("\n");
		sb2.append(a * (b/10%10)).append("\n");
		sb2.append(a * (b/100)).append("\n");
		sb2.append(a * b).append("\n");
		System.out.println(sb2);
		
		//CASE3
		char[] c =  str2.toCharArray();
		
		StringBuilder sb3 = new StringBuilder();
		sb3.append(a * (c[2]-'0')).append("\n");
		sb3.append(a * (c[1]-'0')).append("\n");
		sb3.append(a * (c[0]-'0')).append("\n");
		sb3.append(a * Integer.parseInt(str2)).append("\n");
		
		System.out.println(sb3);
		
	}

}
