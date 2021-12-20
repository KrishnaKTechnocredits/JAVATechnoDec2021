package ashish;

class A1_StudentInfo{
	
	String name, middleName, surname, birthDate, address;
	int rollNumber;
	
	void setData(){
		name = "Ashish";
		middleName = "Uday";
		surname = "Brahme";
		birthDate = "28th Oct 1992";
		address = "G-809, Heaven Apartment, Baner, Pune.";
		rollNumber = 28;
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
	
	public static void main(String[] args){
		A1_StudentInfo studentInfo = new A1_StudentInfo();
		studentInfo.setData();
		studentInfo.studentName();
		studentInfo.studentOtherDetails();
	}
}