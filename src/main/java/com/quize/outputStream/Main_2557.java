package com.quize.outputStream;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * 
 * @author https://st-lab.tistory.com/2, https://st-lab.tistory.com/6
 *
 */
public class Main_2557 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		StringBuilder sb = new StringBuilder();
		sb.append("Hello World2");
		System.out.println(sb);
		
		StringBuffer sb2 = new StringBuffer(); //StringBuffer은 동기화를 지원
		sb2.append("Hello World3");
		System.out.println(sb2);
		
		// OutputStreamWriter()문자 스트림을 바이트 스트림으로 변환해주는 스트림
		OutputStreamWriter wr = new OutputStreamWriter(System.out); //공간(버퍼)에 저장해두었다가 한 번에 출력 또는 데이터를 보내는 방식
		// BufferedWriter 는 시스템의 버퍼를 이용하여 출력하는 문자 스트림 (캐릭터 단위 스트림)
		BufferedWriter bw = new BufferedWriter(wr);
		
		bw.write("Hello World");
		//bw.flush() 로 스트림에 들어있는 데이터를 비운다
		bw.flush();
		bw.close();

	}

}
