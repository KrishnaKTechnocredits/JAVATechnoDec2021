package pranoti;

class A1_StudentInfo{
	
	String name,middlename,surname,birthdate,address;
	int rollNumber;
	
	void setData(){
		name = "Pranoti";
		middlename = "Rajaram";
		surname = "Patil";
		birthdate = "10th Sept 1997";
		address = "S-349,Shahupuri,Kolhapur.";
		rollNumber = 10;
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