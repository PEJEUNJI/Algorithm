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
		bw.write("����ģ�� ��������");
		bw.newLine();
		bw.write("����ģ�� ��������");
		bw.newLine();
		
		bw.flush();
		
		StringBuilder sb = new StringBuilder();
		sb.append("����ģ�� ��������2\n");
		sb.append("����ģ�� ��������2");
		System.out.println(sb);
		
		StringBuffer sb2 = new StringBuffer();//StringBuffer�� ����ȭ�� ����
		sb2.append("����ģ�� ��������3\n");
		sb2.append("����ģ�� ��������3");
		System.out.println(sb2);
		
		bw.close();

	}

}
