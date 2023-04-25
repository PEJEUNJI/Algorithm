package com.stack;

/**
 * 
 * @author https://st-lab.tistory.com/174
 *
 */
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Student2> stack = new Stack<Student2>();
		stack.push(new Student2("���ڹ�", 92));
		stack.push(new Student2("�̽���", 72));
		stack.push(new Student2("���ü�", 98));
		stack.push(new Student2("���̼�", 51));
		
		stack.sort();
		
		for(Object o : stack.toArray() ) {
			System.out.println(o);
		}
	}
}
class Student2 implements Comparable<Student2>{
	String name;
	int score;

	Student2(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public String toString() {
		return "�̸� : " + name + "\t���� : " + score;
	}
	@Override
	public int compareTo(Student2 o) {
		// TODO Auto-generated method stub
		return o.score- this.score;
	}
	
}