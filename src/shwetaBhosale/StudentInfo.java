package shwetaBhosale;

class StudentInfo{
	String name, middleName, surname, address, birthDate;
	int rollNumber;
	
	void setData(){
		name = "Shikha";
		middleName = "Amit";
		surname = "Patel";
		address = "G-809, Heaven Apartment, Baner, Pune.";
		birthDate = "10th Aug 1998";
		rollNumber  = 34;
	}
	
	void studentName(){
		System.out.println("Student name is: " + name);
		System.out.println("Student MiddleName  is: " + middleName);
		System.out.println("Student Surname is: " + surname);
	} 

	void studentOtherDetails(){
		System.out.println("Student BirthDate is: " + birthDate);
		System.out.println("Student Address is: " + address);
		System.out.println("Student RollNumber is: " + rollNumber);
	}
	
	public static void main(String[] a){
		StudentInfo studentInfo = new StudentInfo();
		studentInfo.setData();
		studentInfo.studentName();
		studentInfo.studentOtherDetails();
	}
}






