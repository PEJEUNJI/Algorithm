package com.quize.compare.Q3052;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_3052_v2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean arr[] = new boolean[42]; 
		for(int i = 0; i < 10; i++) {
			arr[Integer.parseInt(br.readLine())%42] = true;
		}
		br.close();
		
		int cnt = 0;
		
		for(boolean result : arr) {
			if(result)cnt++;
		}
		System.out.print(cnt);
	}

}
