package com.quiz.outputStream;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * 
 * @author https://st-lab.tistory.com/2, https://st-lab.tistory.com/6, https://www.acmicpc.net/problem/2557
 *
 */
public class Main_2557 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		StringBuilder sb = new StringBuilder();
		sb.append("Hello World2");
		System.out.println(sb);
		
		StringBuffer sb2 = new StringBuffer(); 
		sb2.append("Hello World3");
		System.out.println(sb2);
		
		OutputStreamWriter wr = new OutputStreamWriter(System.out); 
		BufferedWriter bw = new BufferedWriter(wr);
		
		bw.write("Hello World");
		bw.flush();
		bw.close();

	}

}
