package com.quiz.compare;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * @param https://www.acmicpc.net/problem/2941
 */
public class Main_2941 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inputStr = br.readLine();
		br.close();
		String[] special = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };
		int result = 0;
		int index = 0;
		int length = inputStr.length();
		
		while (index < length) {
			boolean match = false;
			for (String value : special) {
				
				int valueLength = value.length();

			    if (index + valueLength <= length && inputStr.substring(index, index + valueLength).equals(value)) {
                    index += valueLength;
                    match = true;
                    break;
                }
			}
			if (!match) {
				index++;
			}
			result++;
		}
		System.out.print(result);
	}
}