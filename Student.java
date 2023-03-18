package org.college;

public class Student extends Department {
	
	public void studentName() {
	System.out.println("Gokulram Giridharagopalan");	
}
	
	public void studentDpt() {
		System.out.println("CSE");

	}
	
	public void studentId() {
		System.out.println("217003038");

	}

	public static void main(String[] args) {
		Student su = new Student();
		su.CollegeName();
		su.collegecode();
		su.collegeRank();
		su.deptName();
		su.studentName();
		su.studentId();
		su.studentDpt();

	}

}
