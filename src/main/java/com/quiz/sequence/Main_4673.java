package com.quiz.sequence;

public class Main_4673 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int scope = 10000;
		boolean allNumbers[] = new boolean[scope+1];
		int sum = 0;
		int target = 0;
		int k = 0;
		try {
			for (k = 1; k <= scope; k++) {
				target = k;
				sum += target;
				while (target / 10 != 0) {
					sum += target % 10; // sum for each number
					target = target/10;
				}
				sum += target % 10;
				if (sum != k && sum <= scope) {
					allNumbers[sum] = true;
				}
				sum = 0;
			}
			StringBuilder sb = new StringBuilder();
			for (int i = 1; i < allNumbers.length; i++) {
				if (!allNumbers[i]) {
					sb.append(i).append("\n");
				}
			}
			System.out.print(sb);
		} catch (Exception e) {
			System.out.print("sum : " + sum + "k : " + k);
		}
	}

}
