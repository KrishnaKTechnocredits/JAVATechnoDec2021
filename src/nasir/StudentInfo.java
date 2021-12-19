package nasir;
class StudentInfo{
	
	String name,middleName,surname,address,birthdate;
	int rollNo;
	
	void setData(){
		name="Rakesh";
		middleName="Kumar";
		surname="Khanna";
		address="L-103,Khanna soc,Pune";
		rollNo=101;
		birthdate="21 Aug 1982";
	}	
	void studentName(){
		System.out.println("My Student full name is "+name+" "+middleName+" "+surname);
	}	
	void studentOtherDetails(){
		System.out.println("My Student's Address Detail is "+address);
		System.out.println("My Student's Roll Number is "+rollNo);
		System.out.println("My Student's date of birth is "+birthdate);
	}
	
	public static void main(String[]args){
		StudentInfo studentinfo = new StudentInfo();
		studentinfo.setData();
		studentinfo.studentName();
		studentinfo.studentOtherDetails();		
	}
}