package rohini;

class Rohini_Assignment1
{

   String name,middleName,surname,address,birthDate;
   int rollNumber;
   
     void setData()
	   { 
	      name="Rohini";
          middleName="Suraj";
		  surname="KoreMali";
		  birthDate="13th Aug 1994";
		  rollNumber=9;
		  address="Flat 303,Rajgad Nx,Talegaon Dabhade,Pune,Pin:410506";
	   }
		  
		  
	 void studentName()
	  {  
	     System.out.println("Student Name info is: ");
	     System.out.println("Name :"+name);
		 System.out.println("MiddleName :"+middleName);
		 System.out.println("Surname :"+surname);
	  } 
		 
     void studentOtherDetails()
	  {  
	     System.out.println("Student other details are: ");
		 System.out.println("rollNumber :"+rollNumber);
		 System.out.println("birthdate :"+birthDate);
	     System.out.println("address :"+address);
	  } 		 
    
	  public static void main(String[] args)
      {
		Rohini_Assignment1 stdInfo = new Rohini_Assignment1();
		stdInfo.setData();
		stdInfo.studentName();
		stdInfo.studentOtherDetails();
	  }



		  
	   
   

}