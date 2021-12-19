package shwetaDharmadhikari;
class StudentInfo{
	String name,middleName,surname,birthday,address;
	int rollNumber = 10;
	
	void setData()
	{
		name = "Shweta";
		middleName = "Sham";
		surname = "Dharmadhikari";
		birthday = "10th Aug 1998";
		address = "A-303,Shree Apartment,Dhanori,Pune";
		rollNumber = 10;
	}	
	
	void studentName()
	{
		System.out.println(name+"\n"+middleName+"\n"+surname);
	}	
	
	void studentOtherDetails()
	{
		System.out.println(birthday+"\n"+address+"\n"+rollNumber);
	}
	
	public static void main(String args[]){
		StudentInfo studentInfo = new StudentInfo();
		studentInfo.setData();
		studentInfo.studentName();
		studentInfo.studentOtherDetails();
	}
}
