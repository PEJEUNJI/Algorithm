package com.stack;

/**
 * 
 * @author https://st-lab.tistory.com/173
 *
 */
public class Stack {
	public interface StackInterface<E>{
		E push(E item);// 스택 맨 위에 요소를 추가
		E pop(); //스택 맨 위의 요소를 제거 후 요소를 반환
		E peek(); //스택맨 위에 있는 요소를 제거 하지 않고 반환
		
		/*
		 *         ________
		 * idx 3   | a    |
		 *         |______|   search("w")
		 *         | e    |   --> 상단(idx 3)으로 부터 3번 째에 위치 
		 * idx 2   |______|       == return 되는 값 : 3
		 *         | w    |
		 * idx 1   |______| 
		 *         | k    |
		 * idx 0   |______|
		 * 
		 */ 
		int search(Object value);//스택의 상단부터 비교하면서 요소와 일치하는 위치를 반환, 일치하는 요소가 없을시 -1
		int size(); //스택에 있는 요소 개수를 반환
		void clear(); //스택에 있는 모든 요소를 삭제
		boolean empty();//스택에 요소가 없는 경우 true, 그 외는 false
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
