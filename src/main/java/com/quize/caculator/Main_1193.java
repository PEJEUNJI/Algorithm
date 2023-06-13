package com.quize.caculator;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * https://www.acmicpc.net/problem/1193
 */
public class Main_1193 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int target = Integer.parseInt(br.readLine());

		int startNo = 1;
		int endNo = 1;
		int loop = 1;
		int topNo = 1;
		int bottomNo = 1;
		// to find please of target
		if (target != 1) {
			while (!(startNo <= target && target <= endNo)) {
				loop++;
				startNo = endNo + 1;
				endNo = endNo + loop;
			}
		}
		//If odd , topNo start from loop
		if(loop%2 != 0) {
			topNo = loop;
			while (startNo != target) {
				startNo++;
				topNo--;
				bottomNo++;
			}
		//If even , bottomNo start from loop
		}else {
			bottomNo = loop;
			while (startNo != target) {
				startNo++;
				topNo++;
				bottomNo--;
			}
		}
		System.out.print(topNo + "/" + bottomNo);
	}

}
