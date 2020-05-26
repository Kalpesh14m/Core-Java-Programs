/*object gets the memory in heap memory area. 
 * The reference variable refers to the object allocated in the heap memory area. 
 * Here, s1 and s2 both are reference variables that refer to the objects allocated in memory.
*/

package com.java.kalpesh.objectandclass;

class Student1 {
	int rollno;
	String name;

	void insertRecord(int r, String n) {
		rollno = r;
		name = n;
	}

	void displayInformation() {
		System.out.println(rollno + " " + name);
	}
}

class InitializationThroughMethod {
	public static void main(String args[]) {
		Student1 s1 = new Student1();
		Student1 s2 = new Student1();
		s1.insertRecord(111, "Kalpesh");
		s2.insertRecord(222, "Jayesh");
		s1.displayInformation();
		s2.displayInformation();
	}
}