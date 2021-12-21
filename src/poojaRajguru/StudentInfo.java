package poojaRajguru;

class StudentInfo{
	String name,middlename,surname,birthdate,address;
	int rollno;
	
	void setData(){
		name = "Pooja";
		middlename = "Rajendra";
		surname = "Rajguru";
		birthdate = "11 May 1993";
		address = "Plot No-403,Vishu Hights,Katraj,Pune";
		rollno = 71;
	}
	
	void studentName(){
		System.out.println(name);
		System.out.println(middlename);
		System.out.println(surname);		
	}
	
	void studentOtherDetails(){
		System.out.println(birthdate);
		System.out.println(address);
		System.out.println(rollno);
	}
	
	public static void main(String[] args){
		StudentInfo studentinfo = new StudentInfo();
		studentinfo.setData();
		studentinfo.studentName();
		studentinfo.studentOtherDetails();
	}
}