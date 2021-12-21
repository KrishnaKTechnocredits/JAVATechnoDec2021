package krishna;

class A5_2_StudentInfo{
	String name, middlename, surname, address, birthdate;
	int rollnumber;
	
	void setData(){
		name= "Sikha";
		middlename="Amit";
		surname="Patel";
		birthdate="10th Aug 1998";
		address="G-809, Heaven Apartment, Baner, Pune";
		rollnumber=34;
	}			
	void studentName(){
		System.out.println("The Student Name is " +name);
		System.out.println("The Student Middle Name is " +middlename);
		System.out.println("The Student Sur Name is " +surname);
	}	
			
	void studentOtherDetails(){
		System.out.println("Date of Birth is " +birthdate);
		System.out.println("Student Address is " +address);
		System.out.println("Student Roll Number is " +rollnumber);
	}
	
	public static void main (String[] args){
		A5_2_StudentInfo studentInfo = new A5_2_StudentInfo();
		studentInfo.setData();
		studentInfo.studentName();
		studentInfo.studentOtherDetails();
	}
}