package monikaArkade;

class A1_StudentInfo{
	
	String name, middlename, surname, address, birthdate;
	int rollNumber;
	
	void setData(){
		name = "Monika";
		middlename = "Balasaheb";
		surname = "Arkade";
		birthdate = "1st Feb 1997";
		address = "Abhimala Nivas, Sinhgad road,Pune.";
		rollNumber = 2080;
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
	
	public static void main(String[]args){
		A1_StudentInfo studentInfo = new A1_StudentInfo();
		studentInfo.setData();
		studentInfo.studentName();
		studentInfo.studentOtherDetails();
	}
}