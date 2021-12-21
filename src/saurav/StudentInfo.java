package saurav;

class StudentInfo{

	String name, middleName, surname, birthdate, address;
	int rollNumber;
	
	void setData(){
		name = "Saurav";
		middleName = "Vikas";
		surname = "Tondare";
		birthdate = "10th Dec 1990";
		address = "H-111, Vishrantvadi, Baner, Pune";
		rollNumber = 12;
	}	
	
	void studentName(){
		System.out.println("Student Name = "+ name);
		System.out.println("Student MiddleName = "+ middleName);
		System.out.println("Student Surname = "+ surname);	
	}

	void  studentOtherDetails(){
		System.out.println("Birthdate = "+ birthdate);
		System.out.println("Address = "+ address);
		System.out.println("Roll no. = "+ rollNumber);
	}

	public static void main(String[] a){
		StudentInfo studentinfo = new StudentInfo();
		studentinfo.setData();
		studentinfo.studentName();
		studentinfo.studentOtherDetails();
	}
}