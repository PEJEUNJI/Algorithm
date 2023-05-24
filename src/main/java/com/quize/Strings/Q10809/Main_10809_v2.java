package com.quize.Strings.Q10809;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * 
 * @author https://www.acmicpc.net/problem/10809
 *
 */
public class Main_10809_v2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inputValue = br.readLine();
		br.close();
		StringBuilder result = new StringBuilder();
		int alphabet[] = new int[26];
		for (int i = 0; i < 26; i++) {
			alphabet[i] = -1;
		}
		for (int k = 0; k < inputValue.length(); k++) {
			if (alphabet[inputValue.charAt(k) - 97] == -1) {
				alphabet[inputValue.charAt(k) - 97] = k;
			}
		}
		for (int i = 0; i < 26; i++) {
			result.append(alphabet[i]).append(" ");
		}
		System.out.print(result);
	}

}
