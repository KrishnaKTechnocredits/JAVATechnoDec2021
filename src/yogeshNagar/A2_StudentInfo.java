package yogeshNagar;

class StudentInfo{	
	String name,middleName,surname,birthdate,address;
	int rollNumber;
	
	void setData(){
		name = "Yogesh";
		middleName = "Omprakash";
		surname = "Nagar";
		birthdate = "6th Nov 1990";
		address = "36, Sai Royal Palm, Indore.";
		rollNumber = 1112200;		
	}
	
	void studentName(){
		System.out.println( name);
		System.out.println(middleName);
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