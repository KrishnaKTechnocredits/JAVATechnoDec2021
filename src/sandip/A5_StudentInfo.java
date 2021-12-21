package sandip;

class A5_StudentInfo{

	String name;
	String middleName;
	String surname;
	String birthDate;
	String address;
	int rollNumber;
	
	void setData(){
		name = "Sandip";
		middleName = "Vitthal";
		surname = "Patil";
		birthDate = "1st April 1991";
		address = "B.T. Kawade Road,Pune";
		rollNumber = 29;
	}	
	
	void studentName(){
		System.out.println(name);
		System.out.println(middleName);
		System.out.println(surname);
	}
		
	void studentOtherDetails(){
		System.out.println(birthDate);
		System.out.println(address);
		System.out.println(rollNumber);
	}
		
	public static void main(String[]args){
		A5_StudentInfo studentinfo_1 = new A5_StudentInfo();
		studentinfo_1.setData();
		studentinfo_1.studentName();
		studentinfo_1.studentOtherDetails();
	}
	
}