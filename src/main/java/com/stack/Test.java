package com.stack;

import java.util.Comparator;

/**
 * 
 * @author https://st-lab.tistory.com/174
 *
 */
public class Test {

	public static void main(String[] args) {
		Stack<Student> stack = new Stack<>();

		stack.push(new Student("김자바", 92));
		stack.push(new Student("이시플", 72));
		stack.push(new Student("조시샵", 98));
		stack.push(new Student("파이손", 51));

		stack.sort(customComp);

		for (Object a : stack.toArray()) {
			System.out.println(a);
		}

	}

	static Comparator<Student> customComp = new Comparator<Student>() {
		public int compare(Student o1, Student o2) {
			return o2.score - o1.score;
		}
	};
}

class Student {
	String name;
	int score;

	Student(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public String toString() {
		return "이름 : " + name + "\t성적 : " + score;
	}
}
