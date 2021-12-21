package raksha;

class A3_StudentInfo
{

	String name,middleName,surname,address,birthDate;
	int rollnumber;
		
	void setData()
	{
		name = "Raksha";
		middleName = "Santosh";
		surname = "Wani";
		address = "A-101,Akshay Heights,Mhatoba chouk,Wakad";
		birthDate = "13th Jan 1993";
		rollnumber = 15;
	}
	
	void studentName()
	{
		System.out.println(name);
		System.out.println(middleName);
		System.out.println(surname);
	}
	
	void studentOtherDetails()
	{
		System.out.println(birthDate);
		System.out.println(address);
		System.out.println(rollnumber);
	}
	
	public static void main(String[] args)
	{ 
		A3_StudentInfo studentInfo = new A3_StudentInfo();
		studentInfo.setData();
		studentInfo.studentName();
		studentInfo.studentOtherDetails();
	}
}
