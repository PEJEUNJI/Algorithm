package com.stack;

/**
 * 
 * @author https://st-lab.tistory.com/173
 *
 */
public class Stack {
	public interface StackInterface<E>{
		E push(E item);// ���� �� ���� ��Ҹ� �߰�
		E pop(); //���� �� ���� ��Ҹ� ���� �� ��Ҹ� ��ȯ
		E peek(); //���ø� ���� �ִ� ��Ҹ� ���� ���� �ʰ� ��ȯ
		
		/*
		 *         ________
		 * idx 3   | a    |
		 *         |______|   search("w")
		 *         | e    |   --> ���(idx 3)���� ���� 3�� °�� ��ġ 
		 * idx 2   |______|       == return �Ǵ� �� : 3
		 *         | w    |
		 * idx 1   |______| 
		 *         | k    |
		 * idx 0   |______|
		 * 
		 */ 
		int search(Object value);//������ ��ܺ��� ���ϸ鼭 ��ҿ� ��ġ�ϴ� ��ġ�� ��ȯ, ��ġ�ϴ� ��Ұ� ������ -1
		int size(); //���ÿ� �ִ� ��� ������ ��ȯ
		void clear(); //���ÿ� �ִ� ��� ��Ҹ� ����
		boolean empty();//���ÿ� ��Ұ� ���� ��� true, �� �ܴ� false
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
