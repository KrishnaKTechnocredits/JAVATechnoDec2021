package kalyani;

class StudentInfo{
	
	String name, middlename, surname, birthdate, address;
	int rollNumber;
	
	void setData(){
		name = "Kalyani";
		middlename = "Vitthal";
		surname = "Jalekar";
		birthdate = "11th Feb 1997";
		address = "Guru nagar ward no. 7, yavatmal, 445304";
		rollNumber = 25;
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
	
	public static void main (String args[]){
		StudentInfo studentinfo = new StudentInfo();
		studentinfo.setData();
		studentinfo.studentName();
		studentinfo.studentOtherDetails();
	}
}