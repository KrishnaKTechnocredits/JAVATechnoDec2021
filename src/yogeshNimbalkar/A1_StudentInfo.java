package yogeshNimbalkar;
//Assignment -1 : 13th Dec’21
class A1_StudentInfo{

	String name, middleName, surname, birthdate, address;
	int rollNumber;
	
	void setData(){
		name = "Sachin";
		middleName = "Ramesh";
		surname = "Tendulkar";
		birthdate = "24 April 1973";
		address = "19-A, Perry Cross Road, Bandra Mumbai";
		rollNumber = 100;
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
	
	public static void main(String[] args){
		A1_StudentInfo studentinfo = new A1_StudentInfo();
		studentinfo.setData();
		studentinfo.studentName();
		studentinfo.studentOtherDetails();
	}
}