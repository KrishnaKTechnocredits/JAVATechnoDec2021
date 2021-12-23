package samir;



class A1_StudentInfo
{
	String name,middlename,surname,birthdate,address;
	int rollnumber;
	void setData(){
		 name= "Shinkha";
		 middlename="Amit";
		 surname="Patel";
		 address="G-809, Heaven Apartment, Baner, Pune.";
	     birthdate="10th Aug 1998";
		 rollnumber= 34;
	}
	 void studentName(){
		System.out.println( name );
		System.out.println(middlename);
		System.out.println(surname);
		
	}
	void studentOtherDetails(){
		System.out.println(birthdate);
		System.out.println(rollnumber);
		
	}
	
	public static void main(String[] args){
		A1_StudentInfo A1_StudentInfo1 =new A1_StudentInfo();
		A1_StudentInfo1.setData();
		
		A1_StudentInfo1.studentName();
		A1_StudentInfo1.studentOtherDetails();
	}
}