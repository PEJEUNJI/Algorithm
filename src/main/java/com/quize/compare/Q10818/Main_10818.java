package com.quize.compare.Q10818;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_10818 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt  = Integer.parseInt(br.readLine());
		StringTokenizer st =  new StringTokenizer(br.readLine()," ");
		br.close();
		int intArr[] = new int[cnt];
		for(int i = 0; i < cnt; i++) {
			intArr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(intArr);
		System.out.print(intArr[0] + " " + intArr[cnt-1]);
	}

}
