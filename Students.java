package org.students;

public class Students {

            public void getStudentInfo(int id) {
            	System.out.println("Student id :"+  id);
			}
            public void getStudentInfo(int id,String name) {
				System.out.println("Student id :" +  id);
				System.out.println("Student Name :" + name);
				}
            public void getStudentInfo(String email,String mobileno) {
            	
            	System.out.println("Student emailid  :" +  email);
            	System.out.println("Student mobileno :" + mobileno);
				}
            

	public static void main(String[] args) {
		Students su = new Students();
		su.getStudentInfo(11231,"Gokul");
		su.getStudentInfo(2343242);
		su.getStudentInfo("gokulram@gmail.com", "9444817175");
}

}
