package com.quiz.Strings.Q10809;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**]
 * 
 * @author https://www.acmicpc.net/problem/10809
 *
 */
public class Main_10809 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inputValue = br.readLine();
		br.close();
		StringBuilder result = new StringBuilder();
		char alphabet[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
				's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
		for (int i = 0; i < alphabet.length; i++) {
			for (int k = 0; k < inputValue.length(); k++) {
				if (alphabet[i] == inputValue.charAt(k)) {
					result.append(k).append(" ");
					break;
				} else if (k == inputValue.length() - 1) {
					result.append(-1).append(" ");
				}
			}
		}
		System.out.print(result);
	}

}
