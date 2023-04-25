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
		stack.push(new Student2("김자바", 92));
		stack.push(new Student2("이시플", 72));
		stack.push(new Student2("조시샵", 98));
		stack.push(new Student2("파이손", 51));
		
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
		return "이름 : " + name + "\t성적 : " + score;
	}
	@Override
	public int compareTo(Student2 o) {
		// TODO Auto-generated method stub
		return o.score- this.score;
	}
	
}