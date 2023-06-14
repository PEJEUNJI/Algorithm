package com.quiz.compare.Q3052;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
/**
 * 
 * @author https://www.acmicpc.net/problem/3052
 *
 */
public class HashSet_3052 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashSet<Integer>  hs = new HashSet<Integer>();
		for(int i = 0; i < 10; i++) {
			hs.add(Integer.parseInt(br.readLine())%42);
		}
		br.close();
		System.out.print(hs.size());
	}

}
