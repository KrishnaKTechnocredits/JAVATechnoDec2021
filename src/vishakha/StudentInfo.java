package vishakha;

class StudentInfo{

	String name, middleName, surname, address, birthDate;
	int rollNumber;
	
	void setData(){
		name = "Vishakha";
		middleName = "Rahul";
		surname = "Rokade";
		birthDate = "18th August 1996";
		address = "H.no.1078/10/2, Krishna Niwas, Kalewadi";
		rollNumber = 88;
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
		StudentInfo studentInfo = new StudentInfo();
		studentInfo.setData();
		studentInfo.studentName();
		studentInfo.studentOtherDetails();
	}
}
