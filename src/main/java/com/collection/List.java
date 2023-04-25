package com.collection;
/**
 * 
 * @author https://st-lab.tistory.com/161
 *
 */
public interface List<E>{
		boolean add(E value); //����Ʈ�� ��Ҹ� �߰��Ѵ�, �ߺ��� ������� �ʴ� ����Ʈ�� ��� �ߺ��� ��Ұ� ������ false �ƴϸ� true
		void add(int index, E value); //����Ʈ�� ��Ҹ� Ư�� ��ġ�� �߰��ϰ�, ������ ��ҵ��� ��ĭ�� �ڷ� �и�
		E remove(int index); //����Ʈ�� index ��ġ�� �ִ� ��Ҹ� �����ϰ�, ������ ��Ҹ� ��ȯ
		E get(int index); //����Ʈ�� �ִ� Ư�� ��ġ�� ��Ҹ� ��ȯ�Ѵ�.
		void set(int index, E value); //����Ʈ���� Ư�� ��ġ�� �ִ� ��Ҹ� �� ��ҷ� ��ü
		boolean contains(Object value);//����Ʈ�� Ư�� ��Ұ� �ִ��� ���� Ȯ��, �����ϸ� true �ƴϸ� false
		int indexOf(Object value);//����Ʈ�� Ư����Ұ� ���° ��ġ�� �ִ��� Ȯ��, ������ -1��ȯ
		int size();//����Ʈ�� �ִ� ����� ������ ��ȯ
		boolean isEmpty();//����Ʈ�� ��Ұ� ������� ��ȯ, ������ true,������ false
		public void clear();//����Ʈ�� �ִ� ��� ��Ҹ� ���� 
}
