package sagarAcharya;

class StudentInfo{
	String Name,MiddleName,Surname,Birthdate,Address ;
	int rollNumber;
	
	void setData(){
		Name = "Sagar";
		MiddleName = "Paresh";
		Surname = "Acharya";
		Birthdate = "18th Apr 1993";
		Address = "B-18,Vipul Apt,Bhakti Marg,Mulund-West,Mumbai";
		rollNumber = 18;
	}
	
	void studentName(){
		System.out.println(Name +"\n"+ MiddleName +"\n"+ Surname);
	}
	
	void studentOtherDetails(){
		System.out.println(Birthdate + "\n" + Address +"\n" + rollNumber);
	}
	
	public static void main(String[] args){
		StudentInfo studentinfo = new StudentInfo();
		studentinfo.setData();
		studentinfo.studentName();
		studentinfo.studentOtherDetails();
	}
}