class StudentInfo {
	String name, middlename, surname, birthdate, address;
	int rollnumber;
	
	void setData() {
		name = "Abhishek";
		middlename = "N";
		surname = "Anand";
		birthdate = "18th October 1989";
		address = "abc colony varanasi";
		rollnumber = 123456;
	}
	
	void studentName() {
		System.out.println(name);
		System.out.println(middlename);
		System.out.println(surname);
	}
	
	void studentOtherDetails() {
		System.out.println(birthdate);
		System.out.println(address);
		System.out.println(rollnumber);
	}
	
	public static void main (String[] args) {
		StudentInfo studentInfo = new StudentInfo();
		studentInfo.setData();
		studentInfo.studentName();
		studentInfo.studentOtherDetails();
	}
}