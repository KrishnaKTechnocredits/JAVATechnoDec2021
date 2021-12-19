package vrushali;

class A3_StudentInfo{
	
	String name, middleName, surname, birthdate, address;
	int rollNumber;
	
	void setData(){
		name = "Vrushali";
		middleName = "Ramesh";
		surname = "Poke";
		birthdate = "10th Aug 1998";
		address = "B-1705, Mahalunge, Pune.";
		rollNumber = 14;
	}
	
	void studentName(){
		System.out.println(name);
        System.out.println(middleName);
        System.out.println(surname);
	}
	
	void studentOtherDetails(){
		System.out.println(birthdate);
		System.out.println(address);
		System.out.println(rollNumber);
	}
	
	public static void main(String args[]){
		A3_StudentInfo studentInfo = new A3_StudentInfo();
		studentInfo.setData();
		studentInfo.studentName();
		studentInfo.studentOtherDetails();
	}	
}