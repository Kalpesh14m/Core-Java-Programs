/* If there is ambiguity between the instance variables and parameters, this keyword resolves the problem of ambiguity.
 * 
 * If local variables(formal arguments) and instance variables are different, there is no need to use this keyword.
 * 
 * It is better approach to use meaningful names for variables. So we use same name for instance variables and parameters in real time, and always use this keyword.
 * */

package com.java.kalpesh.thiskeyword;

class Student {
	int rollno;
	String name;
	float fee;

	Student(int rollno, String name, float fee) {
		rollno = rollno;
		name = name;
		fee = fee;
	}

	Student(float fee, int rollno, String name) {
		this.rollno = rollno;
		this.name = name;
		this.fee = fee;
	}

	void display() {
		System.out.println(rollno + " " + name + " " + fee);
	}
}

class ReferCurrentClassInstanceVariable {
	public static void main(String args[]) {
		Student s1 = new Student(111, "ankit", 5000f);
		Student s2 = new Student(6000f, 112, "sumit");
		s1.display();
		s2.display();
	}
}