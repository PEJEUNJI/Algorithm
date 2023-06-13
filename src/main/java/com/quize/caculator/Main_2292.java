package com.quize.caculator;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @param https://www.acmicpc.net/problem/2292
 */
public class Main_2292 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int target = Integer.parseInt(br.readLine());
		int startNo = 2;
		int loop = 1;
		int endNo = loop * 6 - 1 + startNo;

		if (target == 1) {
			System.out.print(1);
		} else {
			while (!(startNo <= target && target <= endNo)) {
				startNo = endNo + 1;
				loop++;
				endNo = loop * 6 - 1 + startNo;
			}
			System.out.print(loop + 1);
		}

	}

}
