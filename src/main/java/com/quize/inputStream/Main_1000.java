package com.quize.inputStream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * 
 * @author https://st-lab.tistory.com/12
 *
 */
public class Main_1000 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		Scanner in = new Scanner(System.in); //System.in �� �Է��� ���� Byte ������ �д� ���� ���Ѵ�.
//		int A = in.nextInt();
//		int B = in.nextInt();
//		System.out.print(A+B);
//		in.close();
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String str =  br.readLine();
//		StringTokenizer st = new StringTokenizer(str," ");
//		int a = Integer.parseInt(st.nextToken());
//		int b = Integer.parseInt(st.nextToken());
//		System.out.print(a+b);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);
		System.out.print(a+b);
		
		
	}

}
