package com.quize.outputStream;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
/**
 * 
 * @author https://st-lab.tistory.com/6
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
		sb.append("강한친구 대한육군2\n");
		sb.append("강한친구 대한육군2");
		System.out.println(sb);
		
		StringBuffer sb2 = new StringBuffer();//StringBuffer은 동기화를 지원
		sb2.append("강한친구 대한육군3\n");
		sb2.append("강한친구 대한육군3");
		System.out.println(sb2);
		
		bw.close();

	}

}
