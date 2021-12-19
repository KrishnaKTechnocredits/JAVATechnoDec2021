package vivek;

class Assignment1{

	String name,middleName,surName,birthDate,address;
	int rollNumber;
	
	void setData(){
		name = "Vivek";
		middleName = "Kumar";
		surName = "Singh";
		birthDate = "25th Dec 1993";
		address = "A-904 , Silver Stone, Hnadewari, Pune";
		rollNumber = 127;
	}
	
	void studentName(){
		System.out.println(name);
		System.out.println(middleName);
		System.out.println(surName);
	}
	
	void studentOtherDetails(){
		System.out.println(birthDate);
		System.out.println(address);
		System.out.println(rollNumber);
	}
	
	public static void main(String[] args){
		Assignment1 student = new Assignment1();
		student.setData();
		student.studentName();
		student.studentOtherDetails();
	}
}