package com.quize.compare.Q3052;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_3052 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int arr[] = new int[10]; 
		for(int i = 0; i < 10; i++) {
			arr[i] = Integer.parseInt(br.readLine())%42;
		}
		
		br.close();
		Arrays.sort(arr);
		int cnt = 1;
		for(int j = 0; j < arr.length-1; j++) {
			if(arr[j] != arr[j+1]) cnt++;
		}
		System.out.print(cnt);
	}

}
