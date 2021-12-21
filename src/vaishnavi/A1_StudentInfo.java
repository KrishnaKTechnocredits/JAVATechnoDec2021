package vaishnavi;

public class A1_StudentInfo {

	String name,middlename,surname,birthdate,address;
	int rollNumber;

	void setData(){
		name = "Shikha";
		middlename = "Amit";
		surname = "Patel";
		birthdate = "10th Aug 1998";
		address = "G-809, Heaven Apartment, Baner, Pune";
		rollNumber = 34;
	}
	
	void studentName(){
		System.out.println(name);
		System.out.println(middlename);
		System.out.println(surname);
	}

	void studentOtherDetails(){
		System.out.println(birthdate);
		System.out.println(address);
		System.out.println(rollNumber);
	}

	public static void main(String[] args){
		A1_StudentInfo studentInfo = new A1_StudentInfo();
		studentInfo.setData();
		studentInfo.studentName();
		studentInfo.studentOtherDetails();
	}
}
