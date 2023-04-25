package com.collection;

import java.util.Arrays;

/**
 @author https://st-lab.tistory.com/161
 * @param <E>
 */

public class ArrayList<E> implements List<E>{
	
	private static final Object[] EMPTY_ARRAY = {}; //빈배열
	private static final int DEFAULT_CAPACITY = 10; //최소 (기본)capacity  크기
	
	private int size;//요소 개수 
	Object[] array; //요소를 담을 배열
	//생성자1 (초기 공간 할당x)
	public ArrayList() {
		this.array  = EMPTY_ARRAY;
		this.size = 0;
	}
	//생성자2 (초기 공간 할당 o)
	public ArrayList(int capacity) {
		this.array = new Object[capacity];
		this.size = 0; //요소의 개수를 의미, 공간을 할당하는 의미와는 다른 개념
	}
	
	private void resize() {
		int array_capacity = array.length;
		
		/**if array's capacity is 0 생성자에서 capacity 가 별도로 설정되어 있지 않은 경우 capacity 가 0 임으로, 
		 * default capacity사이즈인 DEFAULT_CAPACITY로 할당**/ 
		if(Arrays.equals(array, EMPTY_ARRAY)) {//주소가 아닌 값을 비교하기 위해 Arrays.equals 사용
			array = new Object[DEFAULT_CAPACITY]; //default 사이즈만큼 배열을 생성하고 종료
			return;
		}
		
		// 용량이 꽉 찬 경우
		if(size == array_capacity) {
			int new_capacity = array_capacity * 2; //default로 용량이 없는 경우 2배 확장
			array = Arrays.copyOf(array,new_capacity);
			return;
		}
		
		//capacity의 절반 미만으로 요소가 있는 경우 
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
		
		// index가 마지막 위치라면 addLast 메소드로 요소추가
		if(index == size) {
			addLast(value);
		} else {
			// 꽉차있다면 capacity 재할당
			if(size == array.length) {
				resize();
			}
			// index 기준 후자에 있는 모든 요소를 뒤에서부터 한칸씩 뒤로 밀기
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
		
		//삭제될 요소를 반환하기 위해서 임시로 담아둠
		E element = (E)array[index];
		array[index] = null;
		
		for (int i = index; i < size-1; i++) { // 항상 마지막 원소의 인덱스는 size 보다 1 작다. 이후의 배열 요소들을 한 칸씩 당겨울 때 시작점과 끝 점을 잘 생각
			array[i] = array[i+1];
			array[i+1] = null;//한 명시적으로 요소를 null로 처리해주어야 가비지컬렉터에 의해 더이상 쓰지 않는 데이터의 메모리를 수거(반환)해주기 때문에 최대한 null 처리를 하는 것이 좋다.
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

	@SuppressWarnings("unchecked") //변환시 예외 가능성이 없을 확실한 경우
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
		return size == 0; //요소가 0개일 경우 비어있다는 의미이므로 true반환
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
		
		// 새로운 객체의 배열도 생성해주어야 함 (객체는 얕은복사가 되기 때문)
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
