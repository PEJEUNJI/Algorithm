package com.quize.inputStream;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
/**
 * 
 * @author https://st-lab.tistory.com/41?category=830901
 *
 */

public class Input_Test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		InputStream inputstream = System.in;
		InputStreamReader sr = new InputStreamReader(inputstream);

		char[] c = new char[10];
		sr.read(c);
		for(char val : c) {
			System.out.println(val);
		}

	}

}
