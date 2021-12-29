package ashwini;
public class A1_StudentInfo 
	{
		String Name="Shikha";
		String middlename="Amit";
		String surname="Patel";
		String birthdate="10th Aug 1998";
		String address="G-809, Heaven Apartment, Baner, Pune";
		int rollNumber=34;
		
		void studentName()
		{
			System.out.println(Name);
			System.out.println(middlename);
			System.out.println(surname);
		}
		
		void studentOtherDetails()
		{
			System.out.println(birthdate);
			System.out.println(address);
			System.out.println(rollNumber);
		}
		
		public static void main(String[] args)
		{
			A1_StudentInfo si=new A1_StudentInfo();
			si.studentName();
			si.studentOtherDetails();
		}
	}
