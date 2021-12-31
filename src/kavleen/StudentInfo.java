package kavleen;

class StudentInfo
{
	String  name , middlename , surname , birthdate , address ;
	int rollno ;
	void setData()
	{	
	  name = "Shikha";
	  middlename = "Mahajan";
	  surname = "Batra";
	  birthdate = "10th July 1994";
	  address = "G-809, Heaven Apartment, Baner, Pune";
	  rollno = 52;
	}
	
	void studentName()
	{
		System.out.println(name);
		System.out.println(middlename);
		System.out.println(surname);
		
	}
	
	void studentOtherDetails()
	{
		System.out.println(birthdate);
		System.out.println(address);
		System.out.println(rollno);
		
	}
	 public static void main(String[] args)
	 {
		 
	    StudentInfo StudentInfo = new StudentInfo();
		StudentInfo.setData();
		StudentInfo.studentName();
		StudentInfo.studentOtherDetails();
	 }
		
	 }
	 
	

