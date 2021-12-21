package swapnali;

class StudentInfo{
	String name,middleName,surname,birthDate,address;
	int roll_number;
	
	void setData(){
		name= "Shikha";
		middleName="Amit";
		surname="Patel";
		birthDate="10th Aug 1998";
		address="G-809, Heaven Apartment,Baner,Pune";	
		roll_number=34;
	}
	
	void studentName(){
		System.out.println("Student fullName is: "+name+" "+middleName+" " +surname);
	}
	
	void studentOtherDetails(){
		System.out.println("Birthdate: "+birthDate);
		System.out.println("Address: "+address);
		System.out.println("Roll_Number: "+roll_number);
	}
	
	public static void main(String[] args){
		StudentInfo student = new StudentInfo();
		student.setData();
		student.studentName();
		student.studentOtherDetails();
	}



}