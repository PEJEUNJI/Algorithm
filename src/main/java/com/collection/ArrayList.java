package com.collection;

import java.util.Arrays;

/**
 @author https://st-lab.tistory.com/161
 * @param <E>
 */

public class ArrayList<E> implements List<E>{
	
	private static final Object[] EMPTY_ARRAY = {}; //��迭
	private static final int DEFAULT_CAPACITY = 10; //�ּ� (�⺻)capacity  ũ��
	
	private int size;//��� ���� 
	Object[] array; //��Ҹ� ���� �迭
	//������1 (�ʱ� ���� �Ҵ�x)
	public ArrayList() {
		this.array  = EMPTY_ARRAY;
		this.size = 0;
	}
	//������2 (�ʱ� ���� �Ҵ� o)
	public ArrayList(int capacity) {
		this.array = new Object[capacity];
		this.size = 0; //����� ������ �ǹ�, ������ �Ҵ��ϴ� �ǹ̿ʹ� �ٸ� ����
	}
	
	private void resize() {
		int array_capacity = array.length;
		
		/**if array's capacity is 0 �����ڿ��� capacity �� ������ �����Ǿ� ���� ���� ��� capacity �� 0 ������, 
		 * default capacity�������� DEFAULT_CAPACITY�� �Ҵ�**/ 
		if(Arrays.equals(array, EMPTY_ARRAY)) {//�ּҰ� �ƴ� ���� ���ϱ� ���� Arrays.equals ���
			array = new Object[DEFAULT_CAPACITY]; //default �����ŭ �迭�� �����ϰ� ����
			return;
		}
		
		// �뷮�� �� �� ���
		if(size == array_capacity) {
			int new_capacity = array_capacity * 2; //default�� �뷮�� ���� ��� 2�� Ȯ��
			array = Arrays.copyOf(array,new_capacity);
			return;
		}
		
		//capacity�� ���� �̸����� ��Ұ� �ִ� ��� 
		if(size < (array_capacity / 2)) {
			int new_capacity = array_capacity / 2;
			array = Arrays.copyOf(array, Math.max(new_capacity, DEFAULT_CAPACITY));
			return;
		}
		
	}
	
	public void addLast(E value) {
		// size check
		if(size == array.length) {
			resize();
		}
		// add to last index
		array[size]  = value;
		size++;
	}
	
	public void addFirst(E value) {
		add(0, value);
	}
	@Override
	public boolean add(E value) {
		addLast(value);
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void add(int index, E value) {
		// TODO Auto-generated method stub
		if(index > size || index < 0) {
			throw new IndexOutOfBoundsException();
		}
		
		// index�� ������ ��ġ��� addLast �޼ҵ�� ����߰�
		if(index == size) {
			addLast(value);
		} else {
			// �����ִٸ� capacity ���Ҵ�
			if(size == array.length) {
				resize();
			}
			// index ���� ���ڿ� �ִ� ��� ��Ҹ� �ڿ������� ��ĭ�� �ڷ� �б�
			for(int i = size; i > index; i--) {
				array[i] = array[i-1];
				array[i-1] = null;
			}
			
			array[index] = value;
			size++;
		}
		
	}

	@Override
	public E remove(int index) {
		// TODO Auto-generated method stub
		
		if(index >= size || index < 0) {
			throw new IndexOutOfBoundsException();
		}
		
		//������ ��Ҹ� ��ȯ�ϱ� ���ؼ� �ӽ÷� ��Ƶ�
		E element = (E)array[index];
		array[index] = null;
		
		for (int i = index; i < size-1; i++) { // �׻� ������ ������ �ε����� size ���� 1 �۴�. ������ �迭 ��ҵ��� �� ĭ�� ��ܿ� �� �������� �� ���� �� ����
			array[i] = array[i+1];
			array[i+1] = null;//�� ��������� ��Ҹ� null�� ó�����־�� �������÷��Ϳ� ���� ���̻� ���� �ʴ� �������� �޸𸮸� ����(��ȯ)���ֱ� ������ �ִ��� null ó���� �ϴ� ���� ����.
		}
		size--;
		resize();
		return element;
	}
	
	public boolean remove(E value) {
		
		int index = indexOf(value);
		if(index == -1) {
			return false;
		}
		remove(index);
		return true;
	}

	@SuppressWarnings("unchecked") //��ȯ�� ���� ���ɼ��� ���� Ȯ���� ���
	@Override
	public E get(int index) {
		// TODO Auto-generated method stub
		if(index >= size || index < 0) {
			throw new IndexOutOfBoundsException();
		}
		return (E)array[index];
	}

	@Override
	public void set(int index, E value) {
		// TODO Auto-generated method stub
		if(index >= size || index < 0) {
			throw new IndexOutOfBoundsException();
		}else {
			array[index] = value;
		}
	}

	@Override
	public boolean contains(Object value) {
		// TODO Auto-generated method stub
		if(indexOf(value) > 0) {
			return true;
		}
		return false;
	}

	@Override
	public int indexOf(Object value) {
		// TODO Auto-generated method stub
		for(int i = 0; i < size; i++) {
			if(array[i].equals(value)){
				return i;
			}
		}
		return -1;
	}
	public int lastIndexOf(Object value) {
		for(int i = size-1; i >= 0; i--) {
			if(array[i].equals(value)){
				return i;
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
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return size == 0; //��Ұ� 0���� ��� ����ִٴ� �ǹ��̹Ƿ� true��ȯ
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		for(int i=0; i < size; i++) {
			array[i] = null;
		}
		size = 0;
		resize();
	}
	public Object clone() throws CloneNotSupportedException{
		// new object
		ArrayList<?> cloneList = (ArrayList<?>)super.clone();
		
		// ���ο� ��ü�� �迭�� �������־�� �� (��ü�� �������簡 �Ǳ� ����)
		cloneList.array = new Object[size];
		
//		cloneList.array = Arrays.copyOf(array, size);
		System.arraycopy(array, 0, cloneList.array, 0, size);
		
		return cloneList;
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
//		Integer testList[] = {1,2,3,5,6,7,8};
		ArrayList<Integer> list = new ArrayList<Integer>(DEFAULT_CAPACITY);
		for(int i = 0; i < DEFAULT_CAPACITY; i++) {
			list.addLast(i+1);
		}
		//list.add(3,0);
		list.add(0,0);
		list.remove(10);
		list.remove(list.get(0));
//		list.clear();
		for(int i=0; i < list.size(); i++) {
			System.out.print(list.get(i) + ",");
		}
	
	}

	

}
