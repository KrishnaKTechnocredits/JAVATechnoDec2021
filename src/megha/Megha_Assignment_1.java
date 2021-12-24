package megha;

class StudentInfo{
	String name, middlename, surname, birthdate, address;
	int roleNumber;
	
	void setData(){
		name = "Megha";
		middlename = "Tanmay";
		surname = "Saha";
		birthdate = "14th February 1990";
		address = "A-404, Impulse Residency, Podwal Road, Dhanori, Pune - 411047";
		roleNumber = 31;
	}
	
	void studentName(){
		System.out.println(name);
		System.out.println(middlename);
		System.out.println(surname);
	}
	
	void studentOtherDetails(){
		System.out.println(birthdate);
		System.out.println(address);
		System.out.println(roleNumber);
	}
	
	public static void main(String[] args){
		StudentInfo studentInfo = new StudentInfo();
		studentInfo.setData();
		studentInfo.studentName();
		studentInfo.studentOtherDetails();
	}
}