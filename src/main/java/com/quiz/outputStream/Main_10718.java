package com.quiz.outputStream;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
/**
 * 
 * @author https://st-lab.tistory.com/6, https://www.acmicpc.net/problem/10718
 *
 */

public class Main_10718 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write("강한친구 대한육군");
		bw.newLine();
		bw.write("강한친구 대한육군");
		bw.newLine();
		
		bw.flush();
		
		StringBuilder sb = new StringBuilder();
		sb.append("강한친구 대한육군\n");
		sb.append("강한친구 대한육군\n");
		System.out.println(sb);
		
		bw.close();

	}

}
