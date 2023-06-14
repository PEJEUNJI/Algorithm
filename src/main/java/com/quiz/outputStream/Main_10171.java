package com.quiz.outputStream;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * 
 * @author https://st-lab.tistory.com/8, https://www.acmicpc.net/problem/10171
 *
 */
public class Main_10171 {
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write("\\   /\\");
		bw.newLine();
		bw.write(" ) ( ')");
		bw.newLine();
		bw.write("( /  )");
		bw.newLine();
		bw.write("\\(__)|");
		bw.newLine();
		bw.flush();
		bw.close();
		
		StringBuilder sb = new StringBuilder();
		sb.append("\\   /\\\n");
		sb.append(" ) ( ')\n");
		sb.append("( /  )\n");
		sb.append("\\(__)|\\n");
		System.out.print(sb);
	}

}
