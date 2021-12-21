package naquibalam;

class A1_StudentInfo {
	
	String name, middleName, surname, birthDate, address;
	int rollNumber;
	
	void setData(){
		name = "Naquib";
		middleName = "Noor";
		surname = "Sheikh";
		birthDate = "1st Aug 1991";
		address = "Airoli, Navi Mumbai";
		rollNumber = 12345;
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
	
	public static void main (String[] args) {
		A1_StudentInfo studentInfo = new A1_StudentInfo();
		studentInfo.setData();
		studentInfo.studentName();
		studentInfo.studentOtherDetails();
	}
}