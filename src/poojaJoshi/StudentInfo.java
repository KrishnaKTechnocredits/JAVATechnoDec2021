package poojaJoshi;

class StudentInfo{
	String Name, MiddleName, Surname;
	String bdate;
	int rollNum;
	String Address;

	void setData(){
		Name="Pooja";
		MiddleName="Nandkishor";
		Surname="Joshi";
		bdate="17th Aug 1992";
		rollNum=12;
		Address="F-802, Splendour county, Wagholi";
	}

	void studentName(){
		System.out.println("Name is : " +Name);
		System.out.println("Middle Name is : " +MiddleName);
		System.out.println("Surname is : " +Surname);
		}

	void studentOtherDetails(){
		System.out.println("Roll no is : "+rollNum);
		System.out.println("Birthdate is : "+bdate);
		System.out.println("Address is : "+Address);
	}

	public static void main (String[] args){
		StudentInfo studentInfo = new StudentInfo();
		studentInfo.setData();
		studentInfo.studentName();
		studentInfo.studentOtherDetails();

		}
}