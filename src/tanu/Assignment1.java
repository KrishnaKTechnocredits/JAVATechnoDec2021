package tanu;

class Assignment1{
	String Name, middlename, surname, birthdate, address;
	int Rollnumber;
	
	void SetData(){
	 Name= "Sikha";
	 middlename= "Amit";
	 surname="Patel";
	 birthdate="10th Aug 1988";
	 address= "G-809, Heaven Apartment, Baner, Pune.";
	 Rollnumber=34;
		
	}
	void studentName(){
	   
	  System.out.println(Name);
	  System.out.println(middlename);
	  System.out.println(surname);
	
	}
	
	void studentOtherDetails(){
	  System.out.println(birthdate);
	  System.out.println(address);
	  System.out.println(Rollnumber);
	
	}
	
	public static void main(String[] arg){
		Assignment1 studentInfo = new Assignment1();
	  studentInfo.SetData();
	  studentInfo.studentName();
	  studentInfo.studentOtherDetails();
	
	}
	
}
	
	
	
	
	
	