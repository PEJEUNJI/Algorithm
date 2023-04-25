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

	private static final int DEFAULT_CAPACITY = 10; // �ּ�(�⺻) ũ��
	private static final Object[] EMPTY_ARRAY = {}; // �� �迭

	private Object[] array;
	private int size;

	// ������1 (�ʱ� ���� �Ҵ� X)
	public Stack() {
		this.array = EMPTY_ARRAY;
		this.size = 0;
	}

	// ������2 (�ʱ� ���� �Ҵ� O)
	public Stack(int capacity) {
		this.array = new Object[capacity];
		this.size = 0; // size�� ���(����)�� ������ �ǹ��ϴ� ���̴�. ������ �Ҵ��س��� ���ϰ�� �ٸ� �����̴�.)
	}

	public void resize() {
		// �� �迭�� ��� (capacity is 0)
		// �ּҰ� �ƴ� ���� ���ؾ� �ϱ� ������ Arrays.equals() �޼ҵ带 ���
		if (Arrays.equals(array, EMPTY_ARRAY)) {
			array = new Object[DEFAULT_CAPACITY];
			return;
		}

		int arrayCapacity = array.length;

		// capacity ���� �� ���
		if (size == arrayCapacity) {
			int newCapacity = arrayCapacity * 2;

			// copy array
			array = Arrays.copyOf(array, newCapacity);
			return;
		}
		// capacity ���� �̸����� ��Ұ� �����ϰ� ���� ���
		if (size < (arrayCapacity / 2)) {
			int newCapacity = (arrayCapacity / 2);

			// copy array
			// ������ �ּ� DEFAULT_CAPACITY���� �Ʒ��δ� �������� �ʵ��� �ϱ� ���� ���ο� capacity�� �ּ� capacity �� ū
			// ���� ����
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

		// ������ ��Ҹ� ��ȯ�ϱ� ���� �ӽ� ����
		@SuppressWarnings("unchecked") // ClassCastException ������ �����ϰڴٴ� ��
		E obj = (E) array[size - 1];
		// ��� ����
		array[size - 1] = null;
		size--; // ������ 1 ����
		resize(); // capacity ���Ҵ�

		return obj;
	}

	@SuppressWarnings("unchecked")
	@Override
	public E peek() {
		// TODO Auto-generated method stub
		if (size == 0) {
			throw new EmptyStackException();
		}
		// �׻� ������ ������ �ε����� size ���� 1 �۴�
		return (E) array[size - 1];
	}

	// ���� �����ڸ� Top���κ��� �������ִ� �Ÿ�.(��, 1���� ����)�������� ǥ�����ڸ� size - index. ��ġ�ϴ� �����͸� ã�� ������
	// ���� -1 �� ��ȯ�Ѵ�.
	@Override
	public int search(Object value) {
		// TODO Auto-generated method stub
		// value�� null�� ���� eqauls(null)�̵Ǿ� null pointer exception�� �߻��� �� ������,== �� null����
		// �����ش�.
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

		// ����Ǿ��ִ� ��� ��Ҹ� null
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
		// ���ο� ������ �迭�� �������־�� ��(���� ��ü�� ���� ���簡 ���� �ʱ� ����)
		cloneStack.array = new Object[size];
		cloneStack.array = Arrays.copyOf(array, size);
		return cloneStack;
	}

	// Stack�� �ִ� ����� ����ŭ ��Ȯ�ϰ� �迭�� ũ�Ⱑ �Ҵ�Ǿ� ��ȯ.
	public Object[] toArray() {
		return Arrays.copyOf(array, size);
	}
	public void sort() {
		/**
		 *  Comparator�� �Ѱ����� �ʴ� ��� �ش� ��ü�� Comparable�� ������
		 *  ���� ����� ����Ѵ�.
		 *  ���� �����Ǿ����� ������ cannot be cast to class java.lang.Comparable
		 *  ������ �߻��Ѵ�.
		 *  ���� �����Ǿ����� ��� null�� �Ķ���͸� �ѱ��
		 *  Arrays.sort()�� ��ü�� compareTo �޼ҵ忡 ���ǵ� ��Ĵ�� �����Ѵ�.
		 */
		sort(null);
	}
	 
	@SuppressWarnings("unchecked")
	public void sort(Comparator<? super E> c) {
		Arrays.sort((E[])array, 0, size, c);
	}
	// ������ �迭(a)�� ���� array�� ��� ����(size)���� ������ size�� �°� a�� ������ ���Ҵ� �ϸ鼭 array�� �ִ� ��� ��Ҹ� �����Ѵ�.
	@SuppressWarnings("unchecked")
	public <T> T[] toArray(T[] a) {
		//������ �迭(a)�� ���� array�� ��� ����(size)���� ������ size�� �°� a�� ������ ���Ҵ� �ϸ鼭 array�� �ִ� ��� ��Ҹ� �����Ѵ�.
		//����Ÿ�Կ� ���ؼ��� ���� �� �ֵ��� �ϱ� ���� copyOf�޼ҵ忡�� Class��� �Ķ���͸� �������� �־��ش�.
		//(a.getClass()) �׷����� Object[] �迭�� ���� �� ���� T[] Ÿ������ ĳ�����Ͽ� ��ȯ.
		if (a.length < size) {
			return (T[]) Arrays.copyOf(array, size, a.getClass());
		}
		//�Ķ���ͷ� ������ �迭�� ũ�Ⱑ ���� Stack�� �ִ� array���� ũ�ٸ� �� �κк��� array�� �ִ� ��Ҹ� �����ؼ� a�迭�� �ְ� ��ȯ���ָ� �ȴ�.
		System.arraycopy(array, 0, a, 0, size);
		return a;
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub

	

	}

}
