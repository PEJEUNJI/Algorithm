package com.stack;

import java.util.Arrays;
import java.util.Comparator;
import java.util.EmptyStackException;
import java.util.Objects;

/**
 * 
 * @author https://st-lab.tistory.com/173 https://st-lab.tistory.com/174
 *
 */
public class Stack<E> implements StackInterface<E>, Cloneable {

	private static final int DEFAULT_CAPACITY = 10; // 최소(기본) 크기
	private static final Object[] EMPTY_ARRAY = {}; // 빈 배열

	private Object[] array;
	private int size;

	// 생성자1 (초기 공간 할당 X)
	public Stack() {
		this.array = EMPTY_ARRAY;
		this.size = 0;
	}

	// 생성자2 (초기 공간 할당 O)
	public Stack(int capacity) {
		this.array = new Object[capacity];
		this.size = 0; // size는 요소(원소)의 개수를 의미하는 것이다. 공간을 할당해놓는 것하고는 다른 개념이다.)
	}

	public void resize() {
		// 빈 배열일 경우 (capacity is 0)
		// 주소가 아닌 값을 비교해야 하기 때문에 Arrays.equals() 메소드를 사용
		if (Arrays.equals(array, EMPTY_ARRAY)) {
			array = new Object[DEFAULT_CAPACITY];
			return;
		}

		int arrayCapacity = array.length;

		// capacity 가득 찰 경우
		if (size == arrayCapacity) {
			int newCapacity = arrayCapacity * 2;

			// copy array
			array = Arrays.copyOf(array, newCapacity);
			return;
		}
		// capacity 절반 미만으로 요소가 차지하고 있을 경우
		if (size < (arrayCapacity / 2)) {
			int newCapacity = (arrayCapacity / 2);

			// copy array
			// 설정한 최소 DEFAULT_CAPACITY보다 아래로는 떨어지지 않도록 하기 위해 새로운 capacity과 최소 capacity 중 큰
			// 것을 설정
			array = Arrays.copyOf(array, Math.max(newCapacity, DEFAULT_CAPACITY));
			return;
		}

	}

	@Override
	public E push(E item) {
		// TODO Auto-generated method stub

		if (size == array.length) {
			resize();
		}
		array[size] = item;
		size++;

		return item;
	}

	@Override
	public E pop() {
		// TODO Auto-generated method stub

		if (size == 0) {
			throw new EmptyStackException();
		}

		// 삭제될 요소를 반환하기 위한 임시 변수
		@SuppressWarnings("unchecked") // ClassCastException 경고들을 무시하겠다는 것
		E obj = (E) array[size - 1];
		// 요소 삭제
		array[size - 1] = null;
		size--; // 사이즈 1 감소
		resize(); // capacity 재할당

		return obj;
	}

	@SuppressWarnings("unchecked")
	@Override
	public E peek() {
		// TODO Auto-generated method stub
		if (size == 0) {
			throw new EmptyStackException();
		}
		// 항상 마지막 원소의 인덱스는 size 보다 1 작다
		return (E) array[size - 1];
	}

	// 쉽게 말하자면 Top으로부터 떨어져있는 거리.(단, 1부터 시작)수식으로 표현하자면 size - index. 일치하는 데이터를 찾지 못했을
	// 경우는 -1 을 반환한다.
	@Override
	public int search(Object value) {
		// TODO Auto-generated method stub
		// value가 null일 때는 eqauls(null)이되어 null pointer exception이 발생할 수 있으니,== 로 null값을
		// 비교해준다.
		for (int i = 0; i < size(); i++) {
			if (Objects.equals(array[i], value)) {
				return size - i;
			}
		}
		return -1;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub

		// 저장되어있던 모든 요소를 null
		for (int i = 0; i < size; i++) {
			array[i] = null;
		}
		size = 0;
		resize();
	}

	@Override
	public boolean empty() {
		// TODO Auto-generated method stub
		return size == 0;
	}

	public Object clone() throws CloneNotSupportedException {
		// new stack object
		Stack<?> cloneStack = (Stack<?>) super.clone();
		// 새로운 스택의 배열도 생성해주어야 함(내부 객체는 깊은 복사가 되지 않기 때문)
		cloneStack.array = new Object[size];
		cloneStack.array = Arrays.copyOf(array, size);
		return cloneStack;
	}

	// Stack에 있는 요소의 수만큼 정확하게 배열의 크기가 할당되어 반환.
	public Object[] toArray() {
		return Arrays.copyOf(array, size);
	}
	public void sort() {
		/**
		 *  Comparator를 넘겨주지 않는 경우 해당 객체의 Comparable에 구현된
		 *  정렬 방식을 사용한다.
		 *  만약 구현되어있지 않으면 cannot be cast to class java.lang.Comparable
		 *  에러가 발생한다.
		 *  만약 구현되어있을 경우 null로 파라미터를 넘기면
		 *  Arrays.sort()가 객체의 compareTo 메소드에 정의된 방식대로 정렬한다.
		 */
		sort(null);
	}
	 
	@SuppressWarnings("unchecked")
	public void sort(Comparator<? super E> c) {
		Arrays.sort((E[])array, 0, size, c);
	}
	// 들어오는 배열(a)가 현재 array의 요소 개수(size)보다 작으면 size에 맞게 a의 공간을 재할당 하면서 array에 있던 모든 요소를 복사한다.
	@SuppressWarnings("unchecked")
	public <T> T[] toArray(T[] a) {
		//들어오는 배열(a)가 현재 array의 요소 개수(size)보다 작으면 size에 맞게 a의 공간을 재할당 하면서 array에 있던 모든 요소를 복사한다.
		//상위타입에 대해서도 담을 수 있도록 하기 위해 copyOf메소드에서 Class라는 파라미터를 마지막에 넣어준다.
		//(a.getClass()) 그런다음 Object[] 배열로 리턴 된 것을 T[] 타입으로 캐스팅하여 반환.
		if (a.length < size) {
			return (T[]) Arrays.copyOf(array, size, a.getClass());
		}
		//파라미터로 들어오는 배열의 크기가 현재 Stack에 있는 array보다 크다면 앞 부분부터 array에 있던 요소만 복사해서 a배열에 넣고 반환해주면 된다.
		System.arraycopy(array, 0, a, 0, size);
		return a;
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub

	

	}

}
