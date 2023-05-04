package com.quize.repeat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
/**
 * https://st-lab.tistory.com/25
 */
public class Main_10817 {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		br.close();
		StringTokenizer st = new StringTokenizer(str," ");
		
		int[] arr = new int[3];
		int temp;
		for(int i= 0 ; i < 3; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		// CASE1
		// 가장 최후의 비교는 마지막 -1 번째 원소와 가장 마지막 원소이므로i 는 배열 길이-1 까지만 반복.
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		// CASE2
		Arrays.sort(arr);
		System.out.print(arr[1]);
	}
}