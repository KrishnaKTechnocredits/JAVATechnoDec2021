package apurva;

class A1_StudentInfo{
	String firstname, middlename, surname;
	String birthdate,address;
	int rollno;
	
	void setData(){
		firstname ="Apurva";
		middlename ="Anil";
		surname ="Deshmukh";
		birthdate ="25th Jan 1994";
		address ="Radha Nagar, VMV Road, AMT";
		rollno =17;
	}
	
	void studentName(){
		System.out.println(firstname);
		System.out.println(middlename);
		System.out.println(surname);
	}
	
	void studentOtherDetails(){
		System.out.println(birthdate);
		System.out.println(address);
		System.out.println(rollno);
	}
	
	public static void main(String[] args){
		A1_StudentInfo studentInfo = new A1_StudentInfo();
		studentInfo.setData();
		studentInfo.studentName();
		studentInfo.studentOtherDetails();
	}
}