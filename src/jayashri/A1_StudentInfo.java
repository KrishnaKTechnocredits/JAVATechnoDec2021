package jayashri;

public class A1_StudentInfo {
	String name, middlename, surname, birthdate, address;
	int rollno;
	
	void setData(){
		name = "Jayashri";
		middlename = "Rajendra";
		surname = "Kotwal";
		birthdate = "12th Oct 1997";
		address = "Pl-23 Lane-6,Dhule";
		rollno = 4;
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
		A1_StudentInfo a1_studentinfo = new A1_StudentInfo();
		a1_studentinfo.setData();
		a1_studentinfo.studentName();
		a1_studentinfo.studentOtherDetails();
	}
}
