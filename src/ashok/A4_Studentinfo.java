package ashok;
class StudentInfo{
	int rollNumber;
	String name, midName, surname, birthdate,address;
	
	void setData(){
		name = "James";
		midName = "Ramesh";
		surname = "Bond";
		birthdate = "10th Aug 1998";
		address = "G-909, Heaven Apartment, Baner,Pune";
		rollNumber = 7;			
	}
	
	void studentName(){
		System.out.println(name);
		System.out.println(midName);
		System.out.println(surname);
	}
	
	void studentOtherDetails(){
		System.out.println(birthdate);
		System.out.println(address);
		System.out.println(rollNumber);
	}
	
	public static void main(String[] args){
		StudentInfo studentInfo = new StudentInfo();
		studentInfo.setData();
		studentInfo.studentName();
		studentInfo.studentOtherDetails();
	}
}
