package com.quize.compare.Q10818;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_10818_v2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		StringTokenizer st =  new StringTokenizer(br.readLine()," ");
		br.close();
		int min = Integer.parseInt(st.nextToken());
		int max = min;
		while(st.hasMoreTokens()) {
			int target = Integer.parseInt(st.nextToken());
			min = Math.min(min,target);
			max = Math.max(max,target);
		}
		System.out.print(min + " " + max);
	}

}
