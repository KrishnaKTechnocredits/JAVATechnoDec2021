package priyankaZende;
/* Assignment -1 : Program Statement : Print all details of Student like Name, Middle name, Surname, birthdate, Address, and Roll number.*/

class A1_StudentInfoDemo{
	String name, middlename, surname, birthdate, address;
	int rollNumber;
	
	void setData(){
		name = "Shikha"; 
		middlename = "Amit";  
		surname = "Patel";  
		birthdate = "10th Aug 1998";  
		address = "G-809, Heaven Apartment, Baner, Pune."; 
		rollNumber = 34;
	}	

	void studentName(){
		System.out.println("Student First Name is: " + name);
		System.out.println("Student Middle Name is: " + middlename);
		System.out.println("Student Surname is: " + surname);
	}
	
	void studentOtherDetails(){
		System.out.println("Student birthdate is: " + birthdate);
		System.out.println("Student address is: " + address);
		System.out.println("Student Roll Number is: " + rollNumber);
	}
	
	public static void main(String[] args){
		A1_StudentInfoDemo studentInfo = new A1_StudentInfoDemo();
		studentInfo.setData();
		studentInfo.studentName();
		studentInfo.studentOtherDetails();
	}
}