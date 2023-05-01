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
		
		StringBuffer sb2 = new StringBuffer(); //StringBuffer�� ����ȭ�� ����
		sb2.append("Hello World3");
		System.out.println(sb2);
		
		// OutputStreamWriter()���� ��Ʈ���� ����Ʈ ��Ʈ������ ��ȯ���ִ� ��Ʈ��
		OutputStreamWriter wr = new OutputStreamWriter(System.out); //����(����)�� �����صξ��ٰ� �� ���� ��� �Ǵ� �����͸� ������ ���
		// BufferedWriter �� �ý����� ���۸� �̿��Ͽ� ����ϴ� ���� ��Ʈ�� (ĳ���� ���� ��Ʈ��)
		BufferedWriter bw = new BufferedWriter(wr);
		
		bw.write("Hello World");
		//bw.flush() �� ��Ʈ���� ����ִ� �����͸� ����
		bw.flush();
		bw.close();

	}

}
