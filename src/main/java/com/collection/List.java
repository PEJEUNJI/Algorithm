package com.collection;
/**
 * 
 * @author https://st-lab.tistory.com/161
 *
 */
public interface List<E>{
		boolean add(E value); //리스트에 요소를 추가한다, 중복을 허용하지 않는 리스트의 경우 중복된 요소가 있으면 false 아니면 true
		void add(int index, E value); //리스트에 요소를 특정 위치에 추가하고, 이후의 요소들은 한칸씩 뒤로 밀림
		E remove(int index); //리스트의 index 위치에 있는 요소를 삭제하고, 삭제된 요소를 반환
		E get(int index); //리스트에 있는 특정 위치의 요소를 반환한다.
		void set(int index, E value); //리스트에서 특정 위치에 있는 요소를 새 요소로 대체
		boolean contains(Object value);//리스트에 특정 요소가 있는지 여부 확인, 존재하면 true 아니면 false
		int indexOf(Object value);//리스트에 특정요소가 몇번째 위치에 있는지 확인, 없으면 -1반환
		int size();//리스트에 있는 요소의 개수를 반환
		boolean isEmpty();//리스트에 요소가 비었는지 반환, 없으면 true,있으면 false
		public void clear();//리스트에 있는 모든 요소를 삭제 
}
